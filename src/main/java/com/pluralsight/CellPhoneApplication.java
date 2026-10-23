package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone cell1 = new CellPhone();
        CellPhone cell2 = new CellPhone();
        Scanner myScanner = new Scanner(System.in);

        //Cellphone 1 - USER Input
        System.out.println("What is the serial number? ");
        int serialNumber = Integer.parseInt(myScanner.nextLine());
        cell1.setSerialNumber(serialNumber);

        System.out.println("What model is the phone? ");
        String phoneModel = myScanner.nextLine();
        cell1.setModel(phoneModel);

        System.out.println("Who is the carrier? ");
        String carrier = myScanner.nextLine();
        cell1.setCarrier(carrier);

        System.out.println("What is the phone number? ");
        String phoneNumber = myScanner.nextLine();
        cell1.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone? ");
        String owner = myScanner.nextLine();
        cell1.setOwner(owner);

        //Cell 2
        cell2.setOwner("Bruce Wayne");
        cell2.setCarrier("T-Mobile");
        cell2.setModel("Samsung Galaxy Note 34 Ultra Pro Max");
        cell2.setPhoneNumber("347-299-9999");


        System.out.println("--- Cellphone 1 ----");
        display(cell1);
        System.out.println("--- Cellphone 2 ----");
        display(cell2);

        System.out.println("####################                                                                         ");
        cell1.dial(cell2.getPhoneNumber());

        myScanner.close();
    }

    public static void display(CellPhone phone) {
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Phone number: " + phone.getPhoneNumber());
    }
}
