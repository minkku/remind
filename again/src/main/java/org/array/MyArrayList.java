package org.array;


import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        // 리스트 객체 생성
        ArrayList<Integer> list = new ArrayList<>();

        // 값 추가
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);

        System.out.println(list.get(2));
        System.out.println(list);
    }
}
