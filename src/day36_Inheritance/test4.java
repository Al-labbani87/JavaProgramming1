package day36_Inheritance;

import java.util.Arrays;

public class test4 {

    public static void main(String[] args) {

        int [] num ={1,2,3,4,5};


        int [] reverse = new int [num.length];



        for (int i = num.length-1,j=0; i < 0 ; i--,j++) {

            reverse[j] = num[i];

        }

        System.out.println(Arrays.toString(reverse));



    }


    public static class FizzBuzz {

        public static void main(String[] args) {


            for (int i = 1; i < 100; i++) {
                if (i % 15 == 0){
                    System.out.println("FizzBuzz");
                }
                else if (i % 5 == 0){
                    System.out.println("Buzz");
                }
                else if (i % 3 == 0){
                    System.out.println("Fizz");
                }
                else {
                    System.out.println(i);
                }

            }


        }
    }
}
