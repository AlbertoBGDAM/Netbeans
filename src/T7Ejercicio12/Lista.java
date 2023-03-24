/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T7Ejercicio12;

import java.util.Arrays;

/**
 *
 * @author tarde
 */
public class Lista {
    int[] tabla;
    int numero;
    
    public Lista(){//defecto
        numero=0;
        tabla=new int[10];
    }
    public Lista(int inicio){//defecto
        numero=0;
        tabla=new int[inicio];
    }
    
    boolean llena(){
        return tabla.length==numero;
    }
    public void añadirP(int numerox){
        if(llena()){
         tabla=Arrays.copyOf(tabla,tabla.length+10);
        }
        for (int i=numero;i>=1;i--){
            tabla[i]=tabla[i-1];
        }
        tabla[0]=numerox;
        numero++;
    }
    public void añadirF(int numerox){
        if(llena()){
         tabla=Arrays.copyOf(tabla,tabla.length+10);
        }
        tabla[numero]=numerox;
        numero++;
    }
    boolean añadirA(int numerox,int numeroy){
        boolean insertado=true;
        if(numeroy<0||numeroy>numero){
            insertado=false;
        }else{
            if(llena()){
                tabla=Arrays.copyOf(tabla,tabla.length+10);
            }
            for (int i=numero;i>=1;i--){
                tabla[i]=tabla[i-1];
            }
            tabla[numeroy]=numerox;
            numero++;
        }
        return insertado;
    }
    boolean añadirL(int[] numerox){
        boolean insertado=true;
        boolean z=true;
        if(tabla.length<0||tabla.length>numero){
            insertado=false;
        }else{
            if(llena()){
                tabla=Arrays.copyOf(tabla,tabla.length+10);
            }
            for (int i=numero;i>=1;i--){
                tabla[i]=tabla[i-1];
            }
            for (int i=0;i<=numero;i++){
                tabla[numero-i]=numerox[i];     
            }
            numero++;
        }
        return insertado;
    }
    public void Mostrar(){
        for (int i=0;i<tabla.length;i++){
            System.out.println("El numero almacenado en el hueco "+i+
                    "es el: "+tabla[i]);
        } 
    }
    
}
