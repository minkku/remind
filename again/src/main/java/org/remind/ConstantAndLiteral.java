package org.remind;

public class ConstantAndLiteral {
    public static void main(String[] args) {
        /*
         * 상수 선언은 변수 선언과 같음
         * 앞에 final를 붙여주면 된다.
         * */

        final int MAX_SPEED = 10; // 상수 MAX_SPEED를 선언 & 초기화
        // 상수는 선언과 동시에 초기화 해야함
        // 상수이름은 암묵적으로 대문자로 한다

        final int MAX_SPPED; // Error
        final int MAX_VALUE = 100; // 200 OK
//        MAX_VALUE = 200; // Error, cannot change constant values;

        // 리터럴 (Literal) : 그 자체로 값을 의미하는 것
        // 상수를 '값을 한번 저장하면 변경할 수 없는 저장공간'으로 정의하였기 떄문에 이와 구분을 위해 상수를 다른 이름으로 리터럴
        /*
        * int year = 2024;  // year = 변수, 2024, 100 = 리터럴
        * final int MAX_VALUE = 100;    // MAX_VALUE = 상수
        * */
    }

}
