package com.engeto.ukol_01_evidence;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String firstName        = "Petr";
        String lastName         = "Cichra";
        LocalDate birthDate     =  LocalDate.of(2022,4, 12);
        int numDoneContract     = 5;                // ks
        Double totalSoldCarrot  = 64.5;             //  tuna
        String cityName         = "Brumovice";
        String spz              = "69111";
        Double fuelConsuption   = 7.7; // litry
        String ipAdrress        = "192.168.1.1";

        Double avgSoldCarrot;

        avgSoldCarrot = totalSoldCarrot / numDoneContract;

        System.out.println(avgSoldCarrot);



    }
}
