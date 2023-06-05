/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileHandler;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import programa.Predmet;
import programa.School;
import programa.Students;
import programa.Teacher;

/**
 *
 * @author user
 */
public class FileOperations {
    public static void addToFile(String[] lines, String path){
        FileWriter fw = null;
        try {
            File file = new File (path);
            fw = new FileWriter(file.getPath(), false);
            for(String line : lines)
            {
                fw.write(line);   
            }
        } catch (IOException ex) {
            Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void removeFromStudents(String nameOfClass){
        try
        {
            File file = new File("src//files//students.csv");
            BufferedReader reader = new BufferedReader(new FileReader(file.getPath()));
            List<String> s = new LinkedList<>();
            s = reader.lines().collect(Collectors.toCollection(LinkedList::new));
            String []str = new String [s.size()];
            int br = 0;
            for (String line: s)
            {
                str[br] = "";
                String [] value = line.split(",");
                if(value[0].equalsIgnoreCase(nameOfClass)){
                    str[br] += value[0];
                    str[br] += "," + "[]\n";
                }
                else{
                    str[br] += line + "\n";
                }
                br++;
            }
            reader.close();
            
            addToFile(str, file.getPath());
        } 
        catch (IOException e)
        {
            System.out.println("Exception occured while removing from file");
            e.printStackTrace();
        }
    }
    
    public static void removeFromTeachers(String name){
        try
        {
            File file = new File("src//files//teachers.csv");
            BufferedReader reader = new BufferedReader(new FileReader(file.getPath()));
            List<String> s = new LinkedList<>();
            s = reader.lines().collect(Collectors.toCollection(LinkedList::new));
            String []str = new String [s.size()];
            int br = 0;
            for (String line: s)
            {
                str[br] = "";
                String [] value = line.split(",");
                if(!value[0].equals(name))
                {
                    str[br] += line + "\n";
                }
                br++;
            }
            reader.close();
            addToFile(str, file.getPath());
        } 
        catch (IOException e)
        {
            System.out.println("Exception occured while removing from file");
            e.printStackTrace();
        }
    }
    
    public static void saveInfo(){
        BufferedReader readerStudents = null;
        BufferedReader readerTeachers = null;
        try {
            File fileStudents = new File("src//files//students.csv");
            File fileTeachers = new File("src//files//teachers.csv");
            readerStudents = new BufferedReader(new FileReader(fileStudents.getPath()));
            readerTeachers = new BufferedReader(new FileReader(fileTeachers.getPath()));
            List<String> s = new LinkedList<>();
            s = readerStudents.lines().collect(Collectors.toCollection(LinkedList::new));
            s.remove(0);
            Students[] arr = new Students[15];
            int br = 0;
            for(String line : s){
                Students newSt = new Students();
                String []values = line.split(",", 2);
                newSt.setName(values[0]);
                linkedList.LinkedList <Predmet> newPr = new linkedList.LinkedList<>();
                int times = 0;
                String c = "";
                for (int i = 0; i < values[1].length(); ++i)
                {
                    if (!(values[1].charAt(i) == '[' || values[1].charAt(i) == ']')
                            && values[1].charAt(i) != ',')
                    {
                        for (; values[1].charAt(i) != ',' && values[1].charAt(i) != ']' ; ++i)
                        {
                            c += values[1].charAt(i) + "";
                        }
                        c += " ";
                        times++;
                    }
                    if (times % 2 == 0 && times != 0 && !c.equals(""))
                    {
                        String[] predmetParams = c.split(" ");
                        newPr.add(new Predmet(predmetParams[0], 
                                Integer.parseInt(predmetParams[1])));
                        c = "";
                    }
                }
                newSt.setPredmeti(newPr);
                arr[br++] = newSt;
            }
            List<String> t = new LinkedList<>();
            t = readerTeachers.lines().collect(Collectors.toCollection(LinkedList::new));
            t.remove(0);
            LinkedList <Teacher> teachers = new LinkedList<>();
            for (String line : t)
            {
                Teacher newT = new Teacher();
                String []values = line.split(",", 2);
                newT.setName(values[0]);
                String all = "";
                for (int i = 0; i < values[1].length(); ++i)
                {
                    if (!(values[1].charAt(i) == '[' || values[1].charAt(i) == ']')
                            && values[1].charAt(i) != ',')
                    {
                        for (; values[1].charAt(i) != ',' && values[1].charAt(i) != ']' ; ++i)
                        {
                            all += values[1].charAt(i) + "";
                        }
                        all += ",";
                    }
                }
                String[] subj = all.split(",");
                newT.setPredmet(new Predmet(subj[0], Integer.parseInt(subj[1])));
                teachers.add(newT);
            }
            School.teachers = teachers;
            School.students = arr;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                readerStudents.close();
                readerTeachers.close();
            } catch (IOException ex) {
                Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
