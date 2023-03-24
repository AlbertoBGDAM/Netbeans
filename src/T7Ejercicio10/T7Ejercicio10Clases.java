/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T7Ejercicio10;

/**
 *
 * @author tarde
 */
public class T7Ejercicio10Clases {
    
    public class Maquinista{
      String nombre;
      String DNI;
      double sueldo;
      String rango;
      
      public Maquinista(String nombre, String dni,String rango,double sueldo){
          this.nombre=nombre;
          this.DNI=dni;
          this.rango=rango;
          this.sueldo=sueldo;
      }
    }
    public class Mecanico{
        String nombreC;
        String especialidad;
        int telefono;
        public Mecanico(String nombre,String esp,int telef){
            this.nombreC=nombre;
            this.especialidad=esp;
            this.telefono=telef;
        }
    }
    public class JefeE{
        String nombreC;
        String DNI;
        public JefeE(String nombre,String dni){
            this.nombreC=nombre;
            this.DNI=dni;
        }
    }
    class Vagon{
        int carga;
        int CargaAct;
        String Mercancia;
        public Vagon(int max,int act, String tipo){
            this.carga=max;
            this.CargaAct=act;
            this.Mercancia=tipo;
        }
    }
    class Locomotora{
        int matricula;
        int añoF;
        int potencia;
        public Locomotora(int mat,int año, int pot){
            this.matricula=mat;
            this.añoF=año;
            this.potencia=pot;
        }
    }
    public class Trenes{
        Locomotora loc;
        Vagon vags[];
        Maquinista resp;
        private int numVags;
        
        public Trenes(Locomotora loc, Maquinista resp){
            this.loc=loc;
            this.resp=resp;
            this.vags= new Vagon[5];
            this.numVags=0;
        }
        
        public void enganche(int carga, int CargaAct, String Mercancia){
            if (numVags<5){
                System.out.println("El tren no puede con mas");
            }else{
                Vagon v = new Vagon( carga, CargaAct, Mercancia);
                vags[numVags]=v;
                numVags++;
            }
        }
    }
}
