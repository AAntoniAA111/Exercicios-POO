package retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        AreaRetangulo area = new AreaRetangulo();//instancia

        System.out.println("Enter with width and height:");
        area.setWidth(sc.nextDouble());
        area.setHeight (sc.nextDouble());

        System.out.println("Area total: " + area.area());

        System.out.printf("Area: %.2f%n", area.area());
        System.out.printf("Perimetro: %.2f%n", area.perimetro());
        System.out.printf("Diagonal: %.2f%n", area.diagonal());

        sc.close();
    }
}


