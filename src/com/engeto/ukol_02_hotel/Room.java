package com.engeto.ukol_02_hotel;

import java.math.BigDecimal;

public class Room {
    // atributy
    private int numOfRoom;
    private int numOfBed;
    private boolean haveBalcony;
    private boolean haveSeeView;
    private BigDecimal priceForRoom;

    // kontruktor
    public Room(int numOfRoom, int numOfBed, boolean haveBalcony, boolean haveSeeView, BigDecimal priceForNight) {
        this.numOfRoom = numOfRoom;
        this.numOfBed = numOfBed;
        this.haveBalcony = haveBalcony;
        this.haveSeeView = haveSeeView;
        this.priceForRoom = priceForNight;
    }

    // výchozí hodnoty + povinné parametry
    public Room() {
        this(
            // základní pokoj: číslo: 5, počet postelí: 2, bez balkonu, bez vyhledu, cena: 500
            // v zadání není výhozí pokoj
            5,
            2,
            false,
            false,
            BigDecimal.valueOf(1000)
        );
    }

    // generování Getter & Setter
    public int getNumOfRoom() {
        return numOfRoom;
    }

    public void setNumOfRoom(int numOfRoom) {
        this.numOfRoom = numOfRoom;
    }

    public int getNumOfBed() {
        return numOfBed;
    }

    public void setNumOfBed(int numOfBed) {
        this.numOfBed = numOfBed;
    }

    public boolean isHaveBalcony() {
        return haveBalcony;
    }

    public void setHaveBalcony(boolean haveBalcony) {
        this.haveBalcony = haveBalcony;
    }

    public boolean isHaveSeeView() {
        return haveSeeView;
    }

    public void setHaveSeeView(boolean haveSeeView) {
        this.haveSeeView = haveSeeView;
    }

    public BigDecimal getPriceForRoom() {
        return priceForRoom;
    }

    public void setPriceForRoom(BigDecimal priceForRoom) {
        this.priceForRoom = priceForRoom;
    }

    // získání popisu
    public String getDescription() {
        return
            "Číslo pokoje: " + numOfRoom + "\n" +
            "Počet postelí: " + numOfBed + "\n" +
            "S balkónem: " + haveBalcony + "\n" +
            "S výhledem na moře: " + haveSeeView + "\n" +
            "Cena: " + priceForRoom;
    }
    // vypsání popisu do konzole
    public void printDescription() {
        System.out.println(getDescription());
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
