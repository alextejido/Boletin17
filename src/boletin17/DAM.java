package boletin17;

import javax.swing.JOptionPane;

/**
 *
 * @author atejidosolla
 */
public class DAM {
    
    int[] notas=new int[5];
     String nombres []= new String[3];
     
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
        
     int media=0;
    for(int i=0;i<notas.length;i++){
      media = media+notas[i];
  
    } 
    System.out.println(media/notas.length);
    }
        
    public void MayorNota(){
        
       int notaMayor = notas[0];
 
    for(int i=0;i<notas.length;i++){
         if(notas[i]>notaMayor){
        notaMayor =notas[i];
        
    }
    }
   System.out.println("A maior nota é "+notaMayor);
}
        
  public void amosarAlumno(){
      
    boolean encontrado = false;
    String encontrar = JOptionPane.showInputDialog("Elixe o nome do alumno");
    for(int i=0;i<nombres.length;i++){
     if(encontrar.equals(nombres[i])){
        encontrado = true;
        System.out.println("O nome  do alumno é " + nombres+"E a sua nota é "+notas);
    }else{
        System.out.println("O alumno introducido non esta na clase");
        
    }
  }      
    
  }
  
  public void AlumnosAprobados(){
      
      for(int i=0;i<notas.length;i++){
          if(notas[i]>=5){
              System.out.println("O nome do alumno aprobado é "+nombres+" e a sua nota é un "+notas[i]);
             
          }
          else
              System.out.println("Alumno suspenso: ");
          
      }
      
  }
  
  public void Ordenar(){
      
      int auxnota;
      String auxstring;
      
      for(int i=0;i<notas.length -1;i++)
          for(int j=i+1;j<notas.length;j++){
              if(notas[i]>notas[j]){
                  
                  auxnota=notas[i];
                  notas[i]=notas[j];
                  notas[j]=auxnota;
                  auxstring=nombres[i];
                  nombres[i]=nombres[j];
                  nombres[j]=auxstring;
                  
                  System.out.println("Alumno: "+auxstring+" Nota: "+auxnota);
                  
              }
               
              
  }
      
  }
}
    

