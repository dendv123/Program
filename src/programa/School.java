package programa;

import fileHandler.FileOperations;
import java.util.LinkedList;
import java.util.Random;
import java.util.stream.Collectors;

public class School {

    public static LinkedList<Teacher> teachers = new LinkedList<>();
    public static Students[] students = new Students[15];
    public static final String[] Predmeti = {"БЕЛ", "МАТ", "ФА", "ХООС", "БЗО",
        "ГИ", "ИЦ", "ФВС", "ИНФ", "ИТ", "АЕ", "НЕ", "ФИЛ"};

    public School() {

    }

    public static void addStudentsToFile() {
        String[] lines = new String[16];
        lines[0] = "name,predmet\n";
        for (int i = 0; i < 15; ++i) {
            lines[i + 1] = "";
            lines[i + 1] += School.students[i].getName() + ",[";
            for (int j = 0; j < School.students[i].getPredmeti().size(); ++j) {
                lines[i + 1] += "[";
                lines[i + 1] += School.students[i].getPredmeti().get(j).getName();
                lines[i + 1] += ",";
                lines[i + 1] += School.students[i].getPredmeti().get(j).getChasove();
                lines[i + 1] += "]";
            }
            lines[i + 1] += "]\n";
        }
        FileOperations.addToFile(lines, "src//files//students.csv");
    }

    public static void addTeachersToFile() {
        String[] lines = new String[teachers.size() + 1];
        lines[0] = "name,predmet\n";
        int br = 1;
        for (Teacher teacher : teachers) {
            lines[br] = "";
            lines[br] += teacher.getName() + ",[";
            lines[br] += teacher.getPredmet().getName();
            lines[br] += ",";
            lines[br] += teacher.getPredmet().getChasove() + "";
            lines[br] += "]\n";
            br++;
        }
        FileOperations.addToFile(lines, "src//files//teachers.csv");
    }

    public static Students getStudent(String name) {
        Students s = new Students();
        for (int i = 0; i < 15; ++i) {
            if (name.equalsIgnoreCase(students[i].getName())) {
                s = students[i];
            }
        }
        return s;
    }

    public static Teacher getTeacher(String name) {
        for (Teacher teacher : teachers) {
            if(name.equals(teacher.getName())){
                return teacher;
            }
        }
        return null;
    }

    public static void generateSchedule() {
        for (int i = 0; i < 15; i++) {
            System.out.println(students[i].getName());
            Chas arr[][] = generateStudentsSchedule(i);
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 7; k++) {
                    if (arr[j][k] == null) {
                        System.out.print("- \t");
                    } else {
                        System.out.print(arr[j][k].getPredmet() + "\t");
                    }
                }
                System.out.println("");
            }
            System.out.println("\n##########################\n");
        }
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getName());
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 7; k++) {
                    if (teacher.getArr()[j][k] == null) {
                        System.out.print("- \t");
                    } else {
                        System.out.print(teacher.getArr()[j][k].getPredmet() + "\t");
                    }
                }
                System.out.println("");
            }
            System.out.println("\n##########################\n");
        }
    }

    private static Chas[][] generateStudentsSchedule(int studentsIndex) {
        Students klas = students[studentsIndex];
        Predmet predmet;
        for (int i = 0; i < klas.getPredmeti().size(); i++) {
            predmet = klas.getPredmeti().get(i);
            int teacherIndex = 0;
            for (String x : teachers.stream().map(x -> x.getPredmet())
                    .map(x -> x.getName()).collect(Collectors.toCollection(LinkedList::new))) {
                if (x.equals(predmet.getName())) {
                    checkSchedule(teachers.get(teacherIndex), studentsIndex);
                }
                if (klas.getPredmeti().get(predmet).getChasove() == 0) {
                    break;
                }
                teacherIndex++;
            }
        }
        return klas.getArr();

    }

    public static void checkSchedule(Teacher teacher, int classIndex) {

        Students klas = students[classIndex];
        int klasChasove = klas.getPredmeti().get(teacher.getPredmet()).getChasove();
        int teacherChasove = teacher.getPredmet().getChasove();

        if (klasChasove <= teacherChasove) {
            teacher.getPredmet().setChasove(teacherChasove - klasChasove);
            while (klasChasove > 0) {
                if (addToSchedule(klas, teacher)) {
                    klasChasove--;
                }
            }
            klas.getPredmeti().get(teacher.getPredmet()).setChasove(0);
        } else {
            klas.getPredmeti().get(teacher.getPredmet()).setChasove(klasChasove - teacherChasove);

            while (teacherChasove > 0) {
                if (addToSchedule(klas, teacher)) {
                    teacherChasove--;
                }
            }

            teacher.getPredmet().setChasove(0);
        }
    }

    private static boolean addToSchedule(Students klas, Teacher teacher) {
        String predmet = teacher.getPredmet().getName();
        Random rand = new Random();
        int den = rand.nextInt(5);
        for (int start = 0; start < 7; start++) {
            try {
                if (klas.getArr()[den][start].getPredmet().equals(predmet)) {
                    int end = start;
                    try {
                        while (klas.getArr()[den][end + 1].getPredmet().equals(predmet)) {
                            end++;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        end = 6;
                    }
                    int empty = 0;
                    for (; empty < 7; empty++) {
                        if (klas.getArr()[den][empty] == null) {
                            break;
                        } else if (klas.getArr()[den][empty] != null && empty == 6) {
                            return false;
                        }
                    }
                    if (start == 1) {
                        klas.getArr()[den][empty] = klas.getArr()[den][0];
                        klas.getArr()[den][0] = new Chas(predmet, teacher.getName());
                        teacher.getArr()[den][empty] = teacher.getArr()[den][0];
                        teacher.getArr()[den][0] = new Chas(predmet, klas.getName());
                    } else if (end == 5) {
                        klas.getArr()[den][empty] = klas.getArr()[den][6];
                        klas.getArr()[den][6] = new Chas(predmet, teacher.getName());
                        teacher.getArr()[den][empty] = teacher.getArr()[den][6];
                        teacher.getArr()[den][6] = new Chas(predmet, klas.getName());
                    } else {
                        klas.getArr()[den][empty] = new Chas(predmet, teacher.getName());
                        teacher.getArr()[den][empty] = new Chas(predmet, klas.getName());
                    }
                }
            } catch (NullPointerException e) {

            }
        }
        for (int empty = 0; empty < 7; empty++) {
            if (klas.getArr()[den][empty] == null) {
                klas.getArr()[den][empty] = new Chas(predmet, teacher.getName());
                teacher.getArr()[den][empty] = new Chas(predmet, klas.getName());
                return true;
            } else if (empty == 6) {
                return false;
            }
        }

        return true;
    }
}
