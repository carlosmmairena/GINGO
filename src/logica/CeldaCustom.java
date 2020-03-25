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

    private int row;
    private int column;
    private byte num;

    public CeldaCustom(byte num, int row, int column) {
        this.row = row;
        this.column = column;
        this.num = num;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        //DefaultTableCellRenderer celda = (DefaultTableCellRenderer) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        
        //if (this.row == row && this.column == column ) {
        byte v = (byte) table.getValueAt(row, column);
        if (this.row == row && this.column == column && v == num) {
            
            this.setBackground(Color.RED);
            this.setForeground(Color.BLACK);
            System.out.println("Cambia a blanco porque era rojo");
            
        } else if ( v == num) {
            
            this.setBackground(Color.WHITE);
            this.setForeground(Color.DARK_GRAY);
            System.out.println("Cambia a rojo porque si es la seleccinada");
        } else {
            
            this.setBackground(Color.WHITE);
            this.setForeground(Color.BLACK);
            System.out.println("no cambia el color blanco");
            
        }
        return this;
    }
}
