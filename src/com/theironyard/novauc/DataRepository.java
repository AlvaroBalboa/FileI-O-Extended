package com.theironyard.novauc;

/**
 * Created by souporman on 2/18/17.
 */
public class DataRepository<T> {

    private T idNumber;
    private T firstName;
    private T lastName;
    private T emailAddress;
    private T country;
    private T ipAddress;

    public DataRepository(T idNumber, T firstName, T lastName, T emailAddress, T country, T ipAddress) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.country = country;
        this.ipAddress = ipAddress;
    }

    @Override
    public String toString(){
        return String.format("%s %s from %s",firstName,lastName,lastName,lastName);
    }


    public T getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(T idNumber) {
        this.idNumber = idNumber;
    }

    public T getFirstName() {
        return firstName;
    }

    public void setFirstName(T firstName) {
        this.firstName = firstName;
    }

    public T getLastName() {
        return lastName;
    }

    public void setLastName(T lastName) {
        this.lastName = lastName;
    }

    public T getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(T emailAddress) {
        this.emailAddress = emailAddress;
    }

    public T getCountry() {
        return country;
    }

    public void setCountry(T country) {
        this.country = country;
    }

    public T getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(T ipAddress) {
        this.ipAddress = ipAddress;
    }


}
