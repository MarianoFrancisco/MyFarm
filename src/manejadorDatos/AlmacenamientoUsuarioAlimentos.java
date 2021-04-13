/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorDatos;

/**
 *
 * @author Mariano
 */
public class AlmacenamientoUsuarioAlimentos {
    private int usuarioManzano;
    private int usuarioNaranjo;
    private int usuarioBanano;
    public static AlmacenamientoUsuarioAlimentos almacenamientoUsuarioAlimentos;
    public AlmacenamientoUsuarioAlimentos(int usuarioManzano,int usuarioNaranjo,int usuarioBanano){
        this.usuarioManzano=usuarioManzano;
        this.usuarioNaranjo=usuarioNaranjo;
        this.usuarioBanano=usuarioBanano;
    }

    public int getUsuarioManzano() {
        return this.usuarioManzano;
    }

    public void setUsuarioManzano(int usuarioManzano) {
        this.usuarioManzano = usuarioManzano;
    }

    public int getUsuarioNaranjo() {
        return this.usuarioNaranjo;
    }

    public void setUsuarioNaranjo(int usuarioNaranjo) {
        this.usuarioNaranjo = usuarioNaranjo;
    }

    public int getUsuarioBanano() {
        return this.usuarioBanano;
    }

    public void setUsuarioBanano(int usuarioBanano) {
        this.usuarioBanano = usuarioBanano;
    }
    public static void crearAlmacenamientoUsAnimales(){
        almacenamientoUsuarioAlimentos = new AlmacenamientoUsuarioAlimentos(0,0,0);
    }
}
