package day26_CustomMethodsPractice;

public class testt1 {

    //create a method that can return max number between 2 integers
    public static String maxNumber(int num1, int num2) {
        String result = "";
        if (num1 > num2) {
            result = num1 + " is max number";
        } else {
            result = num2 + " is max number";
        }

        return result;

    }
}
