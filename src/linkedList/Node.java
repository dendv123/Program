package linkedList;

import programa.*;

public class Node <T> {

    private T data;
    public Node next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node(T data) {
        setData(data);
    }

    public Node () {
        this(null);
    }
}
