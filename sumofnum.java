import java.util.*;

public class sumofnum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number 1: ");
    int num1 = sc.nextInt();
    System.out.println("Enter number 2: ");
    int num2 = sc.nextInt();
    int sum = sum(num1, num2);
    System.out.println("Sum of two numbers is : "+sum);
    }

    static int sum(int  a , int b){
        return a+b;
    }
    
}

