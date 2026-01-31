package mipaquete;

import java.util.Scanner;

public class Practica0{

    static Scanner input=new Scanner(System.in);

    static void run(){
        String nombre;
        System.out.print("Proporciona tu nombre:");
        nombre=input.nextLine();
        System.out.printf("Bienvenido %s al curso de Estructura de Datos\n",nombre);
   }
   
   public static void main(String args[]){
        run();
   }
}