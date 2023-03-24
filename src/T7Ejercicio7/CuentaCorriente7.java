/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T7Ejercicio7;

import T7Ejercicio5.*;


/**
 *
 * @author tarde
 */
public class CuentaCorriente7 {
    private double Saldo=0;
    public double limite=-50;
    String nombre="no asignado";
    private String DNI="no asignado";
    Banco banco01;

    public CuentaCorriente7(String nombre, String DNI) {
        this.nombre=nombre;
        this.DNI=DNI;
    }
    public CuentaCorriente7(String nom, String dni, Banco b){
        this.nombre=nom;
        this.DNI=dni;
        this.banco01=b;
    }
    void CambioBanco(Banco nuevoBanco){
        this.banco01=nuevoBanco;
    }
    public CuentaCorriente7(double Saldo) {
        this.Saldo = Saldo;
    }
    public CuentaCorriente7(double Saldo, double limite, String DNI) {
        this.Saldo = Saldo;
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
        if(banco01==null){
            System.out.println("    No esta asociado a ningun banco");
        }else{
            banco01.MostrarB();
        }
        System.out.println("    Nombre: "+nombre);
        System.out.println("    Saldo: "+Saldo); 
        System.out.println("    DNI: "+DNI);
        System.out.println("    Limite: "+limite);
    }   
}
