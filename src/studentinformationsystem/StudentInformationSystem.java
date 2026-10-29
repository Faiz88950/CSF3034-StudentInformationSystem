/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;


public class StudentInformationSystem {

    private static int Total;

    public static void main(String[] args) {
       
        String studentName = "Muhammad Faiz";
        String studentID = "S88950";

        int mark1 = 45;
        int mark2 = 48;
        
        int total = mark1 + mark2;

        System.out.println("STUDENT INFORMATION SYSTEM");
        System.out.println("--------------------------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Mark: " + total);
        
        if (Total >= 80) {
            System.out.println("Result: Excellent");
        } else if (Total >= 50) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    }
    
}
