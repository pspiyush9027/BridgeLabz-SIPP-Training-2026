import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter height: ");
        int height = sc.nextInt();

        int areaCm = (int)(0.5 * base * height);
        int areaIn = (int)(areaCm / 6.4516);

        System.out.println("Area in sq cm = " + areaCm);
        System.out.println("Area in sq inch = " + areaIn);
    }
}