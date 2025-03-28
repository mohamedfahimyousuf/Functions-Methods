import java.util.*;
public class SumOfNaturalNumbers {

    public static int sumOfNaturalNum(int n) {
        return (n * (n + 1)) / 2; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum = sumOfNaturalNum(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
