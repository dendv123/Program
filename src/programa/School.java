package programa;

import java.util.LinkedList;
import java.util.Random;
import java.util.stream.Collectors;

public class School {

    public static LinkedList<Teacher> teachers = new LinkedList<>();
    public static Student[] students = new Student[15];
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

    public static Student getStudent(String name) {
        Student s = new Student();
        for (int i = 0; i < 15; ++i) {
            if (name.equalsIgnoreCase(students[i].getName())) {
                s = students[i];
            }
        }
        return s;
    }

    public void generateSchedule() {
        for (int i = 0; i < 15; i++) {
            System.out.println(students[i].getName());
            Chas arr[][] = generateStudentsSchedule(i);
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 7; k++) {
                    if(arr[j][k] == null){
                        System.out.print("- \t");
                    }else{
                        System.out.print(arr[j][k].getPredmet() + "\t");
                    }
                }
                System.out.println("");
            }
            System.out.println("\n##########################\n");
        }
    }

    private Chas[][] generateStudentsSchedule(int studentsIndex) {
        Student klas = students[studentsIndex];
        Predmet predmet;
        for (int i = 0; i < klas.getPredmeti().size(); i++) {
            predmet = klas.getPredmeti().get(i);
            int teacherIndex = 0;
            for (String x : teachers.stream().map(x -> x.getPredmet())
                    .map(x -> x.getName()).collect(Collectors.toCollection(LinkedList::new))) {
                if (x.equals(predmet.getName())) {
                    addToSchedule(teachers.get(teacherIndex), studentsIndex);
                }
                if (klas.getPredmeti().get(predmet).getChasove() == 0) {
                    break;
                }
                teacherIndex++;
            }
        }
        return klas.getArr();

    }

    public void addToSchedule(Teacher teacher, int classIndex) {
        String predmet = teacher.getPredmet().getName();
        Student s = students[classIndex];
        int klasChasove = s.getPredmeti().get(teacher.getPredmet()).getChasove();
        int teacherChasove = teacher.getPredmet().getChasove();
        int den, chas;
        Random rand = new Random();
        if (klasChasove <= teacherChasove) {
            teacher.getPredmet().setChasove(teacherChasove - klasChasove);
            while (klasChasove > 0) {
                den = rand.nextInt(5);
                chas = rand.nextInt(7);
                if (teacher.getArr()[den][chas] == null) {
                    s.setArr(den, chas, new Chas(predmet, teacher.getName()));
                    teacher.setArr(den, chas, new Chas(predmet, s.getName()));
                    klasChasove--;
                }
            }
            s.getPredmeti().get(teacher.getPredmet()).setChasove(0);
        } else {
            s.getPredmeti().get(teacher.getPredmet()).setChasove(klasChasove - teacherChasove);
            while (teacherChasove > 0) {
                den = rand.nextInt(5);
                chas = rand.nextInt(7);
                if (teacher.getArr()[den][chas] == null) {
                    s.setArr(den, chas, new Chas(predmet, teacher.getName()));
                    teacher.setArr(den, chas, new Chas(predmet, s.getName()));
                    teacherChasove--;
                }
            }
            teacher.getPredmet().setChasove(0);
        }
    }

    public static Chas[][] merge(Chas[][] arr) {
        Chas[][] merged = new Chas[5][7];
        for (int den = 0; den < 5; den++) {
            Chas[] mergedDen = new Chas[7];
            int index = 0;
            for (int chas = 0; chas < 7; chas++) {
                Chas urok = arr[den][chas];
                if (urok != null) {
                    mergedDen[index++] = urok;
                    arr[den][chas] = null;
                    for (int nextChas = chas + 1; nextChas < 7; nextChas++) {
                        if (urok.equals(arr[den][nextChas])) {
                            mergedDen[index++] = arr[den][nextChas];
                            arr[den][nextChas] = null;
                        }
                    }
                }
            }
            merged[den] = mergedDen;
        }

        return merged;
    }
}
