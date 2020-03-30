/**
 * Clase de la banca que contendrá los métodos de sacar una bolita y almacenar sus valores
 */
package logica;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dixiana y Carlos
 */
public class Banca {

    private int totalBanca;
    private int cantBols;
    private int numBolitas[];
    private ArrayList<Jugador> arrayJug;

    public Banca() {
        this.totalBanca = 10000;
        this.numBolitas = new int[10];
        this.cantBols = 0;
        this.arrayJug = new ArrayList();
    }

    public Banca(ArrayList<Jugador> arrayJug) {
        this.totalBanca = 10000;
        this.numBolitas = new int[10];
        this.cantBols = 0;
        this.arrayJug = arrayJug;
    }

    public void setArrayJug(ArrayList<Jugador> arrayJug) {
        this.arrayJug = arrayJug;
    }

    public int getTotalBanca() {
        return totalBanca;
    }

    public void setTotalBanca(int totalBanca) {
        this.totalBanca = totalBanca;
    }

    public int[] getNumBolitas() {
        return numBolitas;
    }

    public void setNumBolitas(int[] numBolitas) {
        this.numBolitas = numBolitas;
    }

    public int getCantBols() {
        return cantBols;
    }

    public void setCantBols(int cantBols) {
        this.cantBols = cantBols;
    }

    /**
     * Produce la bolita, verifica que no se repita y la guarda en el vector de
     * bolitas
     *
     * @return
     */
    public synchronized int producirBolita() {

        boolean repite;
        int bolNueva = 0;

        do {
            repite = false;
            bolNueva = (int) ((Math.random() * 80) + 1);

            for (int i = 0; i < cantBols; i++) {
                if (bolNueva == numBolitas[i]) {
                    repite = true;
                    break;
                }
            }
        } while (repite);
        this.numBolitas[cantBols] = bolNueva;
        cantBols++;
        this.notifyAll();

        return bolNueva;
    }

    /**
     * Revisa en el vector del jugador si el número nuevo de la bolita existe
     * con el número creado de la banca
     *
     * @param jugador
     * @return
     */
    public synchronized boolean revisarNum(Jugador jugador) {

        boolean existe = false;
        try {

            this.wait();

            //int bolita = Integer.parseInt(this.numBolitas[posi]);
            for (int j = 0; j < jugador.getNumSelec().length; j++) {
                if (jugador.getNumSelec()[j] == numBolitas[cantBols - 1]) {
                    existe = true;
                    System.out.println("Encontrado");
                    break;
                }
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(Cartones.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.notify();
        return existe;
    }

    /**
     * Calcula el premio de todos los jugadores
     */
    public void calcularPremios() {

        System.out.println("Ingresando a recorrer el vector de jugadores");
        for (int i = 0; i < arrayJug.size(); i++) {

            switch (arrayJug.get(i).getAciertosJu()) {

                case 5: // Gana $5
                    arrayJug.get(i).setPremio(this.calcularExtra(5, arrayJug.get(i).getApuesta()));
                    this.totalBanca -= arrayJug.get(i).getPremio();
                    break;

                case 6: // Gana $24
                    arrayJug.get(i).setPremio(this.calcularExtra(24, arrayJug.get(i).getApuesta()));
                    this.totalBanca -= arrayJug.get(i).getPremio();
                    break;

                case 7: // Gana $142
                    arrayJug.get(i).setPremio(this.calcularExtra(142, arrayJug.get(i).getApuesta()));
                    this.totalBanca -= arrayJug.get(i).getPremio();
                    break;

                case 8: // Gana $1000
                    arrayJug.get(i).setPremio(this.calcularExtra(1000, arrayJug.get(i).getApuesta()));
                    this.totalBanca -= arrayJug.get(i).getPremio();
                    break;

                case 9: // Gana $4500
                    arrayJug.get(i).setPremio(this.calcularExtra(4500, arrayJug.get(i).getApuesta()));
                    this.totalBanca -= arrayJug.get(i).getPremio();
                    break;

                case 10: // Gana $10000
                    arrayJug.get(i).setPremio(this.calcularExtra(10000, arrayJug.get(i).getApuesta()));
                    this.totalBanca -= arrayJug.get(i).getPremio();
                    break;

                default: // Si no gana esos aciertos, pierde la apuesta
                    this.totalBanca = totalBanca + arrayJug.get(i).getApuesta();
                    arrayJug.get(i).setMontoIni(arrayJug.get(i).getMontoIni() - arrayJug.get(i).getApuesta());
                    System.out.println("Pierde lo que apostó");
                    break;
            }
        }
    }

    /**
     * Calcula el premio con su extra de acuerdo a la apuesta.
     * @param premio
     * @param apuesta
     * @return 
     */
    private int calcularExtra(int premio, byte apuesta) {

        int total = premio;

        switch (apuesta) {

            case 10: // 10% extra
                total += (premio * 0.1);
                break;

            case 15: // 20% extra
                total += (premio * 0.2);
                break;

            case 20: // 30% extra
                total += (premio * 0.3);
                break;

            case 30: // 40% extra
                total += (premio * 0.4);
                break;

            default:
                System.out.println("No se le asigna un extra por apostar el mínimo");
                break;
        }

        return total;
    }
}
