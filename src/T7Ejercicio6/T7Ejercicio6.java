/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T7Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class T7Ejercicio6 {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);       
        String cadena,c;
        int i;
        System.out.println("Introduzca la frase que quiere");
            cadena=sc.nextLine();
        System.out.println("Cuanto sera el maximo para leer?");
            i=sc.nextInt();
            Texto t= new Texto(cadena,i);       
        System.out.println("Añada texto a la cadena: ");
            c=sc.nextLine();
        Elección(c,t);
     }
    static void Elección(String c,Texto t){
        int i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Lo desea introducir como"
                + " caracter(0) o como linea?(1)");
            i=sc.nextInt();    
            if(i==0){
                c.toCharArray();     
            }
        System.out.println("Donde va a ir este texto?"
                + " al principio(0) o al final(1)");
            i=sc.nextInt();
            if(i==0){
                t.Principio(c);
            }else{
                t.Final(c);
            }
        t.Mostrar();
     }
}
