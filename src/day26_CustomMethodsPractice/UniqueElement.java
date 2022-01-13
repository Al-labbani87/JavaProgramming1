package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElement {

    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,3,4,5,5,6,7,7,7};
        int[] unique = uniqueElements(array);

        System.out.println(Arrays.toString(unique));

        System.out.println("----------------------------");

        double[] array2 = {1.4,1.6,2.2,2.5,3.5,3.5,4.6,5.5,5.6,6.5,7.5,7.5,7.5};
        double[] unique2 = uniqueElements(array2);

        System.out.println(Arrays.toString(unique2));

    }

    public static int[] uniqueElements(int[] array){
        int[] result = {}; // new int[0]
        for (int each : array){

            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if the frequency is one , the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static double[] uniqueElements(double[] array){
        double[] result = {}; // new int[0]
        for (double each : array){

            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if the frequency is one , the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static char[] uniqueElements(char[] array){
        char[] result = {}; // new int[0]
        for (char each : array){

            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if the frequency is one , the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static String[] uniqueElements(String[] array){
        String[] result = {}; // new int[0]
        for (String each : array){

            if (ArraysUtility.frequencyOfElement(array,each) == 1){ // if the frequency is one , the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
}
