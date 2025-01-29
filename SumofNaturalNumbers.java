import java.util.*;
public class SumOfNaturalNumbers {

    public static int sumOfNaturalNumber(int n) {
        return (n * (n + 1)) / 2; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = sumOfNaturalNumber(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
