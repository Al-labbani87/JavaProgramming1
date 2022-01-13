package day35_Encapsulation;

public class Rectangle {


    private double width;
    private  double length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);

    }

    public double getWidth(double width){
        return width;
    }

    public void setWidth(double width){
        if (width < 0 ){
            System.out.println("With can not be negative: "+ width);
            System.exit(0);
        }
     this.width = width;



    }


    public double getLength(double length){
        return length;
    }

    public void setLength(double length){
        if (length < 0 ){
            System.out.println("With can not be negative: "+ length);
            System.exit(0);
        }
        this.length = length;
    }

    public double calcArea(){
        return length * width;
    }

    public double calPerimeter(){
        return (length + width) * 2;

    }


    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", Calculate Area=" + calcArea() +
                ", Calculate perimeter =" + calPerimeter() +
                '}';
    }
}
