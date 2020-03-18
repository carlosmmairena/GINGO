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
    private Cartones carton;
    private int montoIni;
    private int premio;

    public Jugador() {
        this.cedula = 0;
        this.nombre = "";
        this.direccion = "";
        this.carton = new Cartones();
        this.montoIni = 0;
        this.premio = 0;
    }
    
    public Jugador(int cedula, String nombre, String direccion, Cartones carton, int montoIni, int premio) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.carton = carton;
        this.montoIni = montoIni;
        this.premio = premio;
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

    public Cartones getCarton() {
        return carton;
    }

    public void setCarton(Cartones carton) {
        this.carton = carton;
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
    
    
    
}
