package manejadorDatos;

/**
 *
 * @author Mariano
 */
public class EstablecerInstruccionesHilos {
    private int hiloMaiz;
    private int hiloFrijol;
    private int hiloArroz;
    private int hiloManzano;
    private int hiloNaranjo;
    private int hiloBanano;
    public static EstablecerInstruccionesHilos establecerInstruccionesHilos;
    public EstablecerInstruccionesHilos(int hiloMaiz,int hiloFrijol,int hiloArroz,int hiloManzano,int hiloNaranjo,int hiloBanano){
        this.hiloMaiz=hiloMaiz;
        this.hiloFrijol=hiloFrijol;
        this.hiloArroz=hiloArroz;
        this.hiloManzano=hiloManzano;
        this.hiloNaranjo=hiloNaranjo;
        this.hiloBanano=hiloBanano;
    }

    public int getHiloMaiz() {
        return this.hiloMaiz;
    }

    public void setHiloMaiz(int hiloMaiz) {
        this.hiloMaiz = hiloMaiz;
    }

    public int getHiloFrijol() {
        return this.hiloFrijol;
    }

    public void setHiloFrijol(int hiloFrijol) {
        this.hiloFrijol = hiloFrijol;
    }

    public int getHiloArroz() {
        return this.hiloArroz;
    }

    public void setHiloArroz(int hiloArroz) {
        this.hiloArroz = hiloArroz;
    }

    public int getHiloManzano() {
        return this.hiloManzano;
    }

    public void setHiloManzano(int hiloManzano) {
        this.hiloManzano = hiloManzano;
    }

    public int getHiloNaranjo() {
        return this.hiloNaranjo;
    }

    public void setHiloNaranjo(int hiloNaranjo) {
        this.hiloNaranjo = hiloNaranjo;
    }

    public int getHiloBanano() {
        return this.hiloBanano;
    }

    public void setHiloBanano(int hiloBanano) {
        this.hiloBanano = hiloBanano;
    }
    public static void crearEstablecerInstrucHilos(){
         establecerInstruccionesHilos = new EstablecerInstruccionesHilos(0,0,0,0,0,0);
    }
}
