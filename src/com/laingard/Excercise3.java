package com.laingard;

/* Exercise 3
 *
 * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
 * */
public class Excercise3 {
    public static void main(String[] args) {
        String[] nombres = {"pepe", "pepa", "pepo", "pupu"};
        System.out.println(concatText(nombres));
    }
    static String concatText(String[] names) {
        String text = "";
        for(String name : names) {
            text += name + " ";
        }
        return text;
    }
}
