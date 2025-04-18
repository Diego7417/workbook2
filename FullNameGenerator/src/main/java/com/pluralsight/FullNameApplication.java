package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name here");

        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Middle name: ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Suffix");
        String suffix = scanner.nextLine().trim();

        String fullName = "";
        if  (!firstName.isEmpty()){
            fullName = fullName + firstName;
        }if (!middleName.isEmpty()){
            fullName = fullName + middleName;
        }if (!lastName.isEmpty()){
            fullName = fullName + lastName;
        }
        System.out.println(fullName);



    }
}
