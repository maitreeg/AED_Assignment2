/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aed.model;

import java.util.Date;
import java.time.format.DateTimeFormatter; 

/**
 *
 * @author mg
 */
public class Encounter {

    private int encounterID;
    private int patientId;
    private int vitalSignsId;
    private Date dateOfEncounter;
    private String status; //can be ("accepted","pending")
    //private int doctorId;
    private int hospitalId;
    private String remarks;

    public Encounter(int encounterID, int patientId, int vitalSignsId, Date dateOfEncounter, String status, int hospitalId, String remarks) {
        this.encounterID = encounterID;
        this.patientId = patientId;
        this.vitalSignsId = vitalSignsId;
        this.dateOfEncounter = dateOfEncounter;
        this.status = status;
        //this.doctorId = doctorId;
        this.hospitalId = hospitalId;
        this.remarks = remarks;
    }

    public int getEncounterID() {
        return encounterID;
    }

    public void setEncounterID(int encounterID) {
        this.encounterID = encounterID;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getVitalSignsId() {
        return vitalSignsId;
    }

    public void setVitalSignsId(int vitalSignsId) {
        this.vitalSignsId = vitalSignsId;
    }

    public String getDateOfEncounter() {
        return dateOfEncounter+"";
    }

    public void setDateOfEncounter(Date dateOfEncounter) {
        this.dateOfEncounter = dateOfEncounter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    public int getDoctorId() {
//        return doctorId;
//    }
//
//    public void setDoctorId(int doctorId) {
//        this.doctorId = doctorId;
//    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }
    public String getRemarks() {
            return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
