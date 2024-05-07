package org.array;

import java.util.HashMap;

public class HashMapp {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        System.out.println(map);

        String key = "apple";

        // 키가 해시맵에 있는지 확인
        if(map.containsKey(key)) {
            int value = map.get(key);
            System.out.println(key + ": " + value);
        } else {
            System.out.println(key + "는 해시맵에 없습니다.");
        }
    }
}
