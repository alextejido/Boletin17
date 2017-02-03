package boletin17;

import javax.swing.JOptionPane;

/**
 *
 * @author atejidosolla
 */
public class CalculoNif {
    
char[] letra={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

public void intronif(){
    
    int nif;
    nif=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu nif"));
   
    int division =nif%23;
   
    System.out.println("La letra es: "+letra);
    
}

    
}
