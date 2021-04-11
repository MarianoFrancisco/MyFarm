
package instancias;

import static instancias.FrameGranja.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import jugador.Jugador;
import manejadorDatos.AlmacenamientoUsuarioPlantas;
import suelos.CreacionSueloInicial;
import static suelos.CreacionSueloInicial.sueloElegir;
import suelos.SueloAgua;
import suelos.SueloDesierto;
import suelos.SueloGrama;
import static manejadorDatos.AlmacenamientoUsuarioPlantas.almacenamientoUsuarioPlantas;
/**
 *
 * @author Mariano
 */
public class InicializarSuelos {
    int condicionM=5;
    int condicionN=5;
    int filas=5;
    int columnas=5;
    JButton[][] suelo;
    public static InicializarSuelos inicializarSuelos;
    public void inicializarSuelos(){
        int x=100;
        int y=300;
        suelo = new JButton[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suelo[i][j] = new JButton();
                suelo[i][j].setBounds(y, x, 70, 50);
                FrameGranja.jPanel1.add(suelo[i][j]);
                CreacionSueloInicial.crearCreacionSueloInicial();
                CreacionSueloInicial.sueloCreador.crearSuelos();
                CreacionSueloInicial.sueloCreador.llamadoCrearSueloInicial();
                if(CreacionSueloInicial.sueloInicial[3].getPorcentaje()==0.35){
                    sueloElegir[i][j] = new SueloAgua();
                    suelo[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Agua.PNG")));
                }
                else if(CreacionSueloInicial.sueloInicial[3].getPorcentaje()==0.25){
                    suelo[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Desierto.PNG")));
                    sueloElegir[i][j] = new SueloDesierto();
                }
                else{
                    suelo[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/Grama.PNG")));
                    sueloElegir[i][j] = new SueloGrama();
                }   
                x+=50;
            }
            y+=70;
            x=100;
        }
    }
    public void inicializarAcciones(){
        for (int m = 0; m < condicionM; m++) {
            for (int n = 0; n < condicionN; n++) {
                int k=m;
                int l=n;
                suelo[m][n].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (SiembrajToggleButton3.isSelected()) {
                            if(sueloElegir[k][l].getPorcentaje()==0.35){
                                JOptionPane.showMessageDialog(null,"No puedes sembrar en agua");
                            }
                            else if(sueloElegir[k][l].getPorcentaje()==0.25){
                                JOptionPane.showMessageDialog(null, "No podemos hacer nada en el desierto");
                            }
                            else{
                                if (PescarjToggleButton4.isSelected()){
                                    JOptionPane.showMessageDialog(null, "Quita la opcion pesca para poder sembrar");
                                }
                                else{
                                    if(almacenamientoUsuarioPlantas.getTotalSemillas()>0){
                                        AlmacenamientoUsuarioPlantas.restarTotal();
                                        LlamadoInstancias.sembrarSeleccion(); 
                                        suelo[k][l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/AccionSembrar.PNG")));
                                        
                                        OrojLabel2.setText(""+Jugador.jugador1.getMonedas());
                                        
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Necesitas primero comprar semillas");
                                    }
                                }
                            }
                        }
                        if (PescarjToggleButton4.isSelected()) {
                            if(sueloElegir[k][l].getPorcentaje()==0.35){
                                if (SiembrajToggleButton3.isSelected()){
                                    JOptionPane.showMessageDialog(null, "Quita la opcion sembrar para poder pescar");
                                }
                                else{
                                    if(Jugador.jugador1.getBarco()>0){
                                        Jugador.jugador1.setBarco(Jugador.jugador1.getBarco()-1);
                                        suelo[k][l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/decoracion/AccionPescar.PNG")));
                                        OrojLabel2.setText(""+Jugador.jugador1.getMonedas());
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Necesitas primero comprar un barco");
                                    }
                                }
                                
                            }
                            else if(sueloElegir[k][l].getPorcentaje()==0.25){
                                JOptionPane.showMessageDialog(null, "No podemos hacer nada en el desierto");
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "No puedes pescar en grama");;
                            }
                        }
                    }
                }); 
            }
        }
        
    }
    
    public static void llamarInicializarSuelos(){
        inicializarSuelos = new InicializarSuelos();
    }
}
