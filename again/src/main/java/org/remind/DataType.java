package org.remind;

import java.util.Date;

public class DataType {
    public static void main(String[] args) {
        /*
        * 값(data)의 종류(type)는 크게 '문자와 숫자'로 나눌 수 있다
        * 숫자의 경우 '정수와 실수'로 나뉨
        * */

        // Data 클래스 타입의 참조변수 today를 선언
        // 참조변수는 null 또는 객체의 주소를 값으로 갖으며 참조변수의 초기화는 다음과 같이 함

        Date today = new Date(); // Date 객체를 생성, 그 주소를 today에 저장

        /*
        * 객체를 생성하는 연산자 new의 결과는 생성된 객체의 주소
        * 이 주소가 대입연산자 '=' 에 의해서 참조변수 today에 저장됨
        * */
    }
}
