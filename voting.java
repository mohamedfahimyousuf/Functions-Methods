import java.util.*;

class voting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();
        if(isEligibleOrNot(age)){
            System.out.println("The Person is eligible to vote");
        }
        else{
            System.out.println("The Person is not eligible to vote");
        }
    }

    static boolean isEligibleOrNot(int age){
        if(age<18){
            return false;
        }
        else{
            return true;
        }
    }
}
