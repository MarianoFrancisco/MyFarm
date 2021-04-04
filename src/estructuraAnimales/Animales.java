package estructuraAnimales;

/**
 *
 * @author Mariano
 */
public abstract class Animales {
    protected String tipoAnimal;
    
    public Animales( String tipoAnimal){
        this.tipoAnimal=tipoAnimal;
    }
    public abstract void ProduccionDestace();
    public abstract void ProduccionSinDestace();
}
