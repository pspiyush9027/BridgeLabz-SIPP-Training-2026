import java.util.*;
class InputKmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float km = sc.nextFloat();
        float c= sc.nextFloat();

        float miles= km*c;

        System.out.println("The distance "+km +"in miles is "+miles);
    }
}