package day23_CustomMethods_Void;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        helloWorld5times();

        System.out.println("--------------------");

        helloCydeo5Times();

        System.out.println("---------------------");

        evenNumbers();
    }

    public static void helloWorld5times (){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");

        }

    }

    public static void helloCydeo5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");

        }
    }

    public static void evenNumbers(){

        for (int i = 2; i < 11; i+=2) {
            System.out.println(i);

        }
    }

}
