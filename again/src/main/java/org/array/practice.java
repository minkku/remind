package org.array;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        // create array
        String[] myArray = {"co2", "co3", "co4"};

        //change "co3" into "water"
        myArray[1] = "water";
        System.out.println(Arrays.toString(myArray)); // result = [co2, water, co4];

        // not to use Arrays.toString() will show just hashcode for array infos
        System.out.println(myArray); // result = [Ljava.lang.String;@ba8a1dc

        // change 2nd result into 0 result
        myArray[2] = myArray[0];
        System.out.println(Arrays.toString(myArray));
    }
}
