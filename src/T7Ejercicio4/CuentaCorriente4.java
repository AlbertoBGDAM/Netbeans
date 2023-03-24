/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T7Ejercicio4;

/**
 *
 * @author tarde
 */
public class CuentaCorriente4 {
    private double Saldo;
    public double limite;
    String nombre;
    private String DNI;

    public CuentaCorriente4(String nombre, String DNI) {
        Saldo = 0;
        this.nombre=nombre;
        this.DNI=DNI;
        limite= -50;
    }
    public CuentaCorriente4(double Saldo) {
        this.Saldo = 0;
        this.nombre="No asignado";
        this.DNI="No asignado";
        limite= -50;
    }
    public CuentaCorriente4(double Saldo, double limite, String DNI) {
        this.Saldo = Saldo;
        this.nombre="No asignado";
        this.DNI=DNI;
        this.limite= limite;
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
