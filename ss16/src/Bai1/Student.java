package Bai1;


import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private double gpa;

    public Student() {}

    public void inputData(Scanner sc) {
        System.out.print("Nhập ID: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập Tên: ");
        this.name = sc.nextLine();
        System.out.print("Nhập GPA: ");
        this.gpa = Double.parseDouble(sc.nextLine());
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
}
