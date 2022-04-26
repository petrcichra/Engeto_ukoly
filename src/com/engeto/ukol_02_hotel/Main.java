package com.engeto.ukol_02_hotel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // hlavni metoda
    public static void main(String[] args) {

        // vytvoření hostů
        Guest adelaMalikova = new Guest(
                "Adéla","Malíková", LocalDate.of(1993,3,13)
        );
        Guest janDvoracek = new Guest(
                "Jan","Dvořáček", LocalDate.of(1995, 5,5)
        );

//        adelaMalikova.printDescription();
//        janDvoracek.printDescription();

        // vytvoření pokojů
        Room pokoj1 = new Room(
                1,1,true,true,BigDecimal.valueOf(1000)
        );
        Room pokoj2 = new Room(
                2,1,true,true,BigDecimal.valueOf(1000)
        );
        Room pokoj3 = new Room(
                3,3,false,true,BigDecimal.valueOf(2400)
        );

//        pokoj1.printDescription();
//        pokoj2.printDescription();
//        pokoj3.printDescription();

        // vytvoření rezervace
        Reservation reservation1 = new Reservation(
                1,adelaMalikova, pokoj1, LocalDate.of(2021,7,19),LocalDate.of(2021,7,27)
        );
        Reservation reservation2 = new Reservation(
                2,janDvoracek, pokoj3, LocalDate.of(2021,9,1),LocalDate.of(2021,9,14)
        );

//        reservation1.printDescription();
//        reservation2.printDescription();

        // kolekce objektů
        ListOfReservation allReservation = new ListOfReservation();

        allReservation.addRes(reservation1);
        allReservation.addRes(reservation2);

        allReservation.printReservation();


    }
}
