/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencd2;


import javax.swing.JOptionPane;

/**
 *Class Main. Controls the interaction between the user and the alarm with a 
 * simple menu.
 * @author otorradomiguez
 */
public class RelojDespertador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alarma despertador = new Alarma();
        
        while (true) {
            int selector = Integer.parseInt(JOptionPane.showInputDialog("Opciones:\nPulse 1 para Activar/Descativar la alarma\nPulse 2 para configurar la hora de la alarma\nPulse 3 para configurar los minutos de la alarma"));
            switch (selector) {
                case 1:
                    despertador.setAlarma();
                    despertador.mostrarAlarma();
                    break;
                case 2:
                    despertador.configurarHora();
                    despertador.mostrarHora();
                    break;
                case 3:
                    despertador.configurarMinutos();
                    despertador.mostrarHora();
                    break;
                default:
                    System.out.println("Opcion no valida. Use 1,2 y 3");
            }
        }
    }

}
