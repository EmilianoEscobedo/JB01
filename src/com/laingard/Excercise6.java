package com.laingard;

//Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
public class Excercise6 {
    public static void main(String[] args) {

        System.out.println(reverse("hola mundo"));

    }
    public static String reverse(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }
}
