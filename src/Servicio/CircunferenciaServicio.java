/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Beto
 */
public class CircunferenciaServicio {
    public Circunferencia CrearCircunferencia(){
        Circunferencia c1= new Circunferencia();
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el valor del radio");
        c1.setRadio(leer.nextDouble());
        return c1;
    }
    public double Area(Circunferencia c1){
    double area;
    area= 3.1417* c1.getRadio() * c1.getRadio();
    return area;
    }
    public double Perimetro(Circunferencia c1){
    double perimetro;
    perimetro= 2 * 3.1419 * c1.getRadio();
    return perimetro;
    }
}
