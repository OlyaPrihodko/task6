package com.epam.prihodko.task6.domain;

public class Human {
    private int id = 0;
    private String name;
    private String sname;
    private String email;
    private int regId;

    public Human() {}

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.sname = surname;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setregId(int regId){ this.regId = regId;}



    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return sname;
    }
    public String getEmail() {
        return email;
    }
    public int getRegId() {
        return regId;
    }

    //toSting, equals... some other methods

}
