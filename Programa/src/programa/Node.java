package programa;

public class Node {

    private String predmet;
    private int chasove;
    public Node next;

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

    public Node(String predmet, int chasove) {
        setPredmet(predmet);
        setChasove(chasove);
    }

    public Node () {
        this("", 0);
    }
}
