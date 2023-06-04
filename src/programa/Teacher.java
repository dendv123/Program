package programa;

import linkedList.LinkedList;

public class Teacher {

    private String name;
    private String[][] arr = new String[5][7];
    private Predmet predmet;

    public Teacher(Predmet predmet, String name) {
        setPredmet(predmet);
        setName(name);
    }

    public Teacher() {
        this(new Predmet(), "");
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
    
    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }
    
    @Override
    public String toString()
    {
        return String.format("Name: %s, Subject: %s",
                getName(), getPredmet());
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Teacher)) return false;
        Teacher obj2 = (Teacher)obj;
        return obj2.getName().equals(this.getName());
    }
}
