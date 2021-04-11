package manejadorDatos;

/**
 *
 * @author Mariano
 */
public class AlmacenamientoUsuarioPlantas {
    private int totalSemillas;
    private int semillaNaranjo;
    private int semillaBanano;
    private int semillaManzano;
    private int semillaMaiz;
    private int semillaFrijol;
    private int semillaArroz;
    public static AlmacenamientoUsuarioPlantas almacenamientoUsuarioPlantas;
    public AlmacenamientoUsuarioPlantas(int totalSemillas,int semillaNaranjo,int semillaBanano,int semillaManzano,int semillaMaiz,int semillaFrijol,int semillaArroz){
        this.totalSemillas=totalSemillas;
        this.semillaNaranjo=semillaNaranjo;
        this.semillaBanano=semillaBanano;
        this.semillaManzano=semillaManzano;
        this.semillaMaiz=semillaMaiz;
        this.semillaFrijol=semillaFrijol;
        this.semillaArroz=semillaArroz;
    }

    public int getTotalSemillas() {
        return this.totalSemillas;
    }

    public void setTotalSemillas(int totalSemillas) {
        this.totalSemillas = totalSemillas;
    }
    
    public int getSemillaNaranjo() {
        return this.semillaNaranjo;
    }

    public void setSemillaNaranjo(int semillaNaranjo) {
        this.semillaNaranjo = semillaNaranjo;
    }

    public int getSemillaBanano() {
        return this.semillaBanano;
    }

    public void setSemillaBanano(int semillaBanano) {
        this.semillaBanano = semillaBanano;
    }

    public int getSemillaManzano() {
        return this.semillaManzano;
    }

    public void setSemillaManzano(int semillaManzano) {
        this.semillaManzano = semillaManzano;
    }

    public int getSemillaMaiz() {
        return this.semillaMaiz;
    }

    public void setSemillaMaiz(int semillaMaiz) {
        this.semillaMaiz = semillaMaiz;
    }

    public int getSemillaFrijol() {
        return this.semillaFrijol;
    }

    public void setSemillaFrijol(int semillaFrijol) {
        this.semillaFrijol = semillaFrijol;
    }

    public int getSemillaArroz() {
        return this.semillaArroz;
    }

    public void setSemillaArroz(int semillaArroz) {
        this.semillaArroz = semillaArroz;
    }

    public static void crearUsuarioPlantas(){
        almacenamientoUsuarioPlantas=new AlmacenamientoUsuarioPlantas(0,0,0,0,0,0,0);
    }
    public static void sumarBanano(){
        almacenamientoUsuarioPlantas.setSemillaBanano(almacenamientoUsuarioPlantas.getSemillaBanano()+1);
        EstablecerReportes.sumarSemilla();
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()+1);
    }
    public static void sumarManzano(){
        almacenamientoUsuarioPlantas.setSemillaManzano(almacenamientoUsuarioPlantas.getSemillaManzano()+1);
        EstablecerReportes.sumarSemilla();
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()+1);
    }
    public static void sumarMaiz(){
        almacenamientoUsuarioPlantas.setSemillaMaiz(almacenamientoUsuarioPlantas.getSemillaMaiz()+1);
        EstablecerReportes.sumarSemilla();
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()+1);
    }
    public static void sumarNaranjo(){
        almacenamientoUsuarioPlantas.setSemillaNaranjo(almacenamientoUsuarioPlantas.getSemillaNaranjo()+1);
        EstablecerReportes.sumarSemilla();
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()+1);
    }
    public static void sumarFrjol(){
        almacenamientoUsuarioPlantas.setSemillaFrijol(almacenamientoUsuarioPlantas.getSemillaFrijol()+1);
        EstablecerReportes.sumarSemilla();
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()+1);
    }
    public static void sumarArroz(){
        almacenamientoUsuarioPlantas.setSemillaArroz(almacenamientoUsuarioPlantas.getSemillaArroz()+1);
        EstablecerReportes.sumarSemilla();
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()+1);
    }
    
    //Resta
    
    public static void restarBanano(){
        almacenamientoUsuarioPlantas.setSemillaBanano(almacenamientoUsuarioPlantas.getSemillaBanano()-1);
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()+1);
    }
    public static void restarManzano(){
        almacenamientoUsuarioPlantas.setSemillaManzano(almacenamientoUsuarioPlantas.getSemillaManzano()-1);
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()-1);
    }
    public static void restarMaiz(){
        almacenamientoUsuarioPlantas.setSemillaMaiz(almacenamientoUsuarioPlantas.getSemillaMaiz()-1);
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()-1);
    }
    public static void restarNaranjo(){
        almacenamientoUsuarioPlantas.setSemillaNaranjo(almacenamientoUsuarioPlantas.getSemillaNaranjo()-1);
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()-1);
    }
    public static void restarFrjol(){
        almacenamientoUsuarioPlantas.setSemillaFrijol(almacenamientoUsuarioPlantas.getSemillaFrijol()-1);
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()-1);
    }
    public static void restarArroz(){
        almacenamientoUsuarioPlantas.setSemillaArroz(almacenamientoUsuarioPlantas.getSemillaArroz()-1);
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()-1);
    }
    public static void restarTotal(){
        almacenamientoUsuarioPlantas.setTotalSemillas(almacenamientoUsuarioPlantas.getTotalSemillas()-1);
    }
}
