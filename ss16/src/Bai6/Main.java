package Bai6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listIntegers = new ArrayList<>();

        listIntegers.add(3);
        listIntegers.add(3);
        listIntegers.add(3);
        listIntegers.add(3);
        listIntegers.add(3);


        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        for(int num : listIntegers) {
            int index = uniqueNumbers.indexOf(num);

            if(index == -1) {
                uniqueNumbers.add(num);
            }
        }

        for (int i = 0; i < uniqueNumbers.size(); i++) {
            System.out.println(uniqueNumbers.get(i));
        }
    }
}
