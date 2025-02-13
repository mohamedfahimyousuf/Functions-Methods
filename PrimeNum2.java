import java.util.*;
class PrimeNum2{
    
    static boolean isprimenum(int n){
        
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static void primenum(int start, int end){
        for(int i = start;i<=end;i++){
            if(isprimenum(i)){
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting Number : ");
        int start = sc.nextInt();
        System.out.println("Enter the Ending Number : ");
        int end = sc.nextInt();
        System.out.println("Prime Numbers between "+start+"to "+end+" are: ");
        primenum(start,end);
        sc.close();
    }      
    }
