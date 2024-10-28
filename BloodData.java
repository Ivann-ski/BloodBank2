/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BloodBank2;

/**
 *
 * @author jhnnn
 */
class BloodData {

    private String bloodType; 
    private String rhFactor; 

    public BloodData() {
        this.bloodType = "O"; 
        this.rhFactor = "+";  
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void display() {
        System.out.println(getBloodType() + getRhFactor() + " is added to the blood bank.");
    }
}