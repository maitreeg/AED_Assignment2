/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.model;

/**
 *
 * @author yashpawar
 */
public class VitalSigns {
    
    private int vitalSignsId;
    private String symptoms;
    private int patientId;

    public VitalSigns(int vitalSignsId, String symptoms, int patientId) {
        this.vitalSignsId = vitalSignsId;
        this.symptoms = symptoms;
        this.patientId = patientId;
        
    }
    
    public int getVitalSignsId() {
        return vitalSignsId;
    }

    public void setVitalSignsId(int vitalSignsId) {
        this.vitalSignsId = vitalSignsId;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getPersonId() {
        return patientId;
    }

    public void setPersonId(int patientId) {
        this.patientId = patientId;
    }
    

}
