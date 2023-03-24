/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T7Ejercicio11;

import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class T7Ejercicio11 {
    
     public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         Hora h= new Hora();
         int valor;
         
         System.out.println("Introduzca una hora: ");
         valor =sc.nextInt();
         h.setHora(valor);
         
         System.out.println("Introduzca unos minutos: ");
         valor =sc.nextInt();
         h.setMin(valor);
         
         System.out.println("Introduzca unos segundos: ");
         valor =sc.nextInt();
         h.setSec(valor);
         
         System.out.println("Cuantos segundos tengo que mostrar: ");
         int segundos=sc.nextInt();
         
         for (int i=0;i<segundos;i++){
             System.out.println(h.getHora()+" : "+h.getMin()+" : "+h.getSec());
             h.incremento();
         }
     }
}
