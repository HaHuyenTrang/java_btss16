package Bai4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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

        int sum = 0;

        for (int i = 0; i < listNum.size(); i++) {
            sum += listNum.get(i);
        }

        System.out.println("Tổng các phần tử trong mảng là: " + sum);
    }
}
