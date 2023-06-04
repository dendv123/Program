package programa;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class School {

    public static LinkedList<Teacher> teachers = new LinkedList<>();
    public static Student[] students = new Student[15];
    public static final String[] PREDMETI = {"БЕЛ", "МАТ", "ФА", "ХООС", "БЗО",
        "ГИ", "ИЦ", "ФВС", "ИНФ", "ИТ", "АЕ", "НЕ", "ФИЛ"};
    
    private void addPredmetToStudents(String name, Predmet predmet){
        getStudent(name).getPredmeti().add(predmet);
    }

    private void removePredmetFromStudents(String name, Predmet predmet){
        getStudent(name).getPredmeti().remove(predmet);
    }

    private void editChasoveOfPredmetInStudents(String name, Predmet predmet){
        getStudent(name).getPredmeti().get(predmet).setChasove(predmet.getChasove());
    }
    
    private Student getStudent(String name)
    {
        Student s = new Student();
        for (int i = 0; i < students.length; ++i)
        {
            if (name.equals(students[i].getName())) s = students[i];
        }
        return s;
    }
    
    public void generateSchedule() {
        for (int i = 0; i < 15; i++) {
            String arr[][] = generateStudentsSchedule(i);
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 7; k++) {
                    System.out.println(arr[j][k]);
                }
            }
        }
    }

    private String[][] generateStudentsSchedule(int index) {
        Student klas = students[index];
        Predmet predmet;
        String arr[][] = klas.getArr();
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
                br ++;
            //i sega trybva da dobavya uchitelya kum purvoto svobodno vreme na uchenicite
        }
        //generira se programata za klasa i se zaema ot vremeto na uchitelite
        }
        return klas.getArr();
        
    }

    public void addToSchedule(Teacher teacher, int classIndex)
    {
        String subject = teacher.getPredmet().getName();
        Student s = students[classIndex];
        int klasChasove = s.getPredmeti().get(teacher.getPredmet()).getChasove();
        int teacherChasove = teacher.getPredmet().getChasove();
        if(klasChasove <= teacherChasove){
            teacher.getPredmet().setChasove(teacherChasove - klasChasove);
            int den = 0, chas = 0;
            while(klasChasove > 0){
                s.setArr(den, chas, subject);
                teacher.setArr(den, chas, subject);
                chas++;
                if(chas >= 7){
                    den++;
                    chas = 0;
                }
                klasChasove--;
            }
            s.getPredmeti().get(teacher.getPredmet()).setChasove(0);
        } else {
            s.getPredmeti().get(teacher.getPredmet()).setChasove(klasChasove - teacherChasove);
            int den = 0, chas = 0;
            while(teacherChasove > 0){
                s.setArr(den, chas, subject);
                teacher.setArr(den, chas, subject);
                chas++;
                if(chas >= 7){
                    den++;
                    chas = 0;
                }
                teacherChasove--;
            }
            teacher.getPredmet().setChasove(0);
        }
    }
    
}