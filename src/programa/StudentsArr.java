package programa;

public class StudentsArr {

    private Student arr[];
    private int marker = 0;

    public StudentsArr(Student newArr[]) {
        this.arr = newArr;
        marker = newArr.length - 1;
    }

    public StudentsArr() {
        arr = new Student[4];
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

    public void addStudents(Student students) {
        if (marker == arr.length - 1) {
            Student newArr[] = new Student[2 * arr.length];
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

    public void removeStudents(String name) {
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

    public Student getStudents(String name) {
        int index = indexOf(name);
        return getStudents(index);
    }

    public Student getStudents(int index) {
        if (index >= 0 && index <= this.marker) {
            return this.arr[index];
        } else {
            System.out.println("Index is unaccesable.");
            return new Student();
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
