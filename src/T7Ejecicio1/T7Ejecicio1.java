/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T7Ejecicio1;

/**
 *
 * @author tarde
 */
public class T7Ejecicio1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        /*Una clase que realize operaciones bancarias*/
        CuentaCorriente h;
        h=new CuentaCorriente("Ambrosio","123456789c");
        h.limite=-100;
        h.ingresio(1000);
        h.ingreso(300);
        h.Mostrar();
        System.out.println("Sacamos 700 "+h.ingresio(700));
        System.out.println("No queda nada "+h.ingresio(500));
    }
    
}
