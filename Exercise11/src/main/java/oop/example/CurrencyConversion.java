package oop.example;
import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        double euros, usdollars, exchangerate;
        System.out.print("How many euros are you exchanging? ");
        euros = scnr.nextInt();
        System.out.print("What is the exchange rate? ");
        exchangerate = scnr.nextDouble();
        usdollars = ((euros*exchangerate) / 100);
        String strUsDollars = String.format("%.2f", usdollars);
        String strEuros = String.format("%.2f", euros);
        System.out.print( strEuros + " euros at an exchange rate of "+ exchangerate + " is\n" + strUsDollars + " U.S. dollars.");

    }
}
