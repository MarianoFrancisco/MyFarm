package manejadorDatos;
import static proyecto1.CrearAnimalesPlantas.*;
import static instancias.FrameComprar.*;
/**
 *
 * @author Mariano
 */
public class CriasSemillasVisibles {
    public static void visibilidadCompra(){
        if(plantas[1].getPrecioCompraSemilla()!=4){
            FrijoljButton2.setVisible(false);
            FrijoljLabel2.setVisible(false);
        }
        
        if(plantas[2].getPrecioCompraSemilla()!=5){
            ArrozjButton1.setVisible(false);
            ArrozjLabel1.setVisible(false);
        }
        if(plantas[4].getPrecioCompraSemilla()!=5){
            NaranjojButton3.setVisible(false);
            NaranjojLabel3.setVisible(false);
        }
        if(plantas[5].getPrecioCompraSemilla()!=5){
            BananojButton4.setVisible(false);
            BananojLabel6.setVisible(false);
        }
        
    }
}
