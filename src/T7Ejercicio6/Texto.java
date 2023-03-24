/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T7Ejercicio6;

/**
 *
 * @author tarde
 */
public class Texto {
    String cad;
    int max;
    String voc="aeiouáéíóú";

    public Texto(String cad,int max){
        this.cad=cad;
        this.max=max;
    }
    public void Principio(char c){
        if(max>=cad.length()){
            cad=c+cad;
        }
    }
    public void Final(char c){
        if(max>cad.length()){
            cad=cad+c;
        }
    }
    public void Principio(String c){
        if(max>=cad.length()){
            cad=c+cad;
        }
    }
    public void Final(String c){
        if(max>cad.length()){
            cad=cad+c;
        }
    }
    public void Mostrar(){
        System.out.println(cad);
    }
    
}
