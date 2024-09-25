/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Data;

import business.Employee;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class EmployeeDB {
    private File myFile;
    
    
    public EmployeeDB(){
        try{
            myFile=new File("D:\\oop\\HD64_The Tech Company\\.txt");
            myFile.createNewFile();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }    
        public boolean add(Employee e){
        try{
            FileWriter fw=new FileWriter(myFile,true);// if we put true here it will append (overwrites)
            fw.write(e.getEPFID()+"\t");
            fw.write(e.getName()+"\t");
            fw.write(e.getAge()+"\t");
            fw.write(e.getEmail()+"\t");
            fw.write(e.getDepartment()+"\n");
            fw.close();
            return true;
            
        }catch(IOException m){
            JOptionPane.showMessageDialog(null, m.getMessage());
        }catch(Exception m){
            JOptionPane.showMessageDialog(null, m.getMessage());
        }
        return false;
        
    }
    
    public ArrayList<Employee> getAll(){
        ArrayList<Employee> EmployeesList=new ArrayList<>();
        
        try{
            Scanner sc=new Scanner(myFile);// using to read files from the "myFile" file
            while(sc.hasNextLine()){//checks whether next line has ant data
                String line=sc.nextLine();//read the nextline from the file using scanner and saves into the "line (string)" variable
                String[] arr=line.split("\t");//while reading it splits data where it finds a "\t" into a string array by the pervious scanned line (string line)
                int EPFID=Integer.valueOf(arr [0]);//assigns those array items to new variables - moduleID
                String Name=arr[1];//assigns those array items to new variables - title
                String Age=arr[2];//assigns those array items to new variables - type
                String Email=arr[3];//assigns those array items to new variables - date
                String Department=arr[4];//assigns those array items to new variables - level
                Employee e=new Employee(EPFID, Name, Age, Email, Department); //creates a new Module object and stores those variables into it
                EmployeesList.add(e);//adds every Modules into the moduleList while looping
            }
            sc.close();
            return EmployeesList;
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return EmployeesList;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return EmployeesList;
        }
    }
    
    public Employee get(int EPFID){
        ArrayList<Employee> EmployeesList=getAll();
        for (Employee m:EmployeesList){
            if (m.getEPFID()==EPFID){
                return m;
            }
        }
        return null;
    }
 
 
      public boolean delete(int EPFID){
        ArrayList<Employee> EmployeesList=getAll();
        boolean flag=false;
        for (Employee m:EmployeesList){
            if (m.getEPFID()==EPFID){
                EmployeesList.remove(m);
                flag=true;
                break;
            }
        }
        if(flag){
            try{
                FileWriter fwDel=new FileWriter(myFile);
                fwDel.write("");
                fwDel.close();
                
                for(Employee m: EmployeesList){
                    add(m);
                }
                return true;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                return false;
            }
        }else{
            return false;
        }

    }
}
   
   