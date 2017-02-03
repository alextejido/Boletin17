/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

/**
 *
 * @author atejidosolla
 */
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       Numeros num= new Numeros();
        num.CrearArray();
        num.Amosar();
        
        
        DAM not=new DAM();
        not.cargarArray();
        not.AmosarNotas();
       not.AlumnosAprobados();
       not.MayorNota();
       not.NotaMedia();
       not.amosarAlumno();
       not.Ordenar();
    }
    
}
