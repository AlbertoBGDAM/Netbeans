/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T7Ejercicio7;

/**
 *
 * @author tarde
 */
public class T7Ejercicio7 {
    
     public static void main(String[] args) {
        CuentaCorriente7 c1,c2,c3;
        Banco b1,b2;
        
        b1=new Banco("Hola");
        b2=new Banco("Adios",7.0,"abcdefg");
        
        c1=new CuentaCorriente7("pepe","12345677",b1);
        c2=new CuentaCorriente7("pepe","12345677",b2);
        System.out.println("Persona 1:");
        c1.Mostrar();
        System.out.println("Persona 2:");
        c2.Mostrar();
        c3=new CuentaCorriente7("pepe","12345677");
        System.out.println("Persona 3:");
        c3.Mostrar();
        c3.CambioBanco(b2);
        System.out.println("Persona 3.2:");
        c3.Mostrar();
    }
}
