package org.remind;

public class Variable {
    public static void main(String[] args) {
        // 두 변수의 값 비교하기
        int x = 10;
        int y = 20;
        int tmp; // x값을 임시로 저장할 변수를 선언

        System.out.println("x: " + x + " y: " + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x : " + x + " y : " + y);

        /*
        *  1. 변수 x에 저장된 값을 변수 tmp에 저장
        *  x = 10
        * tmp = 0
        * y = 20
        *
        * change into
        *
        * x = 10
        * tmp = 10
        * y = 20
        *
        * 두 변수의 값을 교환하는것은 두 컵에 담긴 내용물을 바꾸려면 컵 하나가 더 필요하다고 보면 된다.
        * tmp 여분의 컵
        */

        // Naming of variables
        /*
        * 변수의 이름처럼 프로그래밍에서 사용하는 모든 이름을 '식별자(identifier)' 라고 한다.
        * */
    }
}
