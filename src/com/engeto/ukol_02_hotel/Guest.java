package com.engeto.ukol_02_hotel;

import java.time.LocalDate;

public class Guest {

    // atributy
    private String firstName;
    private String lastname;
    private LocalDate birthDate;
    private Room room;

    // kontruktor
    public Guest(String firstName, String lastName, LocalDate birthDate, int room) {
        this.firstName = firstName;
        this.lastname = lastName;
        this.birthDate = birthDate;
    }

    // povinné vyplnění atributů + výchozí hodnoty
    public Guest (String firstName, String lastName, LocalDate birthDate) {
        this(
                firstName,
                lastName,
                birthDate,
                0);
    }

    // generování Getter & Setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    // vlastni metoda pro ziskani popisku hosta
    public String getDescription() {
        return
                "Celé jméno: " + firstName + " " + lastname +"\n"+
                "Datum narozeni: " + birthDate +"\n"+
                "Pokoj: " + room;
    }
    // zobrazeni description v konzole
    public void printDescription(){
        System.out.println(getDescription());
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
