package programa;

import java.util.LinkedList;
import java.util.Random;
import java.util.stream.Collectors;

public class School {

    public static LinkedList<Teacher> teachers = new LinkedList<>();
    public static Student[] students = new Student[15];
    public static final String[] PREDMETI = {"БЕЛ", "МАТ", "ФА", "ХООС", "БЗО",
        "ГИ", "ИЦ", "ФВС", "ИНФ", "ИТ", "АЕ", "НЕ", "ФИЛ"};

    public School()
    {
        
    }
    
    private void addPredmetToStudents(String name, Predmet predmet){
        getStudent(name).getPredmeti().add(predmet);
    }

    private void removePredmetFromStudents(String name, Predmet predmet) {
        getStudent(name).getPredmeti().remove(predmet);
    }

    private void editChasoveOfPredmetInStudents(String name, Predmet predmet) {
        getStudent(name).getPredmeti().get(predmet).setChasove(predmet.getChasove());
    }

    public static void addStudentsToFile()
    {
        String[] lines = new String[16];
        lines[0] = "name,predmet\n";
        for (int i = 0; i < 15; ++i)
        {
            lines[i + 1] = "";
            lines[i + 1] += School.students[i].getName()+",[";
            for (int j = 0; j < School.students[i].getPredmeti().size(); ++j)
            {
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
    
    public static void addTeachersToFile()
    {
        String[] lines = new String[teachers.size() + 1];
        lines[0] = "name,predmet\n";
        int br = 1;
        for (Teacher teacher: teachers)
        {
            lines[br] = "";
            lines[br] += teacher.getName()+",[";
            lines[br] += teacher.getPredmet().getName();
            lines[br] += ",";
            lines[br] += teacher.getPredmet().getChasove() + "";
            lines[br] += "]\n";
            br ++;
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
            String arr[][] = generateStudentsSchedule(i);
            arr = scramble(arr);
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 7; k++) {
                    System.out.print(arr[j][k] + " ");
                }
                System.out.println("");
            }
            System.out.println("\n##########################\n");
        }
    }

    private String[][] generateStudentsSchedule(int index) {
        Student klas = students[index];
        Predmet predmet;
        for (int i = 0; i < klas.getPredmeti().size(); i++) {
            predmet = klas.getPredmeti().get(i);
            int br = 0;
            for (String x : teachers.stream().map(x -> x.getPredmet())
                    .map(x -> x.getName()).collect(Collectors.toCollection(LinkedList::new))) {
                if (x.equals(predmet.getName())) {
                    addToSchedule(teachers.get(br), index);
                }
                if (klas.getPredmeti().get(predmet).getChasove() == 0) {
                    break;
                }
                br++;
            }
        }
        return klas.getArr();

    }

    public void addToSchedule(Teacher teacher, int classIndex) {
        String subject = teacher.getPredmet().getName();
        Student s = students[classIndex];
        int klasChasove = s.getPredmeti().get(teacher.getPredmet()).getChasove();
        int teacherChasove = teacher.getPredmet().getChasove();
        int den = 0, chas = 0;
        while (s.getArr()[den][chas] != null) {
            chas++;
            if (chas >= 7) {
                den++;
                chas = 0;
            }
        }
        if (klasChasove <= teacherChasove) {
            teacher.getPredmet().setChasove(teacherChasove - klasChasove);
            while (klasChasove > 0) {
                s.setArr(den, chas, subject);
                teacher.setArr(den, chas, subject);
                chas++;
                if (chas >= 7) {
                    den++;
                    chas = 0;
                }
                klasChasove--;
            }
            s.getPredmeti().get(teacher.getPredmet()).setChasove(0);
        } else {
            s.getPredmeti().get(teacher.getPredmet()).setChasove(klasChasove - teacherChasove);
            while (teacherChasove > 0) {
                s.setArr(den, chas, subject);
                teacher.setArr(den, chas, subject);
                chas++;
                if (chas >= 7) {
                    den++;
                    chas = 0;
                }
                teacherChasove--;
            }
            teacher.getPredmet().setChasove(0);
        }
    }

    private String[][] scramble(String[][] arr) {
        //scrambles the subjects and then if there are multiple instances of the same subject block them together
        for (int i = 0; i < 100; i++) {
            Random rand = new Random();
            arr = swap(arr, rand.nextInt(5), rand.nextInt(7), rand.nextInt(5), rand.nextInt(7));

        }
        arr = merge(arr);
        return arr;
    }

    private String[][] swap(String[][] arr, int i, int j, int k, int l) {
        String temp;
        temp = arr[i][j];
        arr[i][j] = arr[k][l];
        arr[k][l] = temp;
        return arr;
    }

    public static String[][] merge(String[][] arr) {
        String[][] merged = new String[5][7];
        for (int den = 0; den < 5; den++) {
            String[] mergedDen = new String[7];
            int index = 0;
            for (int chas = 0; chas < 7; chas++) {
                String urok = arr[den][chas];
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
