package com.mycompany.memoriadinamica;
import java.util.ArrayList;
import java.util.Scanner;

public class MemoriaDinamica {
    private static ArrayList<String> nombres = new ArrayList<>();//lista para almacenar nombres
    static Scanner leer = new Scanner(System.in);
    static int opcion=0;

    public static void main(String[] args) {
        
    do{    
        System.out.println("\nBienvenido");
        System.out.println("Programa para almacenar nombres");
        System.out.println("1.Agregar Nombres");
        System.out.println("2.Mostrar nombres");
        System.out.println("3.Eliminar nombres");
        System.out.println("4.Acomodar nombres alfabeticamente");
        System.out.println("5.Modificar nombres");
        System.out.println("6.Salir");
        //leer opcion
        opcion=leer.nextInt();
        switch(opcion)
        {
            case 1:
                //mandar a llamar el metodo
                MemoriaDinamica.agregarNombre();
                break;
            case 2:
                //mandar a llamar el metodo
                MemoriaDinamica.mostrarNombres();
                break;
            case 3:
                //mandar a llamar el metodo
                MemoriaDinamica.eliminarNombres();
                break;
            case 4: 
                MemoriaDinamica.acomodarNombres();
                break;
            case 5:
                //mandar a llamar el metodo
                MemoriaDinamica.modificarNombres();
                break;
            case 6:
                System.out.println("Gracias por participar");
                break;
            default:
                System.out.println("Favor de elegir solo opciones del menú");       
        }//fin del switch
    }while(opcion!=6);      
    }
    
    private static void agregarNombre()
    {
        System.out.println("Ingrese el nombre que desea agregar: ");
        String nombre = leer.next();
        nombres.add(nombre);
        System.out.println("Nombre agregado correctamente.");
    }
    private static void mostrarNombres()
    {
        if (nombres.isEmpty())
        {
            System.out.println("la lista de nombres está vacía");
        }
        else
        {
            System.out.println("Nombres almacenados: ");
            for (String nombre: nombres)
            {
               System.out.println(nombre);
            }
        }
    }
    
    private static void acomodarNombres()
    {
        if(nombres.isEmpty())
        {
            System.out.println("La lista de nombres está vacía");
        }
        else
        {
            nombres.sort(String::compareTo);
            System.out.println("Nombres acomodados alfabéticamente");
            for (String nombre : nombres)
            {
                System.out.println(nombre);
            }
        }    
    }
    
    private static void eliminarNombres()
    {
        if(nombres.isEmpty())
        {
            System.out.println("La lista de nombres está vacía");
        }
        else
        {
            System.out.println("Ingrese el nombre que desea eliminar");
            String nombre = leer.next();
            if(nombres.remove(String.valueOf(nombre)))
            {
                System.out.println("Nombre eliminado correctamente");
            }
            else
            {
                System.out.println("El nombre no se encontró en la lista.");
            }
        }
    }
    
    private static void modificarNombres()
    {
  
        if(nombres.isEmpty())
        {
            System.out.println("La lista de nombres está vacía");
        }
        else
        {
            System.out.println("Ingrese el nombre que desea modificar");
            String nombreAntiguo = leer.next();
            System.out.println("Ingrese el nuevo nombre");
            String nombreNuevo = leer.next();
            
            int index = nombres.indexOf(nombreAntiguo);
            if(index !=-1)
            {
                nombres.set(index, nombreNuevo);
                System.out.println("Nombre modificado");
            }
            else
            {
                System.out.println("No se encontró el nombre a modificar");
            }
        }
             
    }
}
