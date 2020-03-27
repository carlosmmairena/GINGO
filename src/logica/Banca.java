/**
 * Clase de la banca que contendrá los métodos de sacar una bolita y almacenar sus valores
 */
package logica;

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

    public Banca() {
        this.totalBanca = 10000;
        this.numBolitas = new int[10];
        this.cantBols = 0;
    }

    public Banca(int totalBanca) {
        this.totalBanca = totalBanca;
        this.numBolitas = new int[10];
        this.cantBols = 0;
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
     * Produce la bolita, verifica que no se repita y la guarda en el vector de bolitas
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
     * Revisa en el vector del jugador si el número nuevo de la bolita existe con el número creado de la banca
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
                if (jugador.getNumSelec()[j] == numBolitas[cantBols-1]) {
                    existe = true;
                    System.out.println("Encontrado");
                    break;
                } else {
                    System.out.println("No encontrado");
                }
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Cartones.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.notify();
        return existe;
    }
}
