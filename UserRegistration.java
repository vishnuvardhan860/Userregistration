package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.*;


public class UserRegistration {
    Scanner sc = new Scanner(System.in);
    public void firstNameCheck(){
        System.out.print("Enter First Name of User: " );
        String  fName = sc.next();
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", fName);
        if (check)
            System.out.println("Perfect! First #Name");
        else
            System.out.println("Please Enter a Valid First name with Only \"One Starting Capital\" latter");
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserRegistration user = new UserRegistration();

        System.out.println("Welcome to User Registration Program");

        user.firstNameCheck();



    }
}