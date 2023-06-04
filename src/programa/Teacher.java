package programa;

public class Teacher {

    private String name;
    private String[][] arr = new String[5][7];
    private String predmet;
    private int chasove;

    public Teacher(String predmet, int chasove, String name) {
        setPredmet(predmet);
        setChasove(chasove);
        setName(name);
    }

    public Teacher() {
        this("", 0, "");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[][] getArr() {
        return arr;
    }

    public void setArr(int den, int chas, String neshto) {
        arr[den - 1][chas - 1] = neshto;
    }
    
    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public int getChasove() {
        return chasove;
    }

    public void setChasove(int chasove) {
        this.chasove = chasove;
    }
    
    @Override
    public String toString()
    {
        return String.format("Name: %s, Subject: %s, Number of lessons: %d",
                getName(), getPredmet(), getChasove());
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Teacher)) return false;
        Teacher obj2 = (Teacher)obj;
        return obj2.getName().equals(this.getName());
    }
}
