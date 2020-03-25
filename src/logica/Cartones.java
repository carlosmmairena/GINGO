/*
    Esta clase de Cartones es un hilo, y cada cartón contendrá una matriz de 8x10
*/

package logica;

import javax.swing.JTable;

/**
 *
 * @author Dixiana Gómez
 * @author Carlos Mairena
 */
public class Cartones extends Thread {
    
    //Atributos
    private byte numCarton;
    private String estado;
    private byte apuesta;
    private Jugador jugador;
    private JTable carton;
    private byte aciertosJu;

    //Constructor
    public Cartones() {
        this.numCarton = 0;
        this.estado = "Disponible";
        this.apuesta = 0;
        this.jugador = new Jugador();
        this.carton = new JTable(8, 10);
        this.aciertosJu = 0;
    }
    
    public Cartones(String estado, byte numCarton, JTable carton,Jugador jugador) {
        
        this.numCarton = numCarton;
        this.estado = estado;
        this.apuesta = 5;
        this.jugador = jugador;
        this.carton = carton;
        this.aciertosJu = 0;
    }

    @Override
    public void run() {
        // sobre escribimos para personalizar su funcionamiento
        System.out.println("Hilo activado");
    }
    
    //set & get
    public byte getNumCarton() {
        return numCarton;
    }

    public void setNumCarton(byte numCarton) {
        this.numCarton = numCarton;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public byte getApuesta() {
        return apuesta;
    }

    public void setApuesta(byte apuesta) {
        this.apuesta = apuesta;
    }

    public byte getAciertosJu() {
        return aciertosJu;
    }

    public void setAciertosJu(byte aciertosJu) {
        this.aciertosJu = aciertosJu;
    }

    public JTable getCarton() {
        return carton;
    }

    public void setCarton(JTable carton) {
        this.carton = carton;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
}
