package boletin17;

import javax.swing.JOptionPane;

/**
 *
 * @author atejidosolla
 */
public class DAM {
    
    int[] notas=new int[5];
    
    public void cargarArray(){
    
        for(int i=0; i<notas.length;i++)
        notas[i] =Integer .parseInt(JOptionPane.showInputDialog("Introducir Notas"));
    
}
    
}
