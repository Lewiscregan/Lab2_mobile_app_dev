import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int max = Max(array);
        int min = Min(array);

        System.out.println("Max Value: " + max);
        System.out.println("Min Value: " + min);
    }
    static int Max(int[]array){
        int max = array[0];
        for (int num : array){
            if(num>max){
                max=num;
            }
        }
        return max;
    }

    static int Min(int[]array){
        int min = array[0];
        for (int num : array){
            if(num<min){
                min=num;
            }
        }
        return min;
    }
}