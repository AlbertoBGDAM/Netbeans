/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T7Ejercicio7;

/**
 *
 * @author tarde
 */
public class Banco {
    final String nombre;
    double capital=5.2;
    String dirección;
    
    public Banco(String b){
        this.nombre=b;
    }
    public Banco (String nomb,double capital, String dirección ){
        this.nombre=nomb;
        this.capital=capital;
        this.dirección=dirección;
    }
    public void MostrarB(){
        System.out.println("    Banco: "+nombre);
        System.out.println("    Capital: "+capital+" millones");
        System.out.println("    Dirección: "+dirección);
    }
}
