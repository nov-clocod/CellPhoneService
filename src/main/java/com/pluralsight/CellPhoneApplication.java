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

        Cellphone phone1 = new Cellphone();

        phone1.setSerialNumber(userSerialNumber);
        phone1.setModel(userPhoneModel);
        phone1.setCarrier(userCarrier);
        phone1.setPhoneNumber(userPhoneNumber);
        phone1.setOwner(ownerName);

        Cellphone phone2 = new Cellphone();
        phone2.setSerialNumber(98753);
        phone2.setModel("iPhone 6s Plus");
        phone2.setCarrier("AT&T");
        phone2.setPhoneNumber("932-473-0852");
        phone2.setOwner("Wyatt Blake");

        display(phone1);
        display(phone2);

        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());

        myScanner.close();
    }

    public static void display(Cellphone phone) {
        System.out.println();
        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());
    }
}
