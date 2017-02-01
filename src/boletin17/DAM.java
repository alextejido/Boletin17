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
    
    public void AmosarNotas(){
        
        int aprobados =0;
        int suspensos=0;
        for(int i=0; i<notas.length;i++){
            
        if(notas[i]<5){
            suspensos++;
                System.out.println(notas[i]+"-->Suspenso");
        }else{
                aprobados++;
                System.out.println(notas[i]+"-->Aprobado");
    }
         System.out.println(" O numero total de aprobados e "+aprobados
       +" \n E o de suspensos e "+suspensos);
    }
    }
    
    public void NotaMedia(){
        
        
        
    }
    
}
