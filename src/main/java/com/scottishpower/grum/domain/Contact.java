package com.scottishpower.grum.domain;

import java.io.Serializable;

public class Contact implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private Long id;
    private String firstName;
    private String lastName;
    private String company;
    private String businessUnit;
    private String department;
    private String team;
    private String emailAddress;
    private String externalTelephoneNo;
    private String internalTelephoneNo;
    private String mobileNo;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBusinessUnit() {
        return this.businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getExternalTelephoneNo() {
        return this.externalTelephoneNo;
    }

    public void setExternalTelephoneNo(String externalTelephoneNo) {
        this.externalTelephoneNo = externalTelephoneNo;
    }

    public String getInternalTelephoneNo() {
        return this.internalTelephoneNo;
    }

    public void setInternalTelephoneNo(String internalTelephoneNo) {
        this.internalTelephoneNo = internalTelephoneNo;
    }

    public String getMobileNo() {
        return this.mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return 
            getId() + ", " + 
            getFirstName() + ", " + 
            getLastName() + ", " + 
            getCompany() + ", " + 
            getBusinessUnit() + ", " + 
            getDepartment() + ", " + 
            getTeam() + ", " + 
            getEmailAddress() + ", " + 
            getExternalTelephoneNo() + ", " + 
            getInternalTelephoneNo() + ", " + 
            getMobileNo();
    }
}