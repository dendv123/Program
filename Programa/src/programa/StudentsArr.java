package programa;

public class StudentsArr {

    private Students arr[];
    private int marker = 0;

    public StudentsArr(Students newArr[]) {
        this.arr = newArr;
        marker = newArr.length - 1;
    }

    public StudentsArr() {
        arr = new Students[4];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = null;
        }
    }

    public int indexOf(String name) {
        int i = 0;
        while (!arr[i].getName().equals(name)) {
            i++;
        }
        return i;
    }

    public void add(String name) {
        Students students = new Students(new Predmeti(), name);
        if (marker == arr.length - 1) {
            Students newArr[] = new Students[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[marker + 1] = students;
            this.arr = newArr;
        } else {
            this.arr[marker + 1] = students;
        }
        marker++;
    }

    public void remove(String name) {
        int index = indexOf(name);
        if (index >= 0 && index <= this.marker) {
            for (int i = 0; i < marker; i++) {
                if (i >= index) {
                    this.arr[i] = arr[i + 1];
                }
            }
            arr[marker] = null;
            marker--;
        } else {
            System.out.println("Index is unaccesable.");
        }
    }

    public Students getStudents(String name) {
        int index = indexOf(name);
        return getStudents(index);
    }

    public Students getStudents(int index) {
        if (index >= 0 && index <= this.marker) {
            return this.arr[index];
        } else {
            System.out.println("Index is unaccesable.");
            return new Students();
        }
    }

    public int trueSize() {
        return this.arr.length;
    }

    public int length() {
        return this.marker;
    }

    public void print() {
        String seq = "";
        for (int i = 0; i < this.marker; i++) {
            seq += arr[i] + " ";
        }
        System.out.printf("%s\n", seq);
    }
}
