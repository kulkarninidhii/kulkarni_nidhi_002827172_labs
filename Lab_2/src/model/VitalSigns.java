/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nidhikulkarni
 */
public class VitalSigns {
    
    
    private double temparature;
    private double bloodPressure;
    private int pulse;
    private String date;

    public double getTemparature() {
        return temparature;
    }

    public void setTemparature(double temparature) {
        this.temparature = temparature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    @Override
    public String toString(){
        return date;
    }
    
}
