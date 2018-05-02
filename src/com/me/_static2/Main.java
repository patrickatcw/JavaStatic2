package com.me._static2;

import static com.me._static2.Multiplier.multiplier;
import static com.me._static2.Multiplier.multiply;
//note; imports required due to static

public class Main {

    public static void main(String[] args) {

        //step 4 calling method
        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);
        //run

        //results;
        /*  The answer is 42
            Multiplier is 7     */
    }

}
