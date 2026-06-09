import java.util.*;
class heightTocm{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float height = sc.nextFloat();
        float inch =height*12;

        float cm =inch*2.54f;

        System.out.println("Your Height in cm is "+cm+" while in feet is "+height+" and inches is "+inch);
    }
}