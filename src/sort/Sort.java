/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort;

import ArrayList.ArrayList;
/**
 *
 * @author user
 */
public class Sort implements Quick {

    @Override
    public int sortTeacher(int left, int right, String [] arr) {
        String pivot = arr[right - 1];
        int br = left;
        for(int i = left; i < right - 1; ++i){
            if(arr[i].compareTo(pivot) < 0){
                String a = arr[i];
                arr[i] = arr[br];
                arr[br] = a;
                br++;
            }
        }
        String a = arr[right - 1];
        arr[right - 1] = arr[br];
        arr[br] = a;
        
        return br;
    }

    @Override
    public void recTeacher(int left, int right, String [] arr) {
        if(left >= right){
            return;
        }
        
        int pi = sortTeacher(left, right, arr);
        
        recTeacher(left, pi, arr);
        recTeacher(pi + 1, right, arr);
    }

    @Override
    public int sortStudent(int left, int right, ArrayList arr) {
        String pivot = arr.get(right - 1);
        int br = left;
        for(int i = left; i < right - 1; ++i){
            if(arr.get(i).length() == pivot.length() && 
                    arr.get(i).compareTo(pivot) < 0 || 
                    arr.get(i).length() < pivot.length()){
                String a = arr.get(i);
                arr.set(i, arr.get(br));
                arr.set(br, a);
                br++;
            }
        }
        String a = arr.get(right - 1);
        arr.set(right - 1, arr.get(br));
        arr.set(br, a);
        
        return br;
    }

    @Override
    public void recStudent(int left, int right, ArrayList arr) {
        if(left >= right){
            return;
        }
        
        int pi = sortStudent(left, right, arr);
        
        recStudent(left, pi, arr);
        recStudent(pi + 1, right, arr);
    }
    
    public void sort(String[] arr)
    {
        recTeacher(0, arr.length, arr);
    }
}
