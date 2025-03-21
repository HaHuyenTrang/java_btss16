package Bai3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> listDouble = new ArrayList<>();

        listDouble.add(-2.5);
        listDouble.add(11.0);
        listDouble.add(21.3);
        listDouble.add(30.4);
        listDouble.add(-40.5);

        System.out.println("Danh sách các phần tử:");
        for (int i = 0; i < listDouble.size(); i++) {
            System.out.println(listDouble.get(i));
        }

        double max = listDouble.get(0);
        double min = listDouble.get(0);

        for(int i = 1; i < listDouble.size(); i++) {
            if(listDouble.get(i) > max) {
                max = listDouble.get(i);
            }

            if(listDouble.get(i) < min) {
                min = listDouble.get(i);
            }
        }

        System.out.printf("số lớn nhất là: %.2f, số nhỏ nhất là: %.2f\n", max, min);
    }
}
