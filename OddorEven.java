import java.util.*;
public class OddorEven {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(iseven(num)){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        sc.close();
    }

    static boolean iseven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
