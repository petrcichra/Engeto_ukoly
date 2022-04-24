package com.engeto.ukol_02_hotel;

import java.util.ArrayList;
import java.util.List;

public class ListOfReservation {

    private Reservation reservationItem;
    List<Reservation> listOfReservation = new ArrayList<>();

    public ListOfReservation(Reservation reservationItem) {
        this.reservationItem = reservationItem;
    }

    public void add(Reservation reservationItem){
        listOfReservation.add(reservationItem);
    }

    public void remove(Reservation reservationItem){
        listOfReservation.add(reservationItem);
    }

    public List<Reservation> getList() {
        return new ArrayList<>(listOfReservation);
    }

    @Override
    public String toString() {
        return
                "========================================" + "\n" +
                reservationItem + "\n" +
                "========================================";
    }
}
