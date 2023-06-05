package programa;

public class Teacher {

    private String name;
    private Chas[][] arr = new Chas[5][7];
    private Predmet predmet;

    public Teacher(String name, Predmet predmet) {
        setPredmet(predmet);
        setName(name);
    }

    public Teacher() {
        this("", new Predmet());
    }

    public Teacher(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Chas[][] getArr() {
        return arr;
    }

    public void setArr(int den, int chas, Chas urok) {
        arr[den][chas] = urok;
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
