/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T7Ejercicio11;

/**
 *
 * @author tarde
 */
public class Hora {
    int Hora;
    int Min;
    int Sec;
    
    public int getHora(){
        return Hora;
    }
    public void setHora(int hora){
        if(0<=Hora && Hora<=23){
            this.Hora=hora;
        }else{
            this.Hora=0;
        }
    }
    public int getMin(){
        return Min;
    }
    public void setMin(int min){
        if(0<=Min && Min<=59){
            this.Min=min;
        }else{
            this.Min=0;
        }
    }
    public int getSec(){
        return Sec;
    }
    public void setSec(int sec){
        if(0<=Sec && Sec<=59){
            this.Sec=sec;
        }else{
            this.Sec=0;
        }
    }
    public void incremento(){
        Sec++;
        if(Sec==60){
            Sec=0;
            Min++;
            if (Min==60){
                Min=0;
                Hora++;
                if(Hora==24){
                    Hora=0;
                }
            }
        }
    }
}
