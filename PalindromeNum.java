import java.util.*;

class PalindromeNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        palindrome(num);
        sc.close();
    }
    static void palindrome(int num){
        int rev = 0;
        int digit = num;
        while(num!=0){
            int rem = num%10;
            rev = rev*10+rem;
            num/=10;
        }
        if(digit == rev){
            System.out.println("It is a palindrome Number");
        }
        else{
            System.out.println("It is not a Palindrome Number");
        }
    }
}
