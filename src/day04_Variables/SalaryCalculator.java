package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 65;
        int weeklyHour = 45;
        int numberOfWeeks = 52;

        int salary = hourlyRate * weeklyHour * numberOfWeeks;
        //System.out.println(salary);

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHour = " + weeklyHour);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);


    }
}
