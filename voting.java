import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();
        if(isEligible(age)){
            System.out.println("The Person is eligible to vote");
        }
        else{
            System.out.println("The Person is not eligible to vote");
        }
    }

    static boolean isEligible(int age){
        if(age<18){
            return false;
        }
        else{
            return true;
        }
    }
}
