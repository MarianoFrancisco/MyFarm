package estructuraPlantas;

/**
 *
 * @author Mariano
 */
public abstract class Plantas {
    protected String tipoPlanta;
    
    public Plantas( String tipoPlanta){
        this.tipoPlanta=tipoPlanta;
    }
    public abstract void siembra();
    public abstract void cosecha();
}
