/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;
import java.io.*;
import business.Login;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author icbt
 */
public class LoginDB {
    private File myFile;
    
    public LoginDB() {
        try{
            myFile=new File("D:\\oop\\HD64_The Tech Company\\Login.txt");
            myFile.createNewFile();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public boolean add(Login log){
        try{
            FileWriter fw=new FileWriter(myFile,true);// if we put true here it will append (overwrites)
            fw.write(log.getUserID()+"\t");
            fw.write(log.getPassword()+"\n");
            fw.close();
            return true;
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
    
    public ArrayList<Login> getAll(){
        ArrayList<Login> logList=new ArrayList<>();
        
        try{
            Scanner sc=new Scanner(myFile);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                String[] arr=line.split("\t");
                String userID=arr[0];
                String password=arr[1];

                Login log=new Login(userID, password);
                logList.add(log);
            }
            sc.close();
            return logList;
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return logList;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return logList;
        }
        
    }
    
    public Login get(String userID){
        ArrayList<Login> logList=getAll();
        for(Login log:logList){
            if (log.getUserID().equals(userID)){
                return log;
            }
        }
        return null;
    }
    
    public boolean delete(String userID){
        ArrayList<Login> logList=getAll();
        boolean flag=false;
        for (Login log:logList){
            if (log.getUserID().equals(userID)){
                logList.remove(log);
                flag=true;
                break;
            }
        }
        if(flag){
            try{
                FileWriter fwDel=new FileWriter(myFile);
                fwDel.write("");
                fwDel.close();
                
                for(Login log: logList){
                    add(log);
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
    
    public boolean update(Login logU){
        ArrayList<Login> logList=getAll();
        boolean flag=false;
        for (Login log:logList){
            if (log.getUserID().equals(logU.getUserID())){
                logList.remove(log);
                logList.add(logU);
                flag=true;
                break;
            }
        }
        if(flag){
            try{
                FileWriter fwDel=new FileWriter(myFile);
                fwDel.write("");
                fwDel.close();
                for(Login log: logList){
                    add(log);
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


