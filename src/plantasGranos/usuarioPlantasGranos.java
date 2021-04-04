package plantasGranos;
import estructuraPlantas.*;
/**
 *
 * @author Mariano
 */
public class usuarioPlantasGranos extends Plantas implements PlantasGranos{

    public usuarioPlantasGranos(String tipoPlanta, int precioCompraSemilla, int semillasNecesariasSembrar, int productoCosecha, int precioVentaProducto) {
        super(tipoPlanta, precioCompraSemilla, semillasNecesariasSembrar, productoCosecha, precioVentaProducto);
    }
    @Override
    public void siembra() {
        
    }

    @Override
    public void cosecha() {
        
    }

    @Override
    public void cosecharGranos() {
        
    }
    
}
