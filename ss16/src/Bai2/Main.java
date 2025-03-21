package Bai2;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> listNum = new ArrayList();

        listNum.add(1);
        listNum.add(2);
        listNum.add(3);
        listNum.add(4);
        listNum.add(5);
        listNum.add(6);
        listNum.add(7);
        listNum.add(8);
        listNum.add(9);
        listNum.add(10);

        System.out.println("Danh sách các phần tử ban đầu:");
        for(int i = 0; i < listNum.size(); i++){
            System.out.println(listNum.get(i));
        }

        for(int i = 0; i < listNum.size(); i++){
            if (listNum.get(i) % 3 == 0){
                listNum.remove(i);
            }
        }

        System.out.println("Danh sách các phần tử sau khi xóa:");
        for(int i = 0; i < listNum.size(); i++){
            System.out.println(listNum.get(i));
        }
    }
}
