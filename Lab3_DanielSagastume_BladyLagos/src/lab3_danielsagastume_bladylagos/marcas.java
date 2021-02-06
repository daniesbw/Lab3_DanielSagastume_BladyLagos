/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_danielsagastume_bladylagos;

import java.util.ArrayList;

/**
 *
 * @author danielsagastume and bladylagos
 */
public class marcas {

    /*
    nombre, slogan o lema, año de fundación, año que se
integro a la corporación, fundador, total de ventas anuales, CEO o presidente y número de modelos. 
     */
    private String nombre;
    private String lema;
    private int year_fundación;
    private String year_integracion;//a la corporación
    private String fundador;
    private int ventas;//ventas_anuales
    private String presidente;
    private int modelos;//num
    ArrayList<modelos> modelos_add = new ArrayList();

    public marcas() {

    }

    public marcas(String nombre, String lema, int year_fundación, String year_integracion, String fundador, int ventas, String presidente, int modelos, ArrayList<modelos> modelos_add) {
        this.nombre = nombre;
        this.lema = lema;
        this.year_fundación = year_fundación;
        this.year_integracion = year_integracion;
        this.fundador = fundador;
        this.ventas = ventas;
        this.presidente = presidente;
        this.modelos = modelos;
        this.modelos_add=modelos_add;
    }

    public ArrayList<modelos> getModelos_add() {
        return modelos_add;
    }

    public void setModelos_add(ArrayList<modelos> modelos_add) {
        this.modelos_add = modelos_add;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public int getYear_fundación() {
        return year_fundación;
    }

    public void setYear_fundación(int year_fundación) {
        this.year_fundación = year_fundación;
    }

    public String getYear_integracion() {
        return year_integracion;
    }

    public void setYear_integracion(String year_integracion) {
        this.year_integracion = year_integracion;
    }

    public String getFundador() {
        return fundador;
    }

    public void setFundador(String fundador) {
        this.fundador = fundador;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public int getModelos() {
        return modelos;
    }

    public void setModelos(int modelos) {
        this.modelos = modelos;
    }

    @Override
    public String toString() {
        return "marcas{" + "nombre=" + nombre + ", lema=" + lema + ", year_fundaci\u00f3n=" + year_fundación + ", year_integracion=" + year_integracion + ", fundador=" + fundador + ", ventas=" + ventas + ", presidente=" + presidente + ", modelos=" + modelos + '}';
    }

}
