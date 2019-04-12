/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author INSPIRON
 */
public class MiEjemplo3 {
    public static void main(String[] args){
        String nombrePersona; // es la variable para almacenar un nombre 
        String apellidoPersona; 
        String ciudad;
        int edad;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre por favor:");
        nombrePersona = entrada.nextLine();
        
        System.out.println("Ingrese su apellido por favor:");
        apellidoPersona = entrada.nextLine();
        
        System.out.println("Ingrese su edad por favor:");
        edad = entrada.nextInt();
        entrada.nextLine(); // esto es una limpieza de mi buffer de entrada
        System.out.println("Ingrese su ciudad por favor:");
        ciudad = entrada.nextLine();
        System.out.printf("Mi nombre es: %s\nMi apellido es: %s\n Mi edad es:"
                + "%s\n Mi ciudad es: %s",
                nombrePersona, apellidoPersona, edad, ciudad);
    }
}
