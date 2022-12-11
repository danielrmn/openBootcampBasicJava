package sesiones_7_8_9;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //stringVector();
        //intVector();
        //addvector();
        //arrayAndLinkedlist();
        //bucleArray();
        //DividePorCero();
        stream();
    }

    // 1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
    public static void stringVector(){
        String vector[] = new String[3];
        vector[0] = "hola ";
        vector[1] = "mundo";
        vector[2] = ", soy un vector";

        for (String vectores : vector){
            System.out.print(vectores);
        }
    }

    //2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
    public static void intVector(){
        int vectorInt[] = new int[3];
        vectorInt[0] = 10;
        vectorInt[1] = 20;
        vectorInt[2] = 30;

        for (int i=0; i < vectorInt.length; i++){
            System.out.println("posicion: " + i + " contenido: " + vectorInt[i]);
        }
    }

    //3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
    public static void addvector(){
        Vector numero = new Vector(5);

        numero.add(5);
        numero.add(10);
        numero.add(15);
        numero.add(20);
        numero.add(25);

        System.out.println("contenido vetor con 5 elmentos: "+ numero);

        numero.remove(1);
        numero.remove(2);

        System.out.print("contenido vetor con 3 elmentos: " + numero);
    }

    //4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
    /*
    * Un vector por defecto tiene 10 pero cada que agregamos mas de esa cantidad, se incrementan 10 mas.
    * si sabemos que tendremos 1000 elementos, podemos adaptar el vector a  una capacidad de 1000 elemetos.
    * Si no hacemos esto, se crearan 100 arrays en el proceso y eso consumira mucha memoria.
    * */

    //5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
    public static void arrayAndLinkedlist(){
        ArrayList<String> listaA = new ArrayList<>();
        listaA.add("H");
        listaA.add("O");
        listaA.add("L");
        listaA.add("A");

        System.out.println("Lista con ArrayLista: " + listaA);

        LinkedList<String> listaL = new LinkedList<String>();
        listaL.add(String.valueOf(listaA));
        System.out.println("Lista con LinkedList: " + listaL);
    }

    //6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
    // con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final.
    // Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

    public static void bucleArray(){
        ArrayList<Integer> numero = new ArrayList<>();
        for (int i=0; i <11; i++){
            numero.add(i);
        }
        System.out.println("array completo: " + numero);

        for (int i=0; i<numero.size(); i++){
            if (numero.get(i)%2 ==0){
                numero.remove(i);
            }
        }
        System.out.println("array sin los indices pares: " + numero);
    }

    //7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
    // ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
    // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
    // Finalmente, mostraremos en cualquier caso: "Demo de código".
    public static void DividePorCero(){
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("ingrese el primer digito: ");
            int a = scan.nextInt();
            System.out.print("ingrese el segundo digito: ");
            int b = scan.nextInt();
            int result = a/b;

            System.out.println("el resultado de la division es: " + result);

        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }
    }

    //8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
    // La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
    public static void stream(){}
    public static String stream(String fileIn, String fileOut){
        try {
            InputStream in = new FileInputStream(fileIn); //obtenemos la direccion del fichero
            try {
                int dato = in.read(); //almacenamos los bytes de fileIn

                PrintStream fichero = new PrintStream(fileOut); // creamos el fichero de copia
                fichero.write(dato); // almacenamos los bytes de fileIn en fileOut
            } catch (IOException e) {
                System.out.println("no se pudo copiar el fichero" + e.getMessage()); // segunda excepcion, no se copio correctamente
            }
        } catch (FileNotFoundException e) {
            System.out.println("fichero no existe: " + e.getMessage()); // primera excepcion, no existe el fichero fileIn
        }

        return fileIn + fileOut;
    }

    //9. Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream,
    // excepciones, un HashMap y un ArrayList, LinkedList o array.
}
