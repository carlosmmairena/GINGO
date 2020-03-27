/*
    En esta clase, se tiene una agregación de Cartones, por lo que cartones es una matriz de 8x10
 */
package logica;

/**
 *
 * @author Dixiana Gómez
 * @author Carlos Mairena
 */
public class Jugador {

    private int cedula;
    private String nombre;
    private String direccion;
    private int telefono;
    private byte numSelec[];
    private int montoIni;
    private int premio;
    private byte numCarton;
    private int cantidadVec;

    public Jugador() {
        this.cedula = 0;
        this.nombre = "";
        this.direccion = "";
        this.numSelec = new byte[10];
        this.telefono = 0;
        this.montoIni = 0;
        this.premio = 0;
        this.numCarton = 0;
        this.cantidadVec = 0;
    }

    public Jugador(int cedula, String nombre, String direccion, int telefono, byte numCarton, int montoIni, int premio) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numSelec = new byte[10];
        this.montoIni = montoIni;
        this.premio = premio;
        this.numCarton = numCarton;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getMontoIni() {
        return montoIni;
    }

    public void setMontoIni(int montoIni) {
        this.montoIni = montoIni;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public byte[] getNumSelec() {
        return numSelec;
    }

    public void setNumSelec(byte[] numSelec) {
        this.numSelec = numSelec;
    }

    public byte getNumCarton() {
        return numCarton;
    }

    public void setNumCarton(byte numCarton) {
        this.numCarton = numCarton;
    }

    /**
     * Inserta un número en cada posición, si se repite lo eliminamos
     * @param num Número obtenido desde la celda seleccionada
     */
    public void agregaNumero(byte num) {

        boolean agregado = true;
        int pos = 0;
        for (int i = 0; i < cantidadVec; i++) {

            if (num == numSelec[i]) {
                pos = i;
                agregado = false;
                break;
            }
        }
        if (agregado) {
            numSelec[cantidadVec] = num;
            cantidadVec++;
        } else {
            this.reordenar(pos);
            cantidadVec--;
            System.out.println("Cantidad de números: " + cantidadVec);
        }
    }

    /**
     * Nos movemos los números que están delante para dejar libre la última posición
     * @param i 
     */
    private void reordenar(int i) {
        
        for (int j = i; j < (cantidadVec-1); j++) {
            numSelec[j] = numSelec[j + 1];
            numSelec[j + 1] = 0;
        }
    }
}
