package Kształty;


/**
 * @author Jakub Marciniak
 */


import java.util.Scanner;


public class Circle {
    public static void main(String[] args) {

        // TODO Pobieranie z klawiatury

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Calculete the Volume-(Objętość) of sphere-(Kula)");
        System.out.println("Give me Radius (promień): ");
        double radius = keyboard.nextDouble();
        double PI = 3.14285714286;

        double Volume = (4.0 / 3.0) * PI * (radius * radius * radius);
        System.out.println("Volume of sphere= " + Volume + "\n");

    }
}
