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
    private int row;
    private int column;
    private byte numSelec[];

    /**
     * Recibe el vector que contiene los números...
     * @param num
     */
    public CeldaCustom(byte num, byte numSelec[], int row, int column) {
        
        this.num = num;
        this.numSelec = numSelec;
        this.row = row;
        this.column = column;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        //DefaultTableCellRenderer celda = (DefaultTableCellRenderer) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        
        //if (this.row == row && this.column == column ) {
        byte v = (byte) value;
        
        if (v == num) {
            
            this.setBackground(Color.RED);
            this.setForeground(Color.BLACK);
            System.out.println("Cambia a rojo porque se seleccionó");
            
        } else if (revisarValor(v)) { // Se desmarca y se elimina del vector
            
            this.setBackground(Color.RED);
            this.setForeground(Color.BLACK);
            System.out.println("Lo deja en rojo porque si existe el número");
            
        } else { // no hace nada porque no se marcó
            
            this.setBackground(Color.WHITE);
            this.setForeground(Color.BLACK);
            System.out.println("Lo deja en blanco porque nunca se seleccionó");
        }
        
        return this;
    }
    
    private boolean revisarValor(byte v){
        boolean existe = false;
        
        for (int i = 0; i < numSelec.length; i++) {
            
            if ( numSelec[i] ==  v){
                existe = true;
            }
        }
        
        return existe;
    }
    
}
