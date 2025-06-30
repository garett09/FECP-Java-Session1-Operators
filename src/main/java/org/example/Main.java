package org.example;

import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner anInput;
        float tempCelsius = 0.0f;
        float tempFahrenheit = 0.00f;


        System.out.print("Enter temperature in Celsius: ");
        anInput = new Scanner (System.in);
        tempCelsius = anInput.nextFloat();

        tempFahrenheit = (tempCelsius * 9/5) +32;

        System.out.printf("Temperature in Fahrenheit: " + String.format("%.2f",tempFahrenheit));

    }
}