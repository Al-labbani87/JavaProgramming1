package day44_Abstraction.animalTask;

public abstract class Eagle extends Animal  implements Flyable{


    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating snake");
    }


}
