package estructuraAnimales;

/**
 *
 * @author Mariano
 */
public abstract class Animales {
    protected String tipoAnimal;
    protected int precioCompra;
    protected int librasCarneGenerada;
    protected int cantidadMateriaPrimaGenerada;
    public Animales( String tipoAnimal){
        this.tipoAnimal=tipoAnimal;
    }
    public abstract void ProduccionDestace();
    public abstract void ProduccionSinDestace();
}
