import java.util.*;
public class CircumferenceAndArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        Double radius = sc.nextDouble();
        Double circumference = circumference(radius);
        Double area = area(radius);
        System.out.printf("The Circumference of Circle is: %.2f\n",circumference);
        System.out.printf("The area of circle is: %.2f",area);
        sc.close();
    }

    public static Double circumference(Double radius){
        return 2*Math.PI*radius;
    }

    public static Double area(Double radius){
        return Math.PI*radius*radius;
    }
    
}
