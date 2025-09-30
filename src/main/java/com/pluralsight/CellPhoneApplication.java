package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        int userSerialNumber = myScanner.nextInt();
        myScanner.nextLine();

        System.out.print("What model is the phone? ");
        String userPhoneModel = myScanner.nextLine();

        System.out.print("Who is the carrier? ");
        String userCarrier = myScanner.nextLine();

        System.out.print("What is the phone number? ");
        String userPhoneNumber = myScanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String ownerName = myScanner.nextLine();

        Cellphone phoneInformation = new Cellphone();

        phoneInformation.setSerialNumber(userSerialNumber);
        phoneInformation.setModel(userPhoneModel);
        phoneInformation.setCarrier(userCarrier);
        phoneInformation.setPhoneNumber(userPhoneNumber);
        phoneInformation.setOwner(ownerName);

        System.out.println();
        System.out.println(phoneInformation.getSerialNumber());
        System.out.println(phoneInformation.getModel());
        System.out.println(phoneInformation.getCarrier());
        System.out.println(phoneInformation.getPhoneNumber());
        System.out.println(phoneInformation.getOwner());
    }
}
