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
public class Designation {
    private int DesignationID;
    private String DesignationName;

    public Designation(int DesignationID, String DesignationName) {
        this.DesignationID = DesignationID;
        this.DesignationName = DesignationName;
    }

    public int getDesignationID() {
        return DesignationID;
    }

    public void setDesignationID(int DesignationID) {
        this.DesignationID = DesignationID;
    }

    public String getDesignationName() {
        return DesignationName;
    }

    public void setDesignationName(String DesignationName) {
        this.DesignationName = DesignationName;
    }
  
    
}