package com.bridgelabz.addressbookapp.dto;

public class AddressBookDTO {
    public String name;
    public String lName;
    public long phoneNumber;
    public String email;
    public long zip;
    public String city;
    public String state;

    public AddressBookDTO(String name, String lName, long phoneNumber, String email, long zip, String city, String state) {
        this.name = name;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.zip = zip;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "name='" + name + '\'' +
                ", lName='" + lName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", zip=" + zip +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
