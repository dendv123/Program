package programa;

public class Predmeti {

    public Node head = new Node();

    public void add(String predmet, int chasove) {
        Node current = head.next;
        if (head.next == null) {
            head.next = new Node(predmet, chasove);
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(predmet, chasove);
        }
    }

    public void remove(String predmet) {
        Node current = head;
        while (current.next != null) {
            if (current.next.getPredmet().equals(predmet)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public Node get(int index) {
        int br = 0;
        Node current = head;
        while (current.next != null) {
            if (br == index) {
                return current;
            } else {
                current = current.next;
            }
        }
        return null;
    }

    public Node get(String predmet) {
        int br = 0;
        Node current = head;
        while (current.next != null) {
            if (current.getPredmet().equals(predmet)) {
                return current;
            } else {
                current = current.next;
            }
        }
        return null;
    }

    public int size() {
        int size = 0;
        Node current = head.next;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }
}
