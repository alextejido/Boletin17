package boletin17;

/**
 *
 * @author atejidosolla
 */
public class Numeros {
    
    int[] num = new int[6];
    
    public void CrearArray(){
        
        for(int i=0; i<num.length;i++)
        num[i] = (int) (Math.random()* 50+1);
    }    
    
    public void Amosar(){
        
        for(int i=num.length -1; i>=0;i--)
          System.out.println(num[i]);          
    }
}
