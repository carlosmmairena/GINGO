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

    private int num;
    private byte numSelec[];

    /**
     * Recibe el vector que contiene los números...
     *
     * @param num
     * @param numSelec
     */
    public CeldaCustom(byte num, byte numSelec[]) {

        this.num = num;
        this.numSelec = numSelec;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {

        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        byte v = (byte) value;

        if ((v == num) && (revisarValor(v))) { // Número nuevo para agregar

            this.setBackground(Color.RED);
            this.setForeground(Color.BLACK);
            //System.out.println("Número nuevo para agregar");

        } else if ((v == num) && (!revisarValor(v))) { // Si ya existe y ese se vuelve a seleccionar, lo desmarca

            this.setBackground(Color.WHITE);
            this.setForeground(Color.BLACK);
            //System.out.println("ya existe y ese se vuelve a seleccionar");

        } else if (revisarValor(v)) { // Ya existe, no lo desmarca

            this.setBackground(Color.RED);
            this.setForeground(Color.BLACK);
            //System.out.println("Ya existe, no lo desmarca");
        } else { // Si no está seleccionado
            this.setBackground(Color.WHITE);
            this.setForeground(Color.BLACK);
            //System.out.println("No se marca porque no se selecciona");
        }
        return this;
    }


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
