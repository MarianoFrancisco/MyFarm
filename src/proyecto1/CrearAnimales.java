package proyecto1;
import animalesHerviboros.*;
import animalesOmnivoros.*;
import estructuraAnimales.*;
/**
 *
 * @author Mariano
 */
public class CrearAnimales {
    //Llamamos nuevos animales
    static Vaca vaca[]= new Vaca[5];
    static Gallina gallina[]=new Gallina[5];
    public static void LlamadoCrearAnimales(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCrearAnimales().setVisible(true);
            }
        });
    }
    public static void iniciarAnimalesHerviboros(){
        vaca[0] = new Vaca("Vaca");
    }
    public static void iniciarAnimalesOmnivoros(){
        gallina[0] = new Gallina("Gallina");
    }
}
