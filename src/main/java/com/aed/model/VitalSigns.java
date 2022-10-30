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
    
    private int encounterId;

    public VitalSigns(int vitalSignsId, String symptoms, int patientId,  int encounterId) {
        this.vitalSignsId = vitalSignsId;
        this.symptoms = symptoms;
        this.patientId = patientId;
        //this.doctorId = doctorId;
        this.encounterId = encounterId;
        
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

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

//    public int getDoctorId() {
//        return doctorId;
//    }
//
//    public void setDoctorId(int doctorId) {
//        this.doctorId = doctorId;
//    }

    public int getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(int encounterId) {
        this.encounterId = encounterId;
    }
    

}
