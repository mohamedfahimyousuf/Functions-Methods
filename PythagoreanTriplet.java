import java.util.*;

class PythagoreanTriplet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a Num 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter a Num 3: ");
        int num3 = sc.nextInt();
        triplet(num1, num2, num3);
        sc.close();
    }
    static void triplet(int a, int b ,int c){
        int lhs = (a*a)+(b*b);
        int rhs = c*c;
        System.out.println("Pythagorean Triplet: a*a + b*b = c*c");
        if(lhs == rhs){
            System.out.println("It is a Pythagorean Triplet");
        }
        else{
            System.out.println("It is not a Pythagorean Triplet");
        }
    }
}
