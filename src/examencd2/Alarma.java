/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencd2;


/**
 * Controls the functionality of the alarma
 * @author otorradomiguez
 */
public class Alarma{
    
    
    private boolean activaAlarma=true;
    private int horaAlarma=12;
    private int minutoAlarma=29;

   /**
    * Changes the boolean estate activaAlarma each time its called
    */
    public void setAlarma(){
        if(activaAlarma==true){
            activaAlarma=false;
        }
        else{
            activaAlarma=true;
        }
    }
    
    /**
     * Sets the hour for the alarma. Each time its called increases the hour by 1
     * if it reaches 24, resets it to 0
     */
    public void configurarHora(){
        horaAlarma++;
        if(horaAlarma>23){
            horaAlarma=0;
        }
    }
    
    /**
     * Sets the minutes for the alarm. Each time its called increases the minutes 
     * by 1, and reset to 0 when it reaches 60
     */
    public void configurarMinutos(){
        minutoAlarma++;
        if(minutoAlarma>59){
            minutoAlarma=0;
        }
    }
    
    /**
     * Shows the time the alarm is set for in the format (HH:MM)
     */
    public void mostrarHora(){
        String horaDisplay,minutoDisplay;
        if(horaAlarma<10){
            horaDisplay="0"+horaAlarma;
        }
        else{
            horaDisplay=String.valueOf(horaAlarma);
        }
        if(minutoAlarma<10){
            minutoDisplay="0"+minutoAlarma;
        }
        else{
            minutoDisplay=String.valueOf(minutoAlarma);
        }
        System.out.println("La alarma esta configurada para sonar a las "+horaDisplay+":"+minutoDisplay);
    }
    
    /**
     * Shows if the alarma is active or not
     */
    public void mostrarAlarma(){
        if(activaAlarma==true){
            System.out.println("Alarma Activa");
        }
        else{
            System.out.println("Alarma Desactivada");
        }
    }
}
