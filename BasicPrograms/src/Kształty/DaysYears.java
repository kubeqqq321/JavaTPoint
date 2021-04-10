package Kształty;

import java.util.Scanner;

public class DaysYears {
    public static void main(String[] args) {
        ConvertDaysIntoYears();
    }

    static void ConvertDaysIntoYears(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbe dni które zostaną zamienieone na lata: ");
        double Days = keyboard.nextInt();

        double NumberOfYears = Days / 365;

        if(Days == 365)
        {
            System.out.println("Tyle Dni = " + Days + ", to Rok = " + NumberOfYears);
        }
        else{
            System.out.println("Tyle Dni = " + Days + ", to tyle Lat = " + NumberOfYears);
        }

    }


}
