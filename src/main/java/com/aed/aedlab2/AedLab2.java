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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mg
 */
public class AedLab2 {

    public String userName = "";
    public int userId = 0;
    public static int VitalSignsId = 100, docterId = 803, hospitalId = 300, communityId = 400, houseId = 500, encounterId = 600,
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

        vitalSignsMap.put(803, new VitalSigns(VitalSignsId++, "FEVER", 701, 602));
        vitalSignsMap.put(804, new VitalSigns(VitalSignsId++, "FEVER", 702, 601));
        vitalSignsMap.put(805, new VitalSigns(VitalSignsId++, "FEVER", 700, 600));
        vitalSignsMap.put(806, new VitalSigns(VitalSignsId++, "FEVER", 701, 604));
        vitalSignsMap.put(807, new VitalSigns(VitalSignsId++, "FEVER", 702, 603));

        docterMap.put(docterId, new Docter(docterId++, 808, Arrays.asList(300, 301, 304)));
        docterMap.put(docterId, new Docter(docterId++, 809, Arrays.asList(300, 302, 303)));
        docterMap.put(docterId, new Docter(docterId++, 810, Arrays.asList(300, 302, 304)));
        docterMap.put(docterId, new Docter(docterId++, 811, Arrays.asList(300, 301, 303)));
        docterMap.put(docterId, new Docter(docterId++, 812, Arrays.asList(300, 302, 301)));

        hospitalMap.put(hospitalId, new Hospital(hospitalId++, "HealthSure", "Boston",
                Arrays.asList(400, 401, 403), Arrays.asList(803, 804, 805)));
        hospitalMap.put(hospitalId, new Hospital(hospitalId++, "Apex", "Boston",
                Arrays.asList(400, 401, 402), Arrays.asList(803, 804, 805)));
        hospitalMap.put(hospitalId, new Hospital(hospitalId++, "Subrata", "Boston",
                Arrays.asList(400, 402, 403), Arrays.asList(803, 804, 805)));
        hospitalMap.put(hospitalId, new Hospital(hospitalId++, "Shivani", "Boston",
                Arrays.asList(400, 402, 404), Arrays.asList(803, 804, 805)));
        hospitalMap.put(hospitalId, new Hospital(hospitalId++, "Poonam", "Boston",
                Arrays.asList(400, 404, 403), Arrays.asList(803, 804, 805)));

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

        personMap.put(personId, new Person(personId++, "Maitree", "maitree", "maitree123",
                "SYSTEMADMIN", 32, "MALE", "./uploads/profileImage/pass.png", 500));   //800
        personMap.put(personId, new Person(personId++, "Abhijith", "nair", "nair123",
                "COMMUNITYADMIN", 23, "MALE", "./uploads/profileImage/pass.png", 500));  //801
        personMap.put(personId, new Person(personId++, "Karan", "karan", "Karan123",
                "HOSPITALADMIN", 43, "MALE", "./uploads/profileImage/pass.png", 506));   //802
        personMap.put(personId, new Person(personId++, "raj", "raj", "raj123",
                "DOCTER", 23, "MALE", "./uploads/profileImage/pass.png", 507));      //803
        personMap.put(personId, new Person(personId++, "chaku", "chaku", "chaku123",
                "DOCTER", 50, "FEMALE", "./uploads/profileImage/pass.png", 509));    //804
        personMap.put(personId, new Person(personId++, "Shreya", "shreya", "shreya123",
                "DOCTER", 23, "MALE", "./uploads/profileImage/pass.png", 500));       //805
        personMap.put(personId, new Person(personId++, "Karthi", "knair", "knair123",
                "DOCTER", 30, "FEMALE", "./uploads/profileImage/pass.png", 502));     //806
        personMap.put(personId, new Person(personId++, "Raju", "raju", "raju123",
                "DOCTER", 23, "MALE", "./uploads/profileImage/pass.png", 502));      //807
        personMap.put(personId, new Person(personId++, "Udity", "udity", "udity123",
                "PERSON", 62, "MALE", "./uploads/profileImage/pass.png", 503));   //808
        personMap.put(personId, new Person(personId++, "padma", "padma", "padma123",
                "PERSON", 52, "FEMALE", "./uploads/profileImage/pass.png", 504));
        personMap.put(personId, new Person(personId++, "shivani", "shivani", "shivani123",
                "PERSON", 33, "FEMALE", "./uploads/profileImage/pass.png", 505));
        personMap.put(personId, new Person(personId++, "yash", "yash", "yash123",
                "PERSON", 28, "MALE", "./uploads/profileImage/pass.png", 506));
        personMap.put(personId, new Person(personId++, "Rajesh", "rajesh", "rajesh123",
                "PERSON", 26, "FEMALE", "./uploads/profileImage/pass.png", 507));

        patientMap.put(patientId, new Patient(patientId++, 809));
        patientMap.put(patientId, new Patient(patientId++, 810));
        patientMap.put(patientId, new Patient(patientId++, 811));

        encounterMap.put(803, new Encounter(encounterId++, 700, 100, new Date(12-12-2020), "pending", 300, remarks));
        encounterMap.put(804, new Encounter(encounterId++, 700, 101, new Date(12-01-2022), "pending", 303, remarks));
        encounterMap.put(805, new Encounter(encounterId++, 701, 102, new Date(29-07-2022), "pending", 300, remarks));
        encounterMap.put(806, new Encounter(encounterId++, 702, 100, new Date(12-10-2022), "pending", 302, remarks));
        encounterMap.put(807, new Encounter(encounterId++, 702, 100, new Date(12-10-2022), "pending", 304, remarks));

        new LoginJFrame().setVisible(true);
        
        
        
    }
}
