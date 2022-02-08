/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Beto
 */
public class Circunferencia {
    private double radio;
//constructor vacio
    public Circunferencia() {
    }
//constructor completo

    public Circunferencia(double radio) {
        this.radio = radio;
    }
//metodos getter y setter

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
//metodo to string

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }

    
    
    
}
