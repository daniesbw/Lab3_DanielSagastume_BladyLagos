/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_danielsagastume_bladylagos;

import java.util.ArrayList;

/**
 *
 * @author Gerardo Lagos
 */
public class modelos {

    private String nombre;//de modelo
    private int year_fabricación;
    private String motor;//tipo
    private String cilindrada;//del motor
    private String tecnologías;//precio y tecnologías
    
    

//    nombre del modelo, año de
//fabricación, tipo de motor, cilindrada del motor, precio y tecnologías. Los modelos de las marcas se
//distinguen según sus carrocerías:

    public modelos() {
        
    }

    public modelos(String nombre, int year_fabricación, String motor, String cilindrada, String tecnologías) {
        this.nombre = nombre;
        this.year_fabricación = year_fabricación;
        this.motor = motor;
        this.cilindrada = cilindrada;
        this.tecnologías = tecnologías;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYear_fabricación() {
        return year_fabricación;
    }

    public void setYear_fabricación(int year_fabricación) {
        this.year_fabricación = year_fabricación;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTecnologías() {
        return tecnologías;
    }

    public void setTecnologías(String tecnologías) {
        this.tecnologías = tecnologías;
    }


 

    

    @Override
    public String toString() {
        return "modelos{" + "nombre=" + nombre + ", year_fabricaci\u00f3n=" + year_fabricación + ", motor=" + motor + ", cilindrada=" + cilindrada + ", tecnolog\u00edas=" + tecnologías + '}';
    }

    
    
}
