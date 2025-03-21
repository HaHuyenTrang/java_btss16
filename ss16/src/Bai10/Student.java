package Bai10;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private double gpa;

    public Student() {
    }

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public void inputData(Scanner sc){
        System.out.println("Nhập id:");
        this.id = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập tên");
        this.name = sc.nextLine();

        System.out.println("Nhập GPA");
        this.gpa = Double.parseDouble(sc.nextLine());
    }
}
