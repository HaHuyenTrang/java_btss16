package Bai1;

import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> listStudent = new ArrayList<>();
        listStudent.add("Hà Huyền Trang");
        listStudent.add("Nguyễn Thị Thu Quỳnh");
        listStudent.add("Phạm Phương Anh");
        listStudent.add("Nguyễn Thị LAn Anh");
        listStudent.add("Hà Huỳn Cheng");

        // Vòng lặp for
        System.out.println("Vòng lặp for");
        for(int i = 0; i < listStudent.size(); i++){
            System.out.println(listStudent.get(i));
        }

        // Vòng lặp foreach
        System.out.println("Vòng lặp foreach");
        for(String student : listStudent){
            System.out.println(student);
        }

        // Iterator
        System.out.println("Vòng lặp iterator");
        Iterator<String> iteratorStudent = listStudent.iterator();

        while(iteratorStudent.hasNext()){
            String student = iteratorStudent.next();
            System.out.println(student);
        }
    }
}
