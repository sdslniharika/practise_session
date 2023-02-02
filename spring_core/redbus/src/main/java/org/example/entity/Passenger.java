package org.example.entity;

public class Passenger {
    String name;
    String panCardNumber;
    String passportNumber;
    int contactNumber;

    public Passenger()
    {

    }
    public Passenger(String name, String panCardNumber, String passportNumber, int contactNumber) {
        this.name = name;
        this.panCardNumber = panCardNumber;
        this.passportNumber = passportNumber;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPanCardNumber() {
        return panCardNumber;
    }

    public void setPanCardNumber(String panCardNumber) {
        this.panCardNumber = panCardNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", panCardNumber='" + panCardNumber + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
