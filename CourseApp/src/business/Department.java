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
public class Department {
    private int DepartmentID;
    private String DepartmentName;
    private String Designation;
    
    


  

    public Department(int DepartmentID, String DepartmentName, String Designation) {
        this.DepartmentID = DepartmentID;
        this.DepartmentName = DepartmentName;
        this.Designation = Designation;
    }

  
    

    public int getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(int DepartmentID) {
        this.DepartmentID = DepartmentID;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    


}


