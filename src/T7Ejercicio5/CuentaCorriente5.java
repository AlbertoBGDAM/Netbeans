/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T7Ejercicio5;


/**
 *
 * @author tarde
 */
public class CuentaCorriente5 {
    private double Saldo;
    public double limite;
    String nombre;
    private String DNI;
    String Nbanco="banco01";

    public CuentaCorriente5(String nombre, String DNI) {
        Saldo = 0;
        this.nombre=nombre;
        this.DNI=DNI;
        limite= -50;
    }
    void CambioBanco(String nuevoBanco){
        Nbanco=nuevoBanco;
    }
    public CuentaCorriente5(double Saldo) {
        this.Saldo = 0;
        this.nombre="No asignado";
        this.DNI="No asignado";
        limite= -50;
    }
    public CuentaCorriente5(double Saldo, double limite, String DNI) {
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
