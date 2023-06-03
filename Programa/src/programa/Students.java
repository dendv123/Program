package programa;

public class Students {

    private Predmeti predmeti = new Predmeti();
    private String[][] arr = new String[5][7];
    private String name;

    public Students(Predmeti predmeti, String name) {
        setName(name);
        setPredmeti(predmeti);
    }

    public Students() {
        this(new Predmeti(), "");
    }

    public Predmeti getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(Predmeti predmeti) {
        this.predmeti = predmeti;
    }

    public String[][] getArr() {
        return arr;
    }

    public void setArr(int den, int chas, String neshto) {
        arr[den - 1][chas - 1] = neshto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addToSchedule(Teacher teacher){
        int klasChasove = predmeti.get(teacher.getPredmet()).getChasove(), teacherChasove = teacher.getChasove();
        if(klasChasove <= teacherChasove){
            teacher.setChasove(teacherChasove - klasChasove);
            int den = 0, chas = 0;
            while(klasChasove > 0){
                arr[den][chas] = teacher.getPredmet();
                teacher.setArr(den, chas, teacher.getPredmet());
                chas++;
                if(chas >= 7){
                    den++;
                    chas = 0;
                }
                klasChasove--;
            }
            predmeti.get(teacher.getPredmet()).setChasove(0);
        } else {
            predmeti.get(teacher.getPredmet()).setChasove(klasChasove - teacherChasove);
            int den = 0, chas = 0;
            while(teacherChasove > 0){
                arr[den][chas] = teacher.getPredmet();
                teacher.setArr(den, chas, teacher.getPredmet());
                chas++;
                if(chas >= 7){
                    den++;
                    chas = 0;
                }
                teacherChasove--;
            }
            teacher.setChasove(0);
        }
    }
}
