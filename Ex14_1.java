import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width :");
        rectangle.setWidth(scanner.nextDouble());
        System.out.print("Enter the height :");
        rectangle.setHeight(scanner.nextDouble());
        System.out.println("Your Rectangle \n "+ rectangle.display());
        System.out.println("Perimeter of the Rectangle :" +rectangle.getPerimeter());
        System.out.println("Area of the Rectangle :" +rectangle.getArea());
    }

}
