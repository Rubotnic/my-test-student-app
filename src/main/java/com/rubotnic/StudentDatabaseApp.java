package com.rubotnic;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        System.out.print("Enter number of new student we want to enroll: ");
        Scanner in = new Scanner(System.in);

        int numberOfStudents = in.nextInt();
        Student[] students = new Student[numberOfStudents];

        // Create n number of new student
        for(int n=0; n<numberOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }
        for (int n=0; n<numberOfStudents; n++) {
            System.out.println(students[n].showInfo());
        }

//        Student stu1 = new Student();
//        stu1.enroll();
//        stu1.payTuition();
//        System.out.println(stu1.toString());
//
//        Student stul2 = new Student();
//        stul2.enroll();
//        stul2.payTuition();
//        System.out.println(stul2.toString());
//
//        Student stu3 = new Student();
//        stu3.enroll();
//        stu3.payTuition();
//        System.out.println(stu3.toString());

    }
}