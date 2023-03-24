/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T7Ejercicio12;

/**
 *
 * @author tarde
 */
public class T7Ejercicio12 {
    
    public static void main(String[] args) {
         Lista l=new Lista();
         l.añadirF(3);
         l.añadirF(2);
         l.añadirF(1);
         l.añadirF(4);
         l.añadirF(5);
         l.Mostrar();
         System.out.println("");
         l.añadirP(0);
         l.añadirP(1);
         l.añadirP(2);
         l.añadirP(3);
         l.añadirP(4);
         l.añadirP(5);
         l.añadirA(2,10);
         System.out.println("");
         l.Mostrar();
    }
}
