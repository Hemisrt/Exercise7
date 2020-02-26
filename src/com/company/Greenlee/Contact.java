package com.company.Greenlee;

public class Contact {
    public String name;
    public String email;

    Contact(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void display() {
        System.out.print("Name: " + name + ", Email: " + email + ", ");
    }
}

