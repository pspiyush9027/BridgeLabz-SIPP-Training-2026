import java.util.*;

public class Devisor{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int quatient = n1/n2;
        int reminder = n1%n2;
        System.out.println("The Quotient is "+quatient+" and Reminder is"+reminder+"of two number"+n1+"and"+n2);


     }
}