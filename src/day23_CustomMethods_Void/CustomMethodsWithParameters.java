package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

      //  oddOrEven(); // the method demands additional info to complete its task

        oddOrEven(10);

        System.out.println("---------------------");

        ageOfPerson(1988);
    }

    public static void oddOrEven(int number){
        if (number % 2 ==0){
            System.out.println(number +" is even number");
        }else {
            System.out.println(number +" is odd number");
        }

    }

    public static void ageOfPerson(int birthYear){

        int age = 2021 - birthYear;
        System.out.println("Your age is: "+age);

    }


}
