package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Fady";
        String lastName = "Allabbani";
        int age = 33;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;
        System.out.println("Full name of the person is " + fullName);
        System.out.println(fullName + " is " + age + " Years old");
        System.out.println(fullName + " is " + jobTitle + ", work at " + companyName + ", and " + firstName + "'s salary is $" + salary);
    }
}
