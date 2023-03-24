/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T7Ejercicio2;


/**
 *
 * @author tarde
 */
public class T7Ejecicio2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        /*Una clase que realize operaciones bancarias*/
        CuentaCorriente2 h1,h2,h3;
        h1=new CuentaCorriente2("Ambrosio","123456789c");
        h2=new CuentaCorriente2(1000);
        h3=new CuentaCorriente2(1000,50,"123456789D");
        h3.Mostrar();
        h2.Mostrar();
        h1.Mostrar();
    }
    
}
