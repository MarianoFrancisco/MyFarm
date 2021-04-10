/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;
import static instancias.FrameGranja.*;
import javax.swing.JOptionPane;
import jugador.*;
/**
 *
 * @author Mariano
 */
public class Vida extends Thread{
    @Override
    public void run() {
        Jugador.jugador1.setVida(100);
        try {
            Vida.sleep(30000);
        } catch (InterruptedException ex) {
            System.out.println("Excepcion en "+ex);
        }
        JOptionPane.showMessageDialog(null, "Alimentate "+Jugador.jugador1.getNick());
        for (int i = 0; i < 100; i++) {
            Jugador.jugador1.setVida(Jugador.jugador1.getVida()-1);
            
            VidajProgressBar1.setValue(Jugador.jugador1.getVida());
            VidajLabel3.setText(""+Jugador.jugador1.getVida());
            try{
                Vida.sleep(500);
            }catch(InterruptedException e){
                System.out.println("Error en el hilo vida "+e);
                
            }
        }
        
        if(Jugador.jugador1.getVida()==0){
            JOptionPane.showMessageDialog(null, "Fin del juego, vuelve pronto "+Jugador.jugador1.getNick());
            System.exit(0);
        }
    }
}
