package com.organisation.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Company_details")
public class CompanyDetails {


    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;
    @Id
    @Column(nullable = false)
    private String cId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;
    private String locality;
    private String street;
    private String country;
    private String state;
    private String city;
    private int pinCode;
    private String registrationType;
    private String organisationType;
    private String contactNo1, contactNo2;
    private String fax;
    private String email;
    private String picture;
    private String website;
    private double companyINR;

    public CompanyDetails() {
    }
    public CompanyDetails( String cId, String name, String address, String locality, String street,
            String country, String state, String city, int pinCode, String registrationType, String organisationType,
            String contactNo1, String contactNo2, String fax, String email, String website, double companyINR) {
        this.cId = cId;
        this.name = name;
        this.address = address;
        this.locality = locality;
        this.street = street;
        this.country = country;
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
        this.registrationType = registrationType;
        this.organisationType = organisationType;
        this.contactNo1 = contactNo1;
        this.contactNo2 = contactNo2;
        this.fax = fax;
        this.email = email;
        this.website = website;
        this.companyINR = companyINR;
    }
    
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public String getcId() {
        return cId;
    }
    public void setcId(String cId) {
        this.cId = cId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getLocality() {
        return locality;
    }
    public void setLocality(String locality) {
        this.locality = locality;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getPinCode() {
        return pinCode;
    }
    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
    public String getRegistrationType() {
        return registrationType;
    }
    public void setRegistrationType(String registrationType) {
        this.registrationType = registrationType;
    }
    public String getOrganisationType() {
        return organisationType;
    }
    public void setOrganisationType(String organisationType) {
        this.organisationType = organisationType;
    }
    public String getContactNo1() {
        return contactNo1;
    }
    public void setContactNo1(String contactNo1) {
        this.contactNo1 = contactNo1;
    }
    public String getContactNo2() {
        return contactNo2;
    }
    public void setContactNo2(String contactNo2) {
        this.contactNo2 = contactNo2;
    }
    public String getFax() {
        return fax;
    }
    public void setFax(String fax) {
        this.fax = fax;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public double getCompanyINR() {
        return companyINR;
    }
    public void setCompanyINR(double companyINR) {
        this.companyINR = companyINR;
    }


}