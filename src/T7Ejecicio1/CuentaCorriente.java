/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T7Ejecicio1;

/**
 *
 * @author tarde
 */
public class CuentaCorriente {
    double Saldo;
    double limite;
    String nombre;
    String DNI;

    public CuentaCorriente(String nombre, String DNI) {
        Saldo = 0;
        this.nombre=nombre;
        this.DNI=DNI;
        limite= -50;
    }
    boolean ingresio(double cant){
        boolean operación;
        if((Saldo-cant)>=limite){
            Saldo-=cant;
            operación=true;
        }  else{
            System.out.println("No hay dinero");
            operación=false;
        } 
        return operación;
    }
    void ingreso(double cant){
        Saldo+=cant;
    }
    void Mostrar() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Saldo: "+Saldo); 
        System.out.println("DNI: "+DNI);
        System.out.println("Limite: "+limite); 
}}
