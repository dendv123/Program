/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedList;


/**
 *
 * @author user
 */
public class LinkedList <T> {
    
    public Node <T> head = new Node<>();

    public void add(T data) {
        Node current = head.next;
        if (head.next == null) {
            head.next = new Node<>(data);
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(data);
        }
    }
    
    public void add(int index, T data) {
        Node current = head;
        int i = 0;
        while (current.next != null && i != index) {
            current = current.next;
            i++;
        }
        current.next = new Node<>(data);
    }

    public void remove(T data) {
        Node <T> current = head;
        while (current.next != null) {
            if (current.next.getData().equals(data)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }
    
    public void remove() {
        Node <T> current = head;
        if (current.next == null) return;
        while (current.next.next != null) {
                current = current.next;
        }
        current.next = null;
    }

    public T get(int index) {
        int br = 0;
        Node <T> current = head.next;
        while (current != null) {
            if (br == index) {
                return current.getData();
            } else {
                current = current.next;
            }
            br++;
        }
        return null;
    }
    
    public T get(T data) {
        Node <T> current = head.next;
        while(current != null){
            if(current.getData().equals(data)){
                return current.getData();
            }
            else{
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
    
    public String toString()
    {
        String ans = "";
        Node<T> current = head.next;
        while (current != null) {
            ans += current.getData() + " ";
            current = current.next;
        }
        return ans;
    }
}

