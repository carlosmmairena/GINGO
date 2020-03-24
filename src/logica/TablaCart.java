package logica;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Dixiana y Carlos
 */
public class TablaCart extends DefaultTableCellRenderer {

    private int row;
    private int column;
    private JTable tabla;
    private String color;

    public TablaCart(JTable tabla, int row, int column) {
        this.row = row;
        this.column = column;
        this.tabla = tabla;

    }

    public TablaCart(String color, int row, int column) {
        this.row = row;
        this.column = column;
        this.color = color;

    }

    public TablaCart(JTable tabla) {
        this.tabla = tabla;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (this.row == row && this.column == column && color.equals("rojo")) {
            
            label.setBackground(Color.WHITE);
            label.setForeground(Color.BLACK);
            System.out.println("Cambia a blanco porque era rojo");
            
        } else if (this.row == row && this.column == column && color.equals("blanco")) {
            
            label.setBackground(Color.RED);
            label.setForeground(Color.DARK_GRAY);
            System.out.println("Cambia a rojo porque si es la seleccinada");
            
            
        } else if (color.equals("rojo")) {
            
            label.setBackground(Color.RED);
            label.setForeground(Color.DARK_GRAY);
            System.out.println("No cambia el color rojo");
            
        } else {
            
            label.setBackground(Color.WHITE);
            label.setForeground(Color.BLACK);
            System.out.println("no cambia el color blanco");
            

        }
        return label;
    }
}
