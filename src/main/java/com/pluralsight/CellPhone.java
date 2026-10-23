package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

//    int serialNumber, String model, String carrier, String phoneNumber, String owner
    public CellPhone(){
        //Cellphone() (method) Constructor for CellPhone Class :D

        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }


    //region
    /*
    * Setters
     */
    public void setSerialNumber(int serialNumber){
        if (serialNumber >= 1_000_000 && serialNumber <= 9_999_999 ) {
            this.serialNumber = serialNumber;
        } else {
            System.out.println("Enter a valid range!");
            System.exit(1);
        }
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    //##########################################################
    /*
    *  Getters
     */

    public int getSerialNumber(){
        return this.serialNumber;
    }

    public String getModel() {
        return this.model;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getOwner() {
        return this.owner;
    }
    //endregion
}
