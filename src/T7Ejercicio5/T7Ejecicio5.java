/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T7Ejercicio5;

/**
 *
 * @author tarde
 */
public class T7Ejecicio5 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        /*Una clase que realize operaciones bancarias*/
        CuentaCorriente5 h;
        h=new CuentaCorriente5("Ambrosio","123456789c");
        h.limite=-100;
        h.ingresio(1000);
        h.ingreso(300);
        h.Mostrar();
        System.out.println("Sacamos 700 "+h.ingresio(700));
        System.out.println("No queda nada "+h.ingresio(500));
        
        h= new CuentaCorriente5(900);
        h.Mostrar();

        h=new CuentaCorriente5(900,-50,"123456789d");
        h.Mostrar();
        
        h.Nbanco="bancoSA";
    }
    
}
