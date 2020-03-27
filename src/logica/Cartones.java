/*
    Esta clase de Cartones es un hilo, y cada cartón contendrá una matriz de 8x10
 */
package logica;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import vista.FrmPrincipal;

/**
 *
 * @author Dixiana Gómez
 * @author Carlos Mairena
 */
public class Cartones extends Thread {

    //Atributos
    private byte numCarton;
    private String estado;
    //private byte apuesta;
    private Jugador jugador;
    private JTable carton;
    //private byte aciertosJu;
    private FrmPrincipal grafica;

    //Constructor
    public Cartones() {
        this.numCarton = 0;
        this.estado = "Disponible";
        //this.apuesta = 0;
        this.jugador = new Jugador();
        this.carton = new JTable(8, 10);
        //this.aciertosJu = 0;
        this.grafica = new FrmPrincipal();
    }

    public Cartones(String estado, byte numCarton, JTable carton, Jugador jugador, FrmPrincipal grafica) {

        this.numCarton = numCarton;
        this.estado = estado;
        //this.apuesta = 5;
        this.jugador = jugador;
        this.carton = carton;
        //this.aciertosJu = 0;
        this.grafica = grafica;
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

    @Override
    public void run() {
        try {
            // sobre escribimos para personalizar su funcionamiento
            System.out.println("Hilo activado");

            for (int i = 0; i < 10; i++) {

                if (grafica.getBanca().revisarNum(this.jugador)) {
                    System.out.println("Número encontrado: " + grafica.getTxtBolita().getText());
                    this.jugador.setAciertosJu(Byte.parseByte((jugador.getAciertosJu()+1)+""));
                    System.out.println("Aciertos: " + this.jugador.getAciertosJu());
                }
                System.out.println("Sale de revisar la bolita en sus números");

                this.sleep(1500);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Cartones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
