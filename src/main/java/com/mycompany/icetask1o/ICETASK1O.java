/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask1o;

/**
 *
 * @author emeris
 */
import java.util.Scanner;
public class ICETASK1O {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //1. Requirements, username, and password
        Scanner input = new Scanner(System.in);
        String correctUsername = "Student";
        String username = " Student";
        String correctPassword = " Password009";
        System.out.println("Enter username");
        String password = input.nextLine();
        
        //3.Both username and ppassword are correct, Grant access
        if (username.equals(correctUsername) && password.equals(correctPassword)){
            System.out.println("Acces granted. Welcome to the school of Computer Science LMS 2026");
            displayStudentInformation();
        } else { //2 incorrect username/password on display
            System.out.println("Incorrect username/password.Goodbye. Please try again");
        }
        input.close();
    }
    //4 A method to display student information
    public static void displayStudentInformation(){
        System.out.println();
        System.out.println("------------------Student Information------------------");
        System.out.println("Student Name: Boitumelo Tema");
        System.out.println("Year Of Study: First Year");
        System.out.println("Group Number: Group 4");
        System.out.println("Module Name: Pragramming 1A");
        System.out.println("Qualification: BCAD");
    }
}
