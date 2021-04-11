package jugador;

/**
 *
 * @author Mariano
 */
public class Jugador {
    //atributos del jugador
    private String nombre;
    private String nick;
    private double monedas;
    private int vida;
    private int barco;
    public static Jugador jugador1;//llamamos la creacion de un nuevo jugador
    //constructor del jugador
    public Jugador(String nombre, String nick, double monedas, int vida,int barco){
        this.nombre=nombre;
        this.nick=nick;
        this.monedas=monedas;
        this.vida=vida;
        this.barco=barco;
    }
    //gets y sets del los atributos del jugador
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNick() {
        return this.nick;
    }
    public void setNick(String nick) {
        this.nick = nick;
    }
    public double getMonedas() {
        return this.monedas;
    }
    public void setMonedas(double monedas) {
        this.monedas = monedas;
    }
    public int getVida() {
        return this.vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getBarco() {
        return this.barco;
    }

    public void setBarco(int barco) {
        this.barco = barco;
    }
    
    public static void creadorJugador(){
        jugador1 = new Jugador("sds","sdasd",500,100,0);
    }
}
