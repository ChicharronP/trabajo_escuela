/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.video1;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Video1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
       
        //aritmetica de dos numeros
        /*byte num1, num2;
        System.out.println("Ingrese el valor 1: ");
        num1 = scan.nextByte();
        System.out.println("Ingrese el valor 2: ");
        num2 = scan.nextByte();
        if(num1>num2)
        {
            System.out.println("El mayor es: " + num1);
        }
        else if(num1<num2)
        {
            System.out.println("El mayor es: " + num2);
        }
        else
        {
            System.out.println("Los valores son iguales");
        }*/
        
        
        //Muestra nombre en pantalla
        /*String nombre;
        System.out.println("Ingresa tu nombre");
        nombre = scan.nextLine();
        System.out.println("Buenos días " + nombre);*/
        
        //area de un circulo
        /*System.out.println("Ingrese el radio del circulo");
        float rad = scan.nextFloat();
        System.out.println("El area del circulo es: " + 3.1416*pow(rad,2));*/
        
        
        //número divisible entre dos sin reciduo
        /*
        System.out.println("Valor 1:");
        float num = scan.nextInt();
        if (num%2==0)
        {
            System.out.println("El numero es divisible entre 2");
        }
        else
        {
            System.out.println("El numero No es divisible entre 2");
        }
        */
        
        //Ingrese el valor del IVA de un producto %21
        /*System.out.println("Ingrese el precio del producto");
        float prod = scan.nextFloat();
        System.out.println("El precio final del producto es: " + prod * 1.21);*/
        
        //Del 1 al 100 usando while
        /*int num =1; 
        System.out.println(num);
        while(num<100)
        {
            num = num + 1;
            System.out.println(num);
        }*/
        
        //del 1 al 100 usando for
        /*int i, num = 0;
       for(i=1;i<=100;i++)
       {
       num = num + 1;
           System.out.println(num);
       }*/
        
        //Arreglos
        String[] amigos={"Alexia","Danna","Salvador"};
        for(int i=0;i<3;i++){
            System.out.println(amigos[i]);
        }
        
    }
}
