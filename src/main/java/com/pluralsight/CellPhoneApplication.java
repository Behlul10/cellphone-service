package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone myPhone = new CellPhone();
        Scanner myScanner = new Scanner(System.in);
        String userInput;

//        int serialNumber = 1234567;
//        String phoneModel = "iPhone 12 Pro Max";
//        String carrier = "T-Mobile";
//        String phoneNumber = "347-123-4567";
//        String owner = "Dave";


        System.out.println("What is the serial number? ");
        int serialNumber = Integer.parseInt(myScanner.nextLine());
        myPhone.setSerialNumber(serialNumber);

        System.out.println("What model is the phone? ");
        String phoneModel = myScanner.nextLine();
        myPhone.setModel(phoneModel);

        System.out.println("Who is the carrier? ");
        String carrier = myScanner.nextLine();
        myPhone.setCarrier(carrier);

        System.out.println("What is the phone number? ");
        String phoneNumber = myScanner.nextLine();
        myPhone.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone? ");
        String owner = myScanner.nextLine();
        myPhone.setOwner(owner);


        System.out.println("Hello " + myPhone.getOwner() + " I see your serial number " + myPhone.getSerialNumber());
        System.out.println("Your carrier: " + myPhone.getCarrier() + " and I see that you have have a " + myPhone.getModel());

    }
}
