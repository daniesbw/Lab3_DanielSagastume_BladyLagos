package lab3_danielsagastume_bladylagos;

import lab3_danielsagastume_bladylagos.modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gerardo Lagos
 */
public class SUV extends modelos {

    private Boolean todoterreno;//si o no
    private int cantidad_maxima_pasajeros;
    private String navegador;

    //SUV: Añade a modelo 4x4 (Si o no), Cantidad máxima de pasajeros y nombre del navegador. 
    public SUV() {
        super();
    }

    public SUV(Boolean todoterreno, int cantidad_maxima_pasajeros, String navegador, String nombre, int year_fabricación, String motor, String cilindrada, String tecnologías) {
        super(nombre, year_fabricación, motor, cilindrada, tecnologías );
        this.todoterreno = todoterreno;
        this.cantidad_maxima_pasajeros = cantidad_maxima_pasajeros;
        this.navegador = navegador;
    }

    public Boolean getTodoterreno() {
        return todoterreno;
    }

    public void setTodoterreno(Boolean todoterreno) {
        this.todoterreno = todoterreno;
    }

    public int getCantidad_maxima_pasajeros() {
        return cantidad_maxima_pasajeros;
    }

    public void setCantidad_maxima_pasajeros(int cantidad_maxima_pasajeros) {
        this.cantidad_maxima_pasajeros = cantidad_maxima_pasajeros;
    }

    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }

    @Override
    public String toString() {
        return "SUV{" + "todoterreno=" + todoterreno + ", cantidad_maxima_pasajeros=" + cantidad_maxima_pasajeros + ", navegador=" + navegador + '}';
    }

}
