package Bai8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<>();

        listString.add("trang");
        listString.add("t");
        listString.add("");
        listString.add("a");
        listString.add("n");
        listString.add("g");

        for(int i = 0; i < listString.size() - 1; i++) {
            //Nếu chuỗi j dài hơn chuỗi j+1, thì đổi chỗ.
           // Nếu chuỗi j và j+1 có cùng độ dài, thì so sánh theo thứ tự từ điển (compareTo()).
            boolean isSwapped = false;
            for(int j = 0; j < listString.size() - i - 1; j++) {
                if(listString.get(j).length() > listString.get(j + 1).length() ||
                        (listString.get(j).length() == listString.get(j + 1).length() &&
                                listString.get(j).compareTo(listString.get(j + 1)) > 0)) {
                    String temp = listString.get(j);
                    listString.set(j, listString.get(j + 1));
                    listString.set(j + 1, temp);
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }

        System.out.println("Mảng sau khi sắp xếp là:");
        for (String s : listString) {
            System.out.println(s);
        }
    }
}
