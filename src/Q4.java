import java.util.Scanner;

public class Q4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temperature value: ");
        double temp = sc.nextDouble();

        System.out.println("Enter Temperature Scale: C or F");
        String scale = sc.next();

        double celsius;
        switch(scale.toUpperCase()) {
            case "C":
                celsius = temp;
                break;
            case "F":
                celsius = (temp - 32) * 5 / 9;
                break;
            default:
                System.out.println("Invalid temperature scale.");
                return;
        }
        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println("Celsius: " + celsius + " C");
        System.out.println("Fahrenheit: " + fahrenheit + " F");
    }
}
