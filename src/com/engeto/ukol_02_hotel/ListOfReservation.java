package com.engeto.ukol_02_hotel;

import java.util.ArrayList;
import java.util.List;

public class ListOfReservation {

    private Reservation reservationItem;
    ArrayList<Reservation> listOfReservation = new ArrayList<>();

    public ListOfReservation() {
//        this.reservationItem = reservationItem;
//        this.listOfReservation = listOfReservation;
    }

    public void addRes(Reservation reservationItem) {
        listOfReservation.add(reservationItem);
    }
    public void removeRes(Reservation reservationItem) {
        listOfReservation.remove(reservationItem);
    }

    public void printReservation() {
        System.out.println(
                "========================================" + "\n" +
                reservationItem + "\n" +
                "========================================"
        );
    }

    @Override
    public String toString() {
        return
                "========================================" + "\n" +
                reservationItem + "\n" +
                "========================================";
    }
}
