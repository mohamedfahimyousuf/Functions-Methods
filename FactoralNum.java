import java.util.*;

class FactorialNum{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = sc.nextInt();
    System.out.println("Factorial of "+num+" is: "+factorial(num));
    sc.close();
    }
    static int factorial(int num){
        int product =1;
        if(num ==1 || num ==0){
            return 1;
        }
        else{
            for(int i=1; i<=num; i++){
                product = product*i;
            }
            return product;
        }
    }
}
