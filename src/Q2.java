import java.util.Scanner;

public class Q2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean prime = false;

        for(int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                prime = true;
            }
        }
            if (!prime){
                System.out.println(num + " is a prime number.");
            }else{
                System.out.println(num + " is not a prime number");
            }

    }
}
