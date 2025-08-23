package com.Hari.anu;

public class Assignment2 {
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public static void main(String[] args) {
        Assignment2 e = new Assignment2();
        e.id = 101;
        e.name = "Ravi";
        e.isPermanent = true;

        e.age = (int) 35.5;

        System.out.println("Successfully started");
    }
}

