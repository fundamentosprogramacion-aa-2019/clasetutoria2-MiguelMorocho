/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import java.util.Scanner;

/**
 *
 * @author INSPIRON
 */
public class MiEjemplo4 {
      public static void main(String[] args){
        String nombrePersona; // es la variable para almacenar un nombre 
        String apellidoPersona; 
        String ciudad;
        int nota1;
        int nota2;
        double promedio;
        int edad;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre por favor:");
        nombrePersona = entrada.nextLine();
        
        System.out.println("Ingrese su apellido por favor:");
        apellidoPersona = entrada.nextLine();
        
        System.out.println("Ingrese su edad por favor:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese sus notas:");
        nota1 = entrada.nextInt();
        entrada.nextLine();
        nota2 = entrada.nextInt();
        entrada.nextLine();
        
        promedio = (nota1+nota2)/2;
        
        System.out.println("Ingrese su ciudad por favor:");
        ciudad = entrada.nextLine();
         
        
         
        System.out.printf("Mi Llamo es: %s %s\nMi edad es:"
                + "%s\nMis notas son: %s y %s\nMi promedio es: %s\n"
                + "Mi ciudad es: %s",
                nombrePersona, apellidoPersona, edad, nota1, nota2, promedio, ciudad);
      }
}
