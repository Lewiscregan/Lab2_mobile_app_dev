import java.util.Scanner;

public class Q5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = sc.next(), reverse = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverse = reverse + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverse.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
