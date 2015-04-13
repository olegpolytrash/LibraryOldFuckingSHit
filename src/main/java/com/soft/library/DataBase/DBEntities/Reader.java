package com.soft.library.DataBase.DBEntities;

import java.sql.Date;

/**
 * Database entry.
 */
public class Reader {
    private int id;
    private String name;
    private String surname;
    private String mobilePhone;
    private String address;
    private Date birthDate;

    public Reader() {
    }

    public Reader(String name, String surname, String mobilePhone, String address, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.mobilePhone = mobilePhone;
        this.address = address;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", address='" + address + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
