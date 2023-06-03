package programa;

import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class School {

    private TeacherList teachers = new TeacherList();
    private StudentsArr students = new StudentsArr();
    private String[] predmeti = {"BUL", "MAT", "PHY", "CHE", "BIO", "GEO", "HIS", "SPO", "INF", "IT"};

    public void generateSchedule() {
        for (int i = 0; i < 15; i++) {
            generateStudentsSchedule(i);
            //vsichko se dobavya v tekstov dokument moje bi?
        }
    }

    private String[][] generateStudentsSchedule(int index) {
        Students klas = students.getStudents(index);
        String predmet;
        String arr[][] = klas.getArr();
        for (int i = 0; i < klas.getPredmeti().size(); i++) {
            predmet = klas.getPredmeti().get(i).getPredmet();
            LinkedList<Teacher> list = toLinkedList();
            int br = 0;
            for (String x: list.stream().map(x -> x.getPredmet()).collect(Collectors.toCollection(LinkedList::new))) {
                if(x.equals(predmet)){
                    klas.addToSchedule(teachers.get(br));
                }
                br++;
            }
            //i sega trybva da dobavya uchitelya kum purvoto svobodno vreme na uchenicite
        }
        //generira se programata za klasa i se zaema ot vremeto na uchitelite
        return klas.getArr();
    }

    public LinkedList toLinkedList(){
        LinkedList<Teacher> list = new LinkedList();
        for (int j = 0; j < teachers.size(); j++) {
            list.add(teachers.get(j));
        }
        return list;
    }
}