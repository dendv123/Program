package programa;

import ekrani.NachalnaStranica;
import ekrani.edit.Edit;
import java.util.*;
import sort.Sort;

public class Run extends NachalnaStranica{

    public static void main(String[] args) {
        Sort obj = new Sort();
        Scanner in = new Scanner (System.in);
        ArrayList <String> arr = new ArrayList<>();
        for(int i = 0; i < 7; ++i){
            arr.add(in.next());
        }
        obj.recStudent(0, arr.size(), arr);
        for(int i = 0; i < 7; ++i){
            System.out.println(arr.get(i));
        }
        //Edit.Run();
    }
}
