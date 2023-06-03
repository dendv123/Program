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
}
