package programa;

public class Predmet {

    private String name;
    private int chasove;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChasove() {
        return chasove;
    }

    public void setChasove(int chasove) {
        this.chasove = chasove;
    }

    public Predmet(String name, int chasove) {
        setName(name);
        setChasove(chasove);
    }

    public Predmet(int chasove) {
        setChasove(chasove);
    }
    
    public Predmet () {
        this("", 0);
    }
    
    @Override
    public String toString()
    {
        return String.format("Name: %s, Number of lessons: %d",
                getName(), getChasove());
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Predmet)) return false;
        Predmet obj2 = (Predmet)obj;
        return obj2.getName().equals(this.getName()) &&
                obj2.getChasove() == this.getChasove();
    }
}
