package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

          String name = "Fady Allabbani",
          buildingNumber = "5340",
          streetName = "Holmes run pkwy",
          city =  "Alexandria",
          state = "VA",
          zipCode = "22304";

          String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + " " + state +  " " + zipCode;

       // System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + " " + state +  " " + zipCode);
        System.out.println(address);


    }
}
