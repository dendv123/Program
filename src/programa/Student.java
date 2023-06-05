package programa;

import linkedList.LinkedList;

public class Student {

    private LinkedList <Predmet> predmeti = new LinkedList<>();
    private Chas[][] arr = new Chas[5][7];
    private String name;

    public Student(String name, LinkedList <Predmet> predmeti) {
        setName(name);
        setPredmeti(predmeti);
    }

    public Student() {
        this("", new LinkedList<>());
    }

    public LinkedList <Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(LinkedList <Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    public Chas[][] getArr() {
        return arr;
    }

    public void setArr(int den, int chas, Chas urok) {
        arr[den][chas] = urok;
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
