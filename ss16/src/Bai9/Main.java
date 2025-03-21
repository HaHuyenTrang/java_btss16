package Bai9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<>();

        listNum.add(1);
        listNum.add(2);
        listNum.add(3);
        listNum.add(4);
        listNum.add(5);
        listNum.add(6);
        listNum.add(7);
        listNum.add(8);
        listNum.add(9);

        ArrayList<Integer> evenNumbers = new ArrayList<>();//Số chẵn
        ArrayList<Integer> oddNumbers = new ArrayList<>();//Số lẻ
        ArrayList<Integer> primeNumbers = new ArrayList<>();//Số nguyên tố

        for (int num : listNum) {
            if (!evenNumbers.contains(num) && !oddNumbers.contains(num) && !primeNumbers.contains(num)) {
                if (isPrime(num)) {
                    primeNumbers.add(num);
                } else if (num % 2 == 0) {
                    evenNumbers.add(num);
                } else {
                    oddNumbers.add(num);
                }
            }
        }

        System.out.println("các số chia hết cho 2 không phải số nguyên tố");
        for (int num : evenNumbers) {
            System.out.println(num);
        }

        System.out.println("các số không chia hết cho 2 không phải số nguyên tố");
        for (int num : oddNumbers) {
            System.out.println(num);
        }

        System.out.println("các số nguyên tố là:");
        for (int num : primeNumbers) {
            System.out.println(num);
        }
    }


    //Nếu number < 2, không phải số nguyên tố.
    //Duyệt từ 2 đến √number, nếu chia hết thì không phải số nguyên tố.
    //Nếu không chia hết cho số nào, đó là số nguyên tố.
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
