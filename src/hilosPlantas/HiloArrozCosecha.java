/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosPlantas;

import javax.swing.JOptionPane;
import static manejadorDatos.AlmacenamientoUsuarioPlantas.almacenamientoUsuarioPlantas;
import static manejadorDatos.EstablecerInstruccionesHilos.establecerInstruccionesHilos;

/**
 *
 * @author Mariano
 */
public class HiloArrozCosecha extends Thread{
    @Override  
    public void run() {
        almacenamientoUsuarioPlantas.setControladorSembrarArroz(0);
        for ( int i = 0; i < 10; i++) {
            try {
                HiloArrozCosecha.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloCosechaArroz "+e);
            }          
        }
        establecerInstruccionesHilos.setHiloArroz(2);
        JOptionPane.showMessageDialog(null,"La cosecha de arroz está hecha apurate, tienes 10 segundos para cosechar o pierdes tu cosecha");
        
    }
}
