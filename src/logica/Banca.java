/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author dixiana y Carlos
 */
public class Banca {
    private int totalBanca;
    private int numBolitas[];

    public Banca() {
        this.totalBanca = 10000;
        this.numBolitas = new int[10];
    }
    
    public Banca(int totalBanca) {
        this.totalBanca = totalBanca;
        this.numBolitas = new int[10];
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
    
    
    
    
    
    
}
