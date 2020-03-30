/*
Esta clase recibe un vector donde se ubican los números que un jugador a elegido.
 */
package logica;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Dixiana y Carlos
 */
public class CeldaCustom extends DefaultTableCellRenderer {

    private byte num;
    private byte numSelec[];
    private int numBolitas[];
    private boolean revisar;

    /**
     * Constructor por defecto
     */
    public CeldaCustom() {
        this.num = 1;
        this.numSelec = new byte[0];
        this.numBolitas = new int[0];
        this.revisar = false;
    }

    /**
     * Recibe el vector que contiene los números del jugador. Este se llama para
     * seleccionar los números.
     *
     * @param num
     * @param numSelec
     */
    public CeldaCustom(byte num, byte numSelec[]) {

        this.num = num;
        this.numSelec = numSelec;
        this.revisar = false;
        this.numBolitas = new int[0];
    }

    /**
     * Recibe el vector que contiene los números del jugador, y el vector de la
     * banca. Este se llama para marcar los números seleccionados que estén en
     * la bolita.
     *
     * @param num
     * @param numSelec
     * @param numBolitas
     */
    public CeldaCustom(byte num, byte numSelec[], int numBolitas[]) {

        this.num = num;
        this.numSelec = numSelec;
        this.revisar = true;
        this.numBolitas = numBolitas;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {

        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        byte v = (byte) value;
        if (revisar) { // Si revisa la bolita

            System.out.println("Ingresa para colorear la celda de la bolita encontrada");

            if (v == num && revisarValor(num)) {

                this.setBackground(Color.GREEN);
                this.setForeground(Color.BLACK);
                System.out.println("Colorea de verde la celda");

            } else if (revisarBols(v) && revisarValor(v)) {

                this.setBackground(Color.GREEN);
                this.setForeground(Color.BLACK);
                System.out.println("Colorea de verde");

            } else if (revisarValor(v)) {
                this.setBackground(Color.ORANGE);
                this.setForeground(Color.BLACK);
                System.out.println("Colorea de naranja la celda");
            } else {
                this.setBackground(Color.WHITE);
                this.setForeground(Color.BLACK);
                System.out.println("Colorea de blanca la celda");
            }

        } else {

            //System.out.println("Ingresa para seleccionar la celda");
            if ((v == num) && (revisarValor(v))) { // Número nuevo para agregar

                this.setBackground(Color.ORANGE);
                this.setForeground(Color.BLACK);

            } else if ((v == num) && (!revisarValor(v))) { // Si ya existe y ese se vuelve a seleccionar, lo desmarca

                this.setBackground(Color.WHITE);
                this.setForeground(Color.BLACK);

            } else if (revisarValor(v)) { // Ya existe, no lo desmarca

                this.setBackground(Color.ORANGE);
                this.setForeground(Color.BLACK);

            } else { // Si no está seleccionado
                this.setBackground(Color.WHITE);
                this.setForeground(Color.BLACK);
            }
        }
        return this;
    }

    /**
     * Revisa si el valor de la celda actual está en el vector de las bolitas
     *
     * @param valCeld
     * @return
     */
    private boolean revisarBols(int valCeld) {
        boolean existe = false;

        for (int i = 0; i < numBolitas.length; i++) {

            if (valCeld == numBolitas[i]) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    /**
     * Revisa si el número de la celda está en el vector del jugador
     *
     * @param v
     * @return
     */
    private boolean revisarValor(byte v) {
        boolean existe = false;

        for (int i = 0; i < numSelec.length; i++) {

            if (numSelec[i] == v) {
                existe = true;
                break;
            }
        }
        return existe;
    }
}
