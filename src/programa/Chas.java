package programa;

public class Chas {
    private String predmet;
    private String teacherOrStudents;

    public Chas(String predmet, String teacherOrStudents) {
        this.predmet = predmet;
        this.teacherOrStudents = teacherOrStudents;
    }

    public Chas(){
        this("", "");
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getTeacherOrStudents() {
        return teacherOrStudents;
    }

    public void setTeacherOrStudents(String teacherOrStudents) {
        this.teacherOrStudents = teacherOrStudents;
    }
}