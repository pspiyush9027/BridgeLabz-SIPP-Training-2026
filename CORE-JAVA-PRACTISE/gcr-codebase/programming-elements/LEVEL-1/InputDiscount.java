import java.util.*;
class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float fee = sc.nextFloat();
        float discountPercent= sc.nextFloat();

        float discountAmount =(fee * discountPercent)/100 ;
        float discountfee = fee - discountAmount;

        System.out.println("The discount amount is INR"+ discountAmount+"and final discounted fee is INR"+discountfee);
    }
}