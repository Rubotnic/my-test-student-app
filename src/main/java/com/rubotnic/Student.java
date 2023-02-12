package com.rubotnic;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastname;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private static int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;


    public Student(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastname = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

//        System.out.println(firstName + " " + lastname + " " + gradeYear + " " + studentID);
    }

    //Generate an ID
    private void setStudentID(){
        // Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;

    }

    //Enroll in courses
    public void enroll() {
        // Get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                System.out.println("BREAK!");
                break;
            }
        } while (1 != 0);
//            System.out.println("ENROLLED IN: " + courses);
    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance is: £" + tuitionBalance);
    }

    // Pay Tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: £");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thanks you for your of £" + payment);
        viewBalance();
    }

    // Show status
    public String showInfo() {
        return "Name: " + firstName + " " + lastname +
                "\nGrade Level:" + gradeYear +
                "\nStudent ID" + studentID +
                "\nCourses Enrolled" + courses +
                "\nBalance: £" + tuitionBalance;
    }



}
