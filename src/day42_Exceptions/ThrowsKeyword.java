package day42_Exceptions;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {


        System.out.println("------test1---------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("--------------test 1 completed ");

        System.out.println("------------test 2---------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Hello Cydeo");


        System.out.println("----------test 2 completed");
    }
}
