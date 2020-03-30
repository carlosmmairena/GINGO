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
        this.jugador = new Jugador();
        this.carton = new JTable(8, 10);
        this.grafica = new FrmPrincipal();
    }

    public Cartones(String estado, byte numCarton, Jugador jugador, FrmPrincipal grafica) {

        this.numCarton = numCarton;
        this.estado = estado;
        this.jugador = jugador;
        //this.carton = carton;
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
            System.out.println("Hilo activado, escuchando notificación");
            //CeldaCustom celda;

            for (int i = 0; i < 10; i++) {

                if (grafica.getBanca().revisarNum(this.jugador)) {

                    System.out.println("Número encontrado: " + grafica.getBanca().getNumBolitas()[grafica.getBanca().getCantBols() - 1]);

                    this.jugador.setAciertosJu(Byte.parseByte((jugador.getAciertosJu() + 1) + ""));
                    this.revisaCarton();

                    System.out.println("Aciertos: " + this.jugador.getAciertosJu());
                }
                this.sleep(1500);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Cartones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Rebisa el cartón que le corresponde al jugador del hilo, y le marca de acuerdo al valor de la bolita
     */
    private void revisaCarton() {

        switch (jugador.getNumCarton()) {

            case 1:
                for (int i = 0; i < 10; i++) {
                    CeldaCustom celda = new CeldaCustom(Byte.parseByte(grafica.getBanca().getNumBolitas()[grafica.getBanca().getCantBols() - 1] + ""),
                            jugador.getNumSelec());

                    grafica.getTblCart1().getColumnModel().getColumn(i).setCellRenderer(celda);
                    grafica.getTblCart1().selectAll();
                }
                break;

            case 2:
                for (int i = 0; i < 10; i++) {
                    CeldaCustom celda = new CeldaCustom(Byte.parseByte(grafica.getBanca().getNumBolitas()[grafica.getBanca().getCantBols() - 1] + ""),
                            jugador.getNumSelec(), grafica.getBanca().getNumBolitas());

                    grafica.getTblCart2().getColumnModel().getColumn(i).setCellRenderer(celda);
                    grafica.getTblCart2().selectAll();
                }
                break;

            case 3:
                for (int i = 0; i < 10; i++) {
                    CeldaCustom celda = new CeldaCustom(Byte.parseByte(grafica.getBanca().getNumBolitas()[grafica.getBanca().getCantBols() - 1] + ""),
                            jugador.getNumSelec(), grafica.getBanca().getNumBolitas());

                    grafica.getTblCart3().getColumnModel().getColumn(i).setCellRenderer(celda);
                    grafica.getTblCart3().selectAll();
                }
                break;

            case 4:
                for (int i = 0; i < 10; i++) {
                    CeldaCustom celda = new CeldaCustom(Byte.parseByte(grafica.getBanca().getNumBolitas()[grafica.getBanca().getCantBols() - 1] + ""),
                            jugador.getNumSelec(), grafica.getBanca().getNumBolitas());

                    grafica.getTblCart4().getColumnModel().getColumn(i).setCellRenderer(celda);
                    grafica.getTblCart4().selectAll();
                }

                break;

            case 5:
                for (int i = 0; i < 10; i++) {
                    CeldaCustom celda = new CeldaCustom(Byte.parseByte(grafica.getBanca().getNumBolitas()[grafica.getBanca().getCantBols() - 1] + ""),
                            jugador.getNumSelec(), grafica.getBanca().getNumBolitas());

                    grafica.getTblCart5().getColumnModel().getColumn(i).setCellRenderer(celda);
                    grafica.getTblCart5().selectAll();
                }
                break;

            case 6:
                for (int i = 0; i < 10; i++) {
                    CeldaCustom celda = new CeldaCustom(Byte.parseByte(grafica.getBanca().getNumBolitas()[grafica.getBanca().getCantBols() - 1] + ""),
                            jugador.getNumSelec(), grafica.getBanca().getNumBolitas());

                    grafica.getTblCart6().getColumnModel().getColumn(i).setCellRenderer(celda);
                    grafica.getTblCart6().selectAll();
                }
                break;
        }
    }
}
