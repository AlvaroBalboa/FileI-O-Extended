package com.theironyard.novauc;

/**
 * Created by souporman on 2/16/17.
 */
public class Friends {
    private int idNumber;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String country;
    private String ipAddress;

    public Friends(int idNumber, String firstName, String lastName, String emailAddress, String country, String ipAddress){
        this.setIdNumber(idNumber);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmailAddress(emailAddress);
        this.setCountry(country);
        this.setIpAddress(ipAddress);
    }
    public Friends(){
    }
//
//    public Friends(int i, String column, String column1, String column2, String column3, String column4, String column5) {
//    }
//    public String getContinent() {
//        return continent;
//    }
//
//    public void setContinent(String continent) {
//        this.continent = continent;
//    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public String toString(){
        return "bob";
    }
}
