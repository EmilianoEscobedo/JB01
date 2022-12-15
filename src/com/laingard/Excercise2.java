package com.laingard;

import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {

    /* Exercise 2
     *
     * Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
     * */
    Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio: ");
    double price = scanner.nextInt();
        System.out.println(priceWithIVA(price));
}
    static double priceWithIVA(double price){
        double iva = price * 0.21;
        return price + iva;
    }
}
