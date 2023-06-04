package programa;

import java.util.LinkedList;

public class School {

    private LinkedList<Teacher> teachers = new LinkedList<>();
    private Student[] students = new Student[15];
    public static final String[] PREDMETI = {"БЕЛ", "МАТ", "ФА", "ХООС", "БЗО",
        "ГИ", "ИЦ", "ФВС", "ИНФ", "ИТ", "АЕ", "НЕ", "ФИЛ"};

    public void generateSchedule() {
        for (int i = 0; i < 15; i++) {
            generateStudentsSchedule(i);
            //vsichko se dobavya v tekstov dokument moje bi?
        }
    }

    private String[][] generateStudentsSchedule(int index) {
        Student klas = students[index];
        String predmet;
        String arr[][] = klas.getArr();
        for (int i = 0; i < klas.getPredmeti().size(); i++) {
            predmet = klas.getPredmeti().get(i).getName();
            teachers.stream().map(x -> x.getPredmet());
            //i sega trybva da dobavya uchitelya kum purvoto svobodno vreme na uchenicite
        }
        //generira se programata za klasa i se zaema ot vremeto na uchitelite
        return klas.getArr();
    }

    public LinkedList toList(){
        LinkedList<Teacher> list = new LinkedList<>();
        for (int j = 0; j < teachers.size(); j++) {
            list.add(teachers.get(j));
        }
        return list;
    }
}