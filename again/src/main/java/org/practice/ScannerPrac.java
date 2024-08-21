package org.practice;

import java.util.Scanner;

public class ScannerPrac {
    public static void main(String[] args) {
        // 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
        Scanner sc = new Scanner(System.in);

        System.out.println("이름 : ");
        String name = sc.nextLine();

        System.out.println("성별 : ");
        String gender = sc.nextLine();

        System.out.println("나이 : ");
        int age = sc.nextInt();

        System.out.println("키 : ");
        int height = sc.nextInt();

        System.out.println("안녕하세요, " + name + "님. 당신의 신체 조건은 " + height + "에 " + age + "살이고 " + gender + "이네요. 반가워요 ^^" );
    }
}
