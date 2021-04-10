package Kształty;

import jdk.dynalink.linker.GuardingTypeConverterFactory;

import java.util.Scanner;

public class CelsiusFahrenheit {

    public static void main(String[] args) {

        ConvertCelsiusIntoFahrenheit();
        ConvertFahrenheitIntoCelsius();

    }//main

    static void ConvertCelsiusIntoFahrenheit(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nConverter Celsius into Fahrenheit");
        System.out.println("Podaj wartość w Celcjuszach: ");
        double Celsius = keyboard.nextDouble();

        double CinF = ((Celsius * 9)/5.0) + 32.0;
        System.out.println("Temperatura w Farenhaitach = " + CinF);
    }//ConvertCelsiusIntoFahrenheit

    static void ConvertFahrenheitIntoCelsius(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nConverter Fahrenheit into Celsius");
        System.out.println("Podaj wartość w Farenhaithach: ");
        double Fahrenheit = keyboard.nextDouble();

        double FinC = ((Fahrenheit - 32.0) * 5.0 ) /9.0;
        System.out.println("Temperatura w Farenhaitach = " + FinC);
    }//ConvertFahrenheitIntoCelsius
}//CelsiusFahrenheit




