package programa;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class School {

    private TeacherList teachers = new TeacherList();
    private StudentsArr students = new StudentsArr();
    private String[] predmeti = {"BUL", "MAT", "PHY", "CHE", "BIO", "GEO", "HIS", "SPO", "INF", "IT"};

    public String[] getPredmeti(){
        return predmeti;
    }

    public Students getStudents(String name){
        return students.getStudents(name);
    }

    public void addStudents(String name){
        students.add(name);
    }

    public void removeStudents(String name){
        students.remove(name);
    }

    public void addPredmetToStudents(String name, String predmet, int chasove){
        students.getStudents(name).getPredmeti().add(predmet, chasove);
    }

    public void removePredmetFromStudents(String name, String predmet){
        students.getStudents(name).getPredmeti().remove(predmet);
    }

    public void editChasoveOfPredmetInStudents(String name, String predmet, int chasove){
        students.getStudents(name).getPredmeti().get(predmet).setChasove(chasove);
    }

    public Teacher getTeacher(String name){
        return teachers.get(name);
    }

    public void addTeacher(String name, String predmet, int chasove){
        teachers.add(name, predmet, chasove);
    }

    public void removeTeacher(String name){
        teachers.remove(name);
    }

    public void editTeacher(String name, String predmet, int chasove){
        teachers.get(name).setPredmet(predmet);
        teachers.get(name).setChasove(chasove);
    }

    public void generateSchedule() {
        for (int i = 0; i < 15; i++) {
            String arr[][] = generateStudentsSchedule(i);
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 7; k++) {
                    System.out.println(arr[j][k]);
                }
            }
            //vsichko se dobavya v tekstov dokument moje bi?
        }
    }

    private String[][] generateStudentsSchedule(int index) {
        Students klas = students.getStudents(index);
        String predmet;
        LinkedList<Teacher> list = toLinkedList();
        for (int i = 0; i < klas.getPredmeti().size(); i++) {
            predmet = klas.getPredmeti().get(i).getPredmet();
            int br = 0;
            for (String x : list.stream().map(x -> x.getPredmet()).collect(Collectors.toCollection(LinkedList::new))) {
                if (x.equals(predmet)) {
                    klas.addToSchedule(teachers.get(br));
                }
                if (klas.getPredmeti().get(predmet).getChasove() == 0) {
                    break;
                }
                br++;
            }
        }
        return klas.getArr();
    }

    private LinkedList toLinkedList() {
        LinkedList<Teacher> list = new LinkedList();
        for (int j = 0; j < teachers.size(); j++) {
            list.add(teachers.get(j));
        }
        return list;
    }
}
