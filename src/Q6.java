import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Shape: S(Sphere) or C(Cylinder) ");
        String shape = sc.next();
        switch(shape.toUpperCase()){
            case "S":
                sphere();
                break;
            case "C":
                cylinder();
                break;
            default:
                System.out.println("invalid Choice.");
                break;
        }
    }
        static void sphere(){
            Scanner sc = new Scanner(System.in);
            double radius, volume;
            System.out.println("Enter Radius of Sphere");
            radius = sc.nextDouble();

            volume = (4.0 / 3) * Math.PI * radius * radius * radius;

            System.out.println("Sphere volume = ");
    }

    static void cylinder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        System.out.println("Enter the Height of the cylinder: ");
        double height = sc.nextDouble();

        double volume = (Math.PI * radius * radius) * height;
        System.out.println("Cylinder volume = " + volume);
    }
}