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
public class tecnologicas {

    ArrayList<String> tecnologicas = new ArrayList();

    private String nombre;
    private int yearcreacion;
    private String campo;//al que se dedican
    private String tecnologias;//tecnologías ya desarrolladas

    public tecnologicas() {
    }

    public tecnologicas(String nombre, int yearcreacion, String campo, String tecnologias) {
        this.nombre = nombre;
        this.yearcreacion = yearcreacion;
        this.campo = campo;
        this.tecnologias = tecnologias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYearcreacion() {
        return yearcreacion;
    }

    public void setYearcreacion(int yearcreacion) {
        this.yearcreacion = yearcreacion;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    @Override
    public String toString() {
        return "tecnologicas{" + "nombre=" + nombre + ", yearcreacion=" + yearcreacion + ", campo=" + campo + ", tecnologias=" + tecnologias + '}';
    }

}
