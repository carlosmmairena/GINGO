/*
    Esta clase de Cartones es un hilo, y cada cartón contendrá una matriz de 8x10
*/

package logica;

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
    private byte matriz[][];
    private byte aciertosJu;

    //Constructor
    public Cartones() {
        this.numCarton = 0;
        this.estado = "Disponible";
        this.apuesta = 0;
        this.matriz = new byte[8][10];
        this.aciertosJu = 0;
    }
    public Cartones(byte numCarton, byte[][] matriz) {
        
        this.numCarton = numCarton;
        this.estado = "Disponible";
        this.apuesta = 5;
        this.matriz = matriz;
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

    public byte[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(byte[][] matriz) {
        this.matriz = matriz;
    }

    public byte getAciertosJu() {
        return aciertosJu;
    }

    public void setAciertosJu(byte aciertosJu) {
        this.aciertosJu = aciertosJu;
    }
    
    public void llenarCarton(){
        
        byte num;
        
        for (int fil = 0; fil < 8; fil++) {
            for (int col = 0; col < 10; col++) {
                
               num = (byte)(Math.random() * 80 + 1);
               
               if(revisar(num)){
                   col--;
               } else {
                   matriz[fil][col] = num;
               }
            }
        }
    }
    
    public boolean revisar(byte num){
        
        boolean aviso = false;
        
        for (int fil = 0; fil < 8; fil++) {
            for (int col = 0; col < 10; col++) {
                
                if(num == matriz[fil][col]){
                    aviso = true;
                    break;
                }
            }
        }
        return aviso;
    }
}
