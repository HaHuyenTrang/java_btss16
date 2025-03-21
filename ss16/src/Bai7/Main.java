package Bai7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listIntegers = new ArrayList<>();


        listIntegers.add(1);
        listIntegers.add(1);
        listIntegers.add(1);
        listIntegers.add(7);
        listIntegers.add(8);
        listIntegers.add(9);
        listIntegers.add(10);
        listIntegers.add(1);

        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        // Chứa số xuất hiện 1 lần
        ArrayList<Integer> multiNumbers = new ArrayList<>();
        // Chứa số xuất hiện nhiều lần
        ArrayList<Integer> numberCounts = new ArrayList<>();
        // Chứa số lần xuất hiện

        for(int num : listIntegers) {
            //Nếu số num đã có trong uniqueNumbers →
            // Xóa khỏi uniqueNumbers và thêm vào multiNumbers.
            if(uniqueNumbers.contains(num)) {
                uniqueNumbers.remove((Integer) num);

                if(!multiNumbers.contains(num)) {
                    multiNumbers.add(num);
                    numberCounts.add(2);
                }else{
                    int index = multiNumbers.indexOf(num);
                    numberCounts.set(index, numberCounts.get(index) + 1);
                }
            }else if(!multiNumbers.contains(num)) {
                uniqueNumbers.add(num);
                //Nếu num chưa có trong multiNumbers và uniqueNumbers →
                // Thêm vào uniqueNumbers.
            }else{
                int index = multiNumbers.indexOf(num);
                numberCounts.set(index, numberCounts.get(index) + 1);
            }
        }

        System.out.println("Danh sách các phẩn tử chỉ xuất hiện 1 lần:");
        for (int i = 0; i < uniqueNumbers.size(); i++) {
            System.out.println(uniqueNumbers.get(i));
        }

        System.out.println("Danh sách các phẩn tử xuất hiện 2 lần trở lên:");
        for (int i = 0; i < multiNumbers.size(); i++) {
            System.out.println(multiNumbers.get(i) + " - " + numberCounts.get(i) + " lần");
        }
    }
}
