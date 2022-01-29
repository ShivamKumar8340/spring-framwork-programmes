package com.sunglowsys.domain;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private Long mobile;

    public void getFirstName() {
        System.out.println("firstName :" + firstName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void getLastName() {
        System.out.println("lastName :"+ lastName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void getEmail() {
        System.out.println("email :" + email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getMobile() {
        System.out.println("mobile :"+ mobile);
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }
}
