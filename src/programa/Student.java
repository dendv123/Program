package programa;

import linkedList.LinkedList;

public class Student {

    private LinkedList <Predmet> predmeti = new LinkedList<>();
    private String[][] arr = new String[5][7];
    private String name;

    public Student(LinkedList <Predmet> predmeti, String name) {
        setName(name);
        setPredmeti(predmeti);
    }

    public Student() {
        this(new LinkedList<>(), "");
    }

    public LinkedList <Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(LinkedList <Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    public String[][] getArr() {
        return arr;
    }

    public void setArr(int den, int chas, String neshto) {
        arr[den][chas] = neshto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return String.format("Name: %s, Subjects: %s",
                getName(), getPredmeti());
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Student)) return false;
        Student obj2 = (Student)obj;
        return obj2.getName().equals(this.getName());
    }
}
