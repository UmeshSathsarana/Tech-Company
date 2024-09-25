/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Data;
import business.Department;
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
public class DepartmentDB {
     private File myFile;
    
    
    public DepartmentDB(){
        try{
            myFile=new File("D:\\oop\\HD64_The Tech Company\\Department.txt");
            myFile.createNewFile();
        }catch(IOException d){
            JOptionPane.showMessageDialog(null, d.getMessage());
        }catch(Exception d){
            JOptionPane.showMessageDialog(null, d.getMessage());
        }
    }    
        public boolean add(Department d){
        try{
            FileWriter fw=new FileWriter(myFile,true);// if we put true here it will append (overwrites)
            fw.write(d.getDepartmentID()+"\t");
            fw.write(d.getDepartmentName()+"\t");
            fw.write(d.getDesignation()+"\n");
            fw.close();
            return true;
            
        }catch(IOException m){
            JOptionPane.showMessageDialog(null, m.getMessage());
        }catch(Exception m){
            JOptionPane.showMessageDialog(null, m.getMessage());
        }
        return false;
        
    }
    
    public ArrayList<Department> getAll(){
        ArrayList<Department> DepartmentsList=new ArrayList<>();
        
        try{
            Scanner sc=new Scanner(myFile);// using to read files from the "myFile" file
            while(sc.hasNextLine()){//checks whether next line has ant data
                String line=sc.nextLine();//read the nextline from the file using scanner and saves into the "line (string)" variable
                String[] arr=line.split("\t");//while reading it splits data where it finds a "\t" into a string array by the pervious scanned line (string line)
                int DepartmentID=Integer.valueOf(arr [0]);//assigns those array items to new variables - moduleID
                String DepartmentName=arr[1];//assigns those array items to new variables - title
                String Designation=arr[2];//assigns those array items to new variables - type
                Department d=new Department(DepartmentID, DepartmentName, Designation); //creates a new Module object and stores those variables into it
                DepartmentsList.add(d);//adds every Modules into the moduleList while looping
            }
            sc.close();
            return DepartmentsList;
        }catch(FileNotFoundException d){
            JOptionPane.showMessageDialog(null, d.getMessage());
            return DepartmentsList;
        }catch(Exception d){
            JOptionPane.showMessageDialog(null, d.getMessage());
            return DepartmentsList;
        }
    }
    
    public Department get(int DepartmentID){
        ArrayList<Department> DepartmentList=getAll();
        for (Department m:DepartmentList){
            if (m.getDepartmentID()==DepartmentID){
                return m;
            }
        }
        return null;
    }}
    
   
    

