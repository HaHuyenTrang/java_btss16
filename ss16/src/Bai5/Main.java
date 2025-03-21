package Bai5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<>();

        listNum.add(1);
        listNum.add(2);
        listNum.add(3);
        listNum.add(2);
        listNum.add(4);
        listNum.add(1);
        listNum.add(5);

        // Danh sách chứa các số duy nhất
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        // Danh sách chứa số lần xuất hiện của từng số
        ArrayList<Integer> numberCounts = new ArrayList<>();

        for (int num : listNum) {
            int index = uniqueNumbers.indexOf(num);
            if (index != -1) {
                // Nếu số đã có trong danh sách, tăng số lần xuất hiện lên 1
                numberCounts.set(index, numberCounts.get(index) + 1);
            } else {
                // Nếu số chưa có trong danh sách, thêm vào
                uniqueNumbers.add(num);
                numberCounts.add(1);
            }
        }

        for (int i = 0; i < uniqueNumbers.size(); i++) {
            System.out.println(uniqueNumbers.get(i) + " - " + numberCounts.get(i) + " lần.");
        }
    }
}
