import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        System.out.println("Please enter your number");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0) System.out.println("Even Number");
        else System.out.println("Odd Number");
    }
}