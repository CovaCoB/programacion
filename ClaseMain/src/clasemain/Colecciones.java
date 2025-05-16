/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasemain;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author coova
 */
public class Colecciones {

    public void mostrarLista(ArrayList<String> coleccion) {
        Scanner sc = new Scanner(System.in);
        //el usuario introduce la palabra
        System.out.println("Escribe una palabra");
        String palabra = sc.nextLine();
        //se añade la palabra a la coleccion
        coleccion.add(palabra);
        //se crea una variable para conocer la longitud
        int longitud = palabra.length();
        //se recorre la lista con un for-each
        for (String n : coleccion) {
            System.out.println(n + "," + "longitud" + longitud);
        }
        System.out.println("El ultimo elemento es " + coleccion.getLast());
        //vaciar la lista
        coleccion.clear();
    }

    public void crearVector() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int num = sc.nextInt();
        //se introduce el numero del usuario como tamaño del vector
        int[] vector = new int[num];
        /*mientras se recorre el bucle se van almacenando los numeros introducidos 
        por el usuario hasta cubrir el tamaño del vector.
         */
        System.out.println("Introduce los numeros que quieras almacenar");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = sc.nextInt();
        }
        //se modifica la primera posicion del vector al numero 9
        vector[0] = 9;
        //se recorre la lista para conocer los numeros que tiene
        System.out.println("Los numeros que hay almacenados en la lista son: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public void crearMatriz() {
        //creamos la matriz de 5 filas x 5 columnas.
        int[][] matriz = new int[5][5];
        //creamos un numero random para generar numeros desde el 10 al 99.
        Random r = new Random();
        //de esta manera generamos numeros aleatorios
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                matriz[filas][columnas] = r.nextInt(10, 99);
            }
        }
        System.out.println("La tabla tiene los siguientes numeros: ");
        //ahora recorremos nuevamente pero para ver el contenido de la tabla
        //se imprimirá con print para que no escriba el contenido en una sola linea.
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                System.out.print(matriz[filas][columnas] + (" "));
            }
            System.out.println("");
        }
        int suma = 0;
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                suma += matriz[filas][columnas];

            }

        }
        System.out.println("El total de la suma es de " + suma);
    }
}
