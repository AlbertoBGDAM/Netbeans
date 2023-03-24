/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T7Ejercicio8;

/**
 *
 * @author tarde
 */
public class EmisoraFM {
    public double valorfm;
    
    EmisoraFM(){
        valorfm=80;
    }
    EmisoraFM(double valor0){
        if (valor0<80){
            valorfm=80;
        }else if(valor0>108){
            valorfm=108;
        }else{
            valorfm=valor0;
        }
    }
    public double up(){
        valorfm=+0.5;
        return valorfm;
    }
    public double down(){
        valorfm=-0.5;
        return valorfm;
    }
    void Display(){
        System.out.println("Valor actual de la emisora "+valorfm+" HZ");
    }
}
