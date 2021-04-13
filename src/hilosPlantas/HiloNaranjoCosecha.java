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
public class HiloNaranjoCosecha extends Thread{
    @Override  
    public void run() {
        almacenamientoUsuarioPlantas.setControladorSembrarMaiz(0);
        for ( int i = 0; i < 10; i++) {
            try {
                HiloNaranjoCosecha.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en espera de hiloCosechaNaranjo "+e);
            }          
        }
        establecerInstruccionesHilos.setHiloNaranjo(2);
        JOptionPane.showMessageDialog(null,"La cosecha de naranjo está hecha apurate, tienes 10 segundos para cosechar o pierdes tu cosecha");
        
    }
}
