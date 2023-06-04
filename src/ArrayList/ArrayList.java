package ArrayList;

public class ArrayList {

    private String arr[];
    private int size = 0;

    public ArrayList(String newArr[]) {
        this.arr = newArr;
        size = newArr.length - 1;
    }

    public ArrayList() {
        arr = new String[1];
    }
    
    public void set(int index, String value)
    {
        if (index >= size() || index < 0) return;
        arr[index] = value;
    }
    
    public void setArr(String []newArr){
        this.arr = new String[newArr.length];
        
        for(int i = 0; i < newArr.length; ++i){
            arr[i] = newArr[i];
        }
    }
    
    public int indexOf(String value) {
        int i = 0;
        while (!(arr[i].equals(value))) {
            i++;
        }
        return i;
    }

    public void add(String value) {
        if (size == arr.length - 1) {
            String newArr[] = new String[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[size + 1] = value;
            this.arr = newArr;
        } else {
            this.arr[size + 1] = value;
        }
        size++;
    }

    public void removeValue(String value) {
        String []newArr = new String[arr.length];
        int i;
        for (i = 0; i < size() && !arr[i].equals(value); ++i)
        {
            newArr[i] = arr[i];
        }
        for (i = i + 1; i < size(); ++i)
        {
            newArr[i - 1] = arr[i];
        }
        setArr(newArr);
    }

    public int get(String name) {
        for (int i = 0; i < size(); ++i)
        {
            if (arr[i].equals(name)) return i;
        }
        return -1;
    }

    public String get(int index) {
        if (index >= size || index < 0) return null;
        return arr[index];
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        String seq = "";
        for (int i = 0; i < this.size; i++) {
            seq += arr[i] + " ";
        }
        return String.format("%s", seq);
    }
}
