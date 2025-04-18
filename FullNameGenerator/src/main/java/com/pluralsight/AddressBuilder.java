package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder billingAddress = new StringBuilder();

        System.out.print("Full name");
        String fullName = scanner.nextLine();

        System.out.print("Billing Street");
        String billingStreet = scanner.nextLine();

        System.out.print("Billing City");
        String billingCity = scanner.nextLine();

        System.out.print("Billing State");
        String billingState = scanner.nextLine();

        System.out.print("Billing Zip");
        String billingZip = scanner.nextLine();

        billingAddress.append(fullName).append("\n");
        billingAddress.append(billingStreet).append("\n");
        billingAddress.append(billingCity).append(",").append(billingState).append(",").append(",").append(billingZip).append("\n");

        System.out.print("The Billing Address is:" + billingAddress);

        StringBuilder shippingAddress = new StringBuilder();


        System.out.print("Shipping Street");
        String shippingStreet = scanner.nextLine();

        System.out.print("Shipping City");
        String shippingCity = scanner.nextLine();

        System.out.print("Shipping State");
        String shippingState = scanner.nextLine();

        System.out.print("Shipping Zip");
        String shippingZip = scanner.nextLine();

        shippingAddress.append(shippingStreet).append("\n");
        shippingAddress.append(shippingCity).append(",").append(shippingState).append(",").append(",").append(shippingZip).append("\n");

        System.out.print( "The Shipping Address is:" + shippingAddress);












    }
}
