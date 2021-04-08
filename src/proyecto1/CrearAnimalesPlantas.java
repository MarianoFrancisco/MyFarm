package proyecto1;
import animalesHerviboros.*;
import animalesOmnivoros.*;
import estructuraAnimales.*;
import estructuraPlantas.*;
import plantasFrutas.*;
import plantasGranos.*;

/**
 *
 * @author Mariano
 */
public class CrearAnimalesPlantas {
    //Llamamos nuevos animales
    static Plantas plantas[]= new Plantas[6];
    static Animales animales[]= new Animales[6];
    static Maiz maiz;
    static Frijol frijol;
    static Arroz arroz;
    static Manzano manzano;//frijol,arroz,naranjo,banano.  , oveja, llama, cerdo, pavo.
    static Naranjo naranjo;
    static Banano banano;
    static Vaca vaca;
    static Oveja oveja;
    static Llama llama;
    static Gallina gallina;
    public static Cerdo cerdo;
    static Pavo pavo;
    static CrearAnimalesPlantas crearAnimalesPlantas;
    public static void LlamadoCrearAnimales(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCrearAnimalesPlantas().setVisible(true);
            }
        });
    }
    public static void iniciarAnimalesHerviboros(){
        vaca = new Vaca();
        oveja= new Oveja();
        llama= new Llama();
    }
    public static void iniciarAnimalesOmnivoros(){
        gallina = new Gallina();
        cerdo= new Cerdo();
        pavo= new Pavo();
    }
    public static void iniciarPlantasGranos(){
        maiz= new Maiz();
        frijol= new Frijol();
        arroz= new Arroz();
    }
    public static void iniciarPlantasFrutas(){
        manzano= new Manzano();
        naranjo= new Naranjo();
        banano= new Banano();
    }
    public static void animalesCreados(){
        animales[0]= gallina;
        animales[1]= null;
        animales[2]= null;
        animales[3]= vaca;
        animales[4]= null;
        animales[5]= null;
    }
    public static void plantasCreadas(){
        plantas[0]= maiz;
        plantas[1]= null;
        plantas[2]= null;
        plantas[3]= manzano;
        plantas[4]= null;
        plantas[5]= null;
    }
}
