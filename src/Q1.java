import java.util.Scanner;

public class Q1 {

    public static void main(String[] args){
        System.out.println("Enter a positive Integer: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        for(int i= 1; i<= num;i++){

            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);



    }
}
