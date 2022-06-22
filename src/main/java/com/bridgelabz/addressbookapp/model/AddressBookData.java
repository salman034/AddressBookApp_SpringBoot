package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

public class AddressBookData {

    private Integer id;

    private String name;
    private String lName;
    private long phoneNumber;
    private String email;
    private long zip;
    private String city;
    private String state;

    public AddressBookData(Integer id, AddressBookDTO addressBookDTO) {
        this.id = id;

        this.name = addressBookDTO.getName();
        this.lName = addressBookDTO.getlName();
        this.phoneNumber = addressBookDTO.getPhoneNumber();
        this.email = addressBookDTO.getEmail();
        this.zip = addressBookDTO.getZip();
        this.city = addressBookDTO.getCity();
        this.state = addressBookDTO.getState();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
