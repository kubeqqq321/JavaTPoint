package Kształty;
/**
 * @author Jakub Marciniak
 */

import java.util.Scanner;

/**
 *  (1) Liczenie pola Prostokąta i Obwodu
 *  Podawanie danych z klawiatury
 */
public class Rectangle {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me Height: ");
        double Height = keyboard.nextDouble();

        System.out.println("Give me Width: ");
        double Width = keyboard.nextDouble();

        double Pole = Height * Width;
        double Obwod = (2 * Height) + (2 * Width);

        System.out.println("Pole Prostokąta = " + Pole );
        System.out.println("Obwód Prostokąta = " + Obwod + "\n");


    }
}
