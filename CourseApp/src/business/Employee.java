/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

/**
 *
 * @author User
 */
public class Employee {
    private int EPFID;
    private String Name;
    private String Age;
    private String Email;
    private String Department;

    

    public Employee(int EPFID, String Name, String Age, String Email, String Department) {
        this.EPFID = EPFID;
        this.Name = Name;
        this.Age = Age;
        this.Email = Email;
        this.Department = Department;
        
    }

  

    public int getEPFID() {
        return EPFID;
    }

    public void setEPFID(int EPFID) {
        this.EPFID = EPFID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

public int getEmployeeID(){
return EPFID;
}
    
 
}
