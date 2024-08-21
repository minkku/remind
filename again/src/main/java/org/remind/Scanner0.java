package org.remind;

import java.util.Scanner;

public class Scanner0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner의 클래스 생성

        System.out.println("두자리 정수를 하나 입력해주세요 : ");

        String input = scanner.nextLine(); // 입력받은 내용을 input에 저장
        // nextLine() 메서드 호출시 입력 받은 값을 엔터를 누르면 변수에 저장 된다.
        int num = Integer.parseInt(input); // 입력받은 내용을 input타입 값으로 변환
        // 입력받은 문자열을 숫자로 변환 하려면 Integer.parseInt(); 사용

        System.out.println("입력내용 : " + input);
        System.out.printf("num = %d%n", num);
    }
}
