/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

import Servicio.CircunferenciaServicio;

/**
 *
 * @author Beto
 */
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
     CircunferenciaServicio cs= new CircunferenciaServicio();
     Entidad.Circunferencia c1= cs.CrearCircunferencia();
     System.out.println("El perimetro es "+ cs.Perimetro(c1));
     System.out.println("El area es " +  cs.Area(c1));
     
    }
    
}
