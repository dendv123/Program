package programa;

public class TeacherList {

    private Teacher head = new Teacher();

    public void add(String name, String predmet, int chasove) {
        Teacher current = head.next;
        if (head.next == null) {
            head.next = new Teacher(name, predmet, chasove);
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Teacher(name, predmet, chasove);
        }
    }

    public void add(int index, String name, String predmet, int chasove) {
        if (index >= 1 && index <= this.size()) {
            Teacher prev = head.next;
            Teacher next;
            int n = 0;
            if (head.next == null) {
                head.next = new Teacher(name, predmet, chasove);
            } else {
                while (prev.next != null && n < index - 1) {
                    n++;
                    prev = prev.next;
                }
                next = prev.next;
                prev.next = new Teacher(name, predmet, chasove);
                prev.next.next = next;
            }
        } else if (index == 0) {
            Teacher next = head.next;
            head.next = new Teacher(name, predmet, chasove);
            head.next.next = next;
        }
    }

    public void remove() {
        Teacher current = head.next;
        if (head.next == null) {

        } else {
            if (head.next.next == null) {
                head.next = null;
            } else {
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
        }
    }

    public void remove(String name) {
        Teacher current = head;
        while(current.next != null){
            if(current.next.getName().equals(name)){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
    }

    public int size() {
        int size = 0;
        Teacher current = head.next;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    public void print() {
        Teacher current = head.next;
        while (current != null) {
            System.out.println(current.getName() + " - " + current.getPredmet() + ": " + current.getChasove());
            current = current.next;
        }
    }
    
    /*public void set(String name, int chasove){
        ListNode current = head;
        while(current.next != null){
            if(current.getName().equals(name)){
                current.setChasove(chasove);
                return;
            }
            current = current.next;
        }
        System.out.println("Nqma takuw predmet!");
    }
    */
    public Teacher get(String name){
        Teacher current = head;
        while(current.next != null){
            if(current.getName().equals(name)){
                //System.out.println(current.getName() + " - " + current.getPredmet() + ": " + current.getChasove());
                return current;
            }
            else{
                current = current.next;
            }
        }
        System.out.println("Nqma takuw uchitel!");
        return null;
    }

    public Teacher get(int index) {
        int br = 0;
        Teacher current = head;
        while (current.next != null) {
            if (br == index) {
                return current;
            } else {
                current = current.next;
            }
        }
        return null;
    }
}

