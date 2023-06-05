/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sort;

import ArrayList.ArrayList;
/**
 *
 * @author user
 */
public interface Quick {
    public int sortTeacher(int left, int right, String [] arr);
    public int sortStudent(int left, int right, ArrayList arr);
    public void recTeacher(int left, int right, String [] arr);
    public void recStudent(int left, int right, ArrayList arr);
}
