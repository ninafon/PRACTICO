package boletin2_2;

import java.util.Scanner;

/**
 *
 * @author Jano
 */
public class Boletin2_2 {

    public static void main(String[] args) {
        //Para pedir las variables por teclado
        //Primero creamos las variables
        float lado;
        //Importamos java.utils para acceder a la clase de Scanner
        Scanner medida= new Scanner(System.in);
        //Con el objeto creado nos da varias opciones
        //como queremos meter un float le decimos que el valor que vamos a introducir es float
        //con el 'next' se puede elegir cualquier tipo de dato
        System.out.print("Introduce el lado: ");
        lado=medida.nextFloat();
        System.out.println("El área del cuadrado es: "+lado*lado);
    } 
    
}
