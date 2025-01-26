import java.util.*;

class MinAndMax{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Number 3: ");
        int num3 = sc.nextInt();

        int minimum = min(num1, num2, num3);
        System.out.println("Minimum Number: "+minimum);

        int maximum = max(num1, num2, num3);
        System.out.println("Maximum Number: "+maximum);
        sc.close();

    }

    static int min(int a, int b, int c){
        int min = 0;
        if(a>min){
            min = a;
        }
        if(b<min){
            min = b;
        }
        if(c<min){
            min = c;
        }
        return min;
    }

    static int max(int a, int b, int c){
        int max = 0;
        if(a>max){
            max = a;
        }
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        return max;
    }
}