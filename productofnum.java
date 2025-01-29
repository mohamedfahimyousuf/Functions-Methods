
import java.util.*;

public class productofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = sc.nextInt();
        int product = product(num1, num2);
        System.out.println("The Product of Two Number is: "+product);
        sc.close();
    }

    static int product(int a , int b){
        return a*b;
    }
    
}
