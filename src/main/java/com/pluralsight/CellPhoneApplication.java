package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone myPhone;
        myPhone = new CellPhone(123456, "iPhone", "T-Mobile", "347-123-4567", "Dave");

        System.out.println("Hello " + myPhone.owner + " I see you have an " + myPhone.model);

    }
}
