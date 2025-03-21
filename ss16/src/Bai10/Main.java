package Bai10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> listStudents = new ArrayList<>();

        int num = 2;
        for (int i = 0; i < num; i++) {
            System.out.printf("Nhập thông tin sinh viên %d:\n", i + 1);
            Student student = new Student();
            student.inputData(sc);
            listStudents.add(student);
        }

        do {
            System.out.println("------------------MENU-----------------");
            System.out.println("1. In danh sách sinh viên");
            System.out.println("2. Tìm kiếm sinh viên theo tên");
            System.out.println("3. Phân loại sinh viên theo GPA");
            System.out.println("4. Thoát");
            System.out.printf("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách sinh viên:");
                    for (Student s : listStudents) {
                        System.out.println("Id: " + s.getId() + "  Tên: " + s.getName() + "  GPA: " + s.getGpa());

                    }
                    break;
                case 2:
                    System.out.println("Nhập tên sinh viên cần tìm:");
                    String name = sc.nextLine();

                    boolean isFound = false;
                    for(Student s : listStudents){
                        if(s.getName().equals(name)){
                            System.out.println("Id: " + s.getId() + "  Tên: " + s.getName() + "  GPA: " + s.getGpa());
                            isFound = true;
                        }
                    }

                    if(!isFound){
                        System.out.println("Không tìm thấy sinh viên: " + name);
                    }
                    break;
                case 3:
                    System.out.println("Phân loại sinh viên theo GPA:");

                    for(Student s : listStudents){
                        if(s.getGpa() >= 8.5){
                            System.out.println(s.getName() + " - Xuất sắc");
                        }else if(s.getGpa() >= 7){
                            System.out.println(s.getName() + " - Giỏi");
                        }else if(s.getGpa() >= 5.5){
                            System.out.println(s.getName() + " - Khá");
                        }else{
                            System.out.println(s.getName() + " - Trung bình/Yếu");
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("chọn lại từ 1-4");
            }
        } while (true);
    }
}
