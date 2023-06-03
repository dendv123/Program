package programa;

public class Teacher extends Node {

    private String name;
    private String[][] arr = new String[5][7];
    public Teacher next;

    public Teacher(String predmet, int chasove, String name) {
        super(predmet, chasove);
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
}
