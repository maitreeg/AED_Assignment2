/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.aed.aedlab2;

import com.aed.model.Community;
import com.aed.model.Docter;
import com.aed.model.Encounter;
import com.aed.model.Hospital;
import com.aed.model.House;
import com.aed.model.Patient;
import com.aed.model.Person;
import com.aed.model.VitalSigns;
import com.aed.view.LoginJFrame;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mg
 */
public class AedLab2 {

    static int VitalSignsId = 100, docterId = 200, hospitalId = 300, communityId = 400, houseId = 500, encounterId = 600,
            patientId = 700, personId = 800;
    public static String role = "PATIENT", remarks = "Visit again after 1 week";
    public static Map<Integer, VitalSigns> vitalSignsMap = new HashMap<>();
    public static Map<Integer, Docter> docterMap = new HashMap<>();
    public static Map<Integer, Hospital> hospitalMap = new HashMap<>();
    public static Map<Integer, Community> communityMap = new HashMap<>();
    public static Map<Integer, House> houseMap = new HashMap<>();
    public static Map<Integer, Person> personMap = new HashMap<>();
    public static Map<Integer, Patient> patientMap = new HashMap<>();
    public static Map<Integer, Encounter> encounterMap = new HashMap<>();

    public static void main(String[] args) {

        vitalSignsMap.put(VitalSignsId, new VitalSigns(VitalSignsId++, 97, 130, 86));
        vitalSignsMap.put(VitalSignsId, new VitalSigns(VitalSignsId++, 97, 180, 78));
        vitalSignsMap.put(VitalSignsId, new VitalSigns(VitalSignsId++, 103, 150, 120));
        vitalSignsMap.put(VitalSignsId, new VitalSigns(VitalSignsId++, 100, 110, 95));
        vitalSignsMap.put(VitalSignsId, new VitalSigns(VitalSignsId++, 99, 125, 72));

        docterMap.put(docterId, new Docter(docterId++, 807, Arrays.asList(300, 301, 304)));
        docterMap.put(docterId, new Docter(docterId++, 808, Arrays.asList(300, 302, 303)));
        docterMap.put(docterId, new Docter(docterId++, 809, Arrays.asList(300, 302, 304)));
        docterMap.put(docterId, new Docter(docterId++, 810, Arrays.asList(300, 301, 303)));
        docterMap.put(docterId, new Docter(docterId++, 811, Arrays.asList(300, 302, 301)));

        hospitalMap.put(houseId, new Hospital(hospitalId++, "HealthSure", "Boston",
                Arrays.asList(400, 401, 403), Arrays.asList(200, 201, 203)));
        hospitalMap.put(houseId, new Hospital(hospitalId++, "Apex", "Boston",
                Arrays.asList(400, 401, 402), Arrays.asList(200, 202, 203)));
        hospitalMap.put(houseId, new Hospital(hospitalId++, "Subrata", "Boston",
                Arrays.asList(400, 402, 403), Arrays.asList(200, 201, 202)));
        hospitalMap.put(houseId, new Hospital(hospitalId++, "Shivani", "Boston",
                Arrays.asList(400, 402, 404), Arrays.asList(200, 201, 204)));
        hospitalMap.put(houseId, new Hospital(hospitalId++, "Poonam", "Boston",
                Arrays.asList(400, 404, 403), Arrays.asList(200, 204, 203)));

        communityMap.put(communityId, new Community(communityId++, "MissionHill", "Boston", "02115",
                Arrays.asList(500, 501, 502), Arrays.asList(300, 301, 304)));
        communityMap.put(communityId, new Community(communityId++, "MissionPark", "Boston", "02120",
                Arrays.asList(503, 504), Arrays.asList(300, 302)));
        communityMap.put(communityId, new Community(communityId++, "Bolyston Street", "Boston", "02116",
                Arrays.asList(505), Arrays.asList(300)));
        communityMap.put(communityId, new Community(communityId++, "South End", "Boston", "02117",
                Arrays.asList(506, 507), Arrays.asList(301, 304)));
        communityMap.put(communityId, new Community(communityId++, "ChinaTown", "Boston", "02118",
                Arrays.asList(508, 509), Arrays.asList(301, 302, 303, 304)));

        houseMap.put(houseId, new House(houseId++, 400, "ABC"));
        houseMap.put(houseId, new House(houseId++, 400, "ABC"));
        houseMap.put(houseId, new House(houseId++, 400, "ABC"));
        houseMap.put(houseId, new House(houseId++, 401, "ABC"));
        houseMap.put(houseId, new House(houseId++, 401, "ABC"));
        houseMap.put(houseId, new House(houseId++, 402, "ABC"));
        houseMap.put(houseId, new House(houseId++, 403, "ABC"));
        houseMap.put(houseId, new House(houseId++, 403, "ABC"));
        houseMap.put(houseId, new House(houseId++, 404, "ABC"));
        houseMap.put(houseId, new House(houseId++, 404, "ABC"));

        personMap.put(personId, new Person(personId++, "anush", "anush", "anush123",
                "PERSON", 32, "MALE", "./uploads/profileImage/pass.png", 500));
        personMap.put(personId, new Person(personId++, "dhanush", "dhanush", "dhanush123",
                "PERSON", 23, "MALE", "./uploads/profileImage/pass.png", 500));
        personMap.put(personId, new Person(personId++, "rajesh", "rajesh", "rajesh123",
                "PERSON", 43, "MALE", "./uploads/profileImage/pass.png", 506));
        personMap.put(personId, new Person(personId++, "raj", "raj", "raj123",
                "PERSON", 23, "MALE", "./uploads/profileImage/pass.png", 507));
        personMap.put(personId, new Person(personId++, "Maitree", "maitree", "maitree123",
                "SYSTEMADMIN", 50, "FEMALE", "./uploads/profileImage/pass.png", 509));
        personMap.put(personId, new Person(personId++, "hardik", "hardik", "hardik123",
                "HOSPITALADMIN", 23, "MALE", "./uploads/profileImage/pass.png", 500));
        personMap.put(personId, new Person(personId++, "Disha", "disha", "disha123",
                "COMMUNITYADMIN", 30, "FEMALE", "./uploads/profileImage/pass.png", 502));
        personMap.put(personId, new Person(personId++, "Nishank", "dhanush", "dhanush123",
                "PERSON", 23, "MALE", "./uploads/profileImage/pass.png", 502));
        personMap.put(personId, new Person(personId++, "prasad", "prasad", "prasad123",
                "DOCTER", 62, "MALE", "./uploads/profileImage/pass.png", 503));
        personMap.put(personId, new Person(personId++, "padma", "padma", "padma123",
                "DOCTER", 52, "FEMALE", "./uploads/profileImage/pass.png", 504));
        personMap.put(personId, new Person(personId++, "shivani", "shivani", "shivani123",
                "DOCTER", 33, "FEMALE", "./uploads/profileImage/pass.png", 505));
        personMap.put(personId, new Person(personId++, "yash", "yash", "yash123",
                "DOCTER", 28, "MALE", "./uploads/profileImage/pass.png", 506));
        personMap.put(personId, new Person(personId++, "rajeshwari", "rajeshwari", "rajeshwari123",
                "DOCTER", 26, "FEMALE", "./uploads/profileImage/pass.png", 507));

        patientMap.put(patientId, new Patient(patientId++, 800));
        patientMap.put(patientId, new Patient(patientId++, 801));
        patientMap.put(patientId, new Patient(patientId++, 802));

        encounterMap.put(encounterId, new Encounter(encounterId++, 700, 100, "12-Dec-2020", "pending", 200, 300, remarks));
        encounterMap.put(encounterId, new Encounter(encounterId++, 700, 101, "12-Jan-2022", "accepted", 201, 303, remarks));
        encounterMap.put(encounterId, new Encounter(encounterId++, 701, 102, "29-Jul-2022", "pending", 200, 300, remarks));
        encounterMap.put(encounterId, new Encounter(encounterId++, 702, 100, "12-Dec-2020", "rejected", 202, 302, remarks));
        encounterMap.put(encounterId, new Encounter(encounterId++, 702, 100, "12-Dec-2020", "pending", 204, 304, remarks));

        new LoginJFrame().setVisible(true);
        
        
        
    }
}
