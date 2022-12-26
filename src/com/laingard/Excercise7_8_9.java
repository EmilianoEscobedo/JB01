package com.laingard;


import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.InputStream;

public class Excercise7_8_9 {
    public static void main(String[] args) {
        //1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String[] strArray = new String[2];
        strArray[0] = "Hola";
        strArray[1] = "Mundo";
        for (String str : strArray){
            System.out.println(str);
        }
        //2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

        int[][] intArray = new int[2][2];
        intArray[0][0] = 1;
        intArray[0][1] = 10;
        intArray[1][0] = 2;
        intArray[1][1] = 20;
        for (int[] ints : intArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        //3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2 y 3 elementos y muestra el resultado final.
        Vector<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        vector.remove(1);
        vector.remove(2);

        System.out.println(vector);

        // 4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

        // Si se crea el vector con la capacidad por defecto sería muy computacionalmente muy costoso, ya que al llenarse la misma, para evitar un overflow, esta se expande, pero para hacerlo copia el vector entero, crea uno nuevo con el doble de la capacidad original y vuelve a pegarlo, ocupando por consiguiente, el doble de posiciones de memoria en la operación.

        // 5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

        ArrayList<String> arrayLi = new ArrayList<>();
        arrayLi.add("Hola");
        arrayLi.add("Mundo");
        arrayLi.add("Que");
        arrayLi.add("Tal");

        LinkedList<String> linkedLi = new LinkedList<>(arrayLi);

        for( String item : arrayLi){
            System.out.println(item);
        }
        for( String item : linkedLi){
            System.out.println(item);
        }

        //6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los números pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        ArrayList<Integer> arrayInt = new ArrayList<>();

        for( int i = 1; i <= 10; i++){
            if (!(i % 2 == 0)) {
                arrayInt.add(i);
            }
        }

        for( int i : arrayInt){
            System.out.println(i);
        }

        //7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a quien llama del tipo ArithmeticException que será capturada por quien llama (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

        try {
            int divide = dividePorCero(2, 3);
            System.out.println(divide);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

        //8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
        copy("/home/laingard/IdeaProjects/JB01/test.txt","/home/laingard/IdeaProjects/JB01/test2.txt");

        //9. Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

        // To buy

        introduceProducts(false);
    }
    public static int dividePorCero (int A, int B) throws ArithmeticException {
        return (A / 0) + (B / 0);
    }
    public static void copy (String FileIn, String FileOut) {
        byte[] data = new byte[100];
        try{
            InputStream in = new FileInputStream(FileIn);
            in.read(data);
            in.close();
            OutputStream out = new FileOutputStream(FileOut);
            out.write(data);
            out.close();
        }catch (Exception e){
            e.getStackTrace();
        }
    }
    public static void introduceProducts(boolean enumerated){
        Scanner scanner = new Scanner(System.in);
        String product;
        ArrayList<String> list = new ArrayList<>();
        do {
            System.out.println("Please introduce a new Product, to exit introduce 'code0'");
            product = scanner.next();
            list.add(product);
        }while (!product.equals("code0"));
        list.remove("code0");
        if (enumerated){
           printMap(list);
        }else{
            printList(list);
        }
    }
    public static void printMap(ArrayList<String> list){
        HashMap<Integer, String> hashmap = new HashMap<>();
        for (int i = 0; i < list.size(); i++){
            hashmap.put(i, list.get(i));
        }
        for (Map.Entry<Integer, String> entry : hashmap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public static void printList(ArrayList<String> list){
        for (String item : list){
            System.out.println(item);
        }
    }
}
