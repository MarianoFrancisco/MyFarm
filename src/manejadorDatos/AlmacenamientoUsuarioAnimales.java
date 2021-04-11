package manejadorDatos;

/**
 *
 * @author Mariano
 */
public class AlmacenamientoUsuarioAnimales {
    private int criaCerdo;
    private int criaPavo;
    private int criaGallina;
    private int criaVaca;
    private int criaLlama;
    private int criaOveja;
    public static AlmacenamientoUsuarioAnimales almacenamientoUsuarioAnimales;
    public AlmacenamientoUsuarioAnimales(int criaCerdo,int criaPavo,int criaGallina,int criaVaca,int criaLlama,int criaOveja){
        this.criaCerdo=criaCerdo;
        this.criaPavo=criaPavo;
        this.criaGallina=criaGallina;
        this.criaVaca=criaVaca;
        this.criaLlama=criaLlama;
        this.criaOveja=criaOveja;
    }

    public int getCriaCerdo() {
        return this.criaCerdo;
    }

    public void setCriaCerdo(int criaCerdo) {
        this.criaCerdo = criaCerdo;
    }

    public int getCriaPavo() {
        return this.criaPavo;
    }

    public void setCriaPavo(int criaPavo) {
        this.criaPavo = criaPavo;
    }

    public int getCriaGallina() {
        return this.criaGallina;
    }

    public void setCriaGallina(int criaGallina) {
        this.criaGallina = criaGallina;
    }

    public int getCriaVaca() {
        return this.criaVaca;
    }

    public void setCriaVaca(int criaVaca) {
        this.criaVaca = criaVaca;
    }

    public int getCriaLlama() {
        return this.criaLlama;
    }

    public void setCriaLlama(int criaLlama) {
        this.criaLlama = criaLlama;
    }

    public int getCriaOveja() {
        return this.criaOveja;
    }

    public void setCriaOveja(int criaOveja) {
        this.criaOveja = criaOveja;
    }
    
    public static void crearUsuarioAnimales(){
        almacenamientoUsuarioAnimales = new AlmacenamientoUsuarioAnimales(0,0,0,0,0,0);
    }
    public static void sumarCerdos(){
        almacenamientoUsuarioAnimales.setCriaCerdo(almacenamientoUsuarioAnimales.getCriaCerdo()+1);
        EstablecerReportes.sumarCrias();
    }
    public static void sumarPavos(){
        almacenamientoUsuarioAnimales.setCriaPavo(almacenamientoUsuarioAnimales.getCriaPavo()+1);
        EstablecerReportes.sumarCrias();
    }
    public static void sumarGallinas(){
        almacenamientoUsuarioAnimales.setCriaGallina(almacenamientoUsuarioAnimales.getCriaGallina()+1);
        EstablecerReportes.sumarCrias();
    }
    public static void sumarVacas(){
        almacenamientoUsuarioAnimales.setCriaVaca(almacenamientoUsuarioAnimales.getCriaVaca()+1);
        EstablecerReportes.sumarCrias();
    }
    public static void sumarLlama(){
        almacenamientoUsuarioAnimales.setCriaLlama(almacenamientoUsuarioAnimales.getCriaLlama()+1);
        EstablecerReportes.sumarCrias();
    }
    public static void sumarOveja(){
        almacenamientoUsuarioAnimales.setCriaOveja(almacenamientoUsuarioAnimales.getCriaOveja()+1);
        EstablecerReportes.sumarCrias();
    }
}
