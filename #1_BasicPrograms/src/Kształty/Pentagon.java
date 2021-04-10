package Kształty;

/**
 * @author Jakub Marciniak
 */

import java.util.Scanner;

/**
 * Program do Oblicznia obszaru pięciokąta (Pole)
 * Obilczanie obwodu
 */

public class Pentagon {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj Bok Pentagonu: ");
        double sBok = keyboard.nextDouble();

        System.out.println("Podaj Apoteum(długość od środka boku do środka pięciokąta)");
        double aApoteum = keyboard.nextDouble();

        double Pole = (5.0 / 2.0) * sBok * aApoteum;
        double Obwod = 5 * sBok;

        System.out.println("Pole = " + Pole);
        System.out.println("Obwod = " + Obwod);

    }
}
