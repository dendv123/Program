package programa;

import linkedList.LinkedList;

public class Students {

    private LinkedList <Predmet> predmeti = new LinkedList<>();
    private Chas[][] arr = new Chas[5][7];
    private String name;

    public Students(String name, LinkedList <Predmet> predmeti) {
        setName(name);
        setPredmeti(predmeti);
    }

    public Students() {
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
        if (!(obj instanceof Students)) return false;
        Students obj2 = (Students)obj;
        return obj2.getName().equals(this.getName());
    }
}
