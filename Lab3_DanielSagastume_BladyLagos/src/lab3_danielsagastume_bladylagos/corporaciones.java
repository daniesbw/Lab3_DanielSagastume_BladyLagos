/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_danielsagastume_bladylagos;

import java.util.ArrayList;

/*
    Nombre, sede, año de fundación, CEO o presidente, número total de empleados, cantidad de autos
    que se pueden fabricados y cuenta con una lista de marcas que pertenecen a la corporación
 */
/**
 *
 * @author danielsagastume and bladylagos
 */
public class corporaciones {

    ArrayList<marcas> marca = new ArrayList();
    ArrayList<tecnologicas>  divisiones = new ArrayList();
    ArrayList<fabricas> fabricas = new ArrayList();

    private String nombre;
    private String sede;
    private int year_fundación;
    private String presidente;
    private int empleados;
    private int cantidad;//de autos que se pueden fabricados


    public corporaciones() {

    }

    public corporaciones(ArrayList<marcas> marca, ArrayList<tecnologicas> divisiones, ArrayList<fabricas> fabricas,String vombre, String sede, int year_fundación, String presidente, int empleados, int cantidad) {
        this.nombre = nombre;
        this.sede = sede;
        this.year_fundación = year_fundación;
        this.presidente = presidente;
        this.empleados = empleados;
        this.cantidad = cantidad;
        this.marca=marca;
        this.divisiones=divisiones;
        this.fabricas=fabricas;
    }

    public ArrayList<marcas> getMarca() {
        return marca;
    }

    public void setMarca(ArrayList<marcas> marca) {
        this.marca = marca;
    }

    public ArrayList<tecnologicas> getDivisiones() {
        return divisiones;
    }

    public void setDivisiones(ArrayList<tecnologicas> divisiones) {
        this.divisiones = divisiones;
    }

    public ArrayList<fabricas> getFabricas() {
        return fabricas;
    }

    public void setFabricas(ArrayList<fabricas> fabricas) {
        this.fabricas = fabricas;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public int getYear_fundación() {
        return year_fundación;
    }

    public void setYear_fundación(int year_fundación) {
        this.year_fundación = year_fundación;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "corporaciones{" + "nombre=" + nombre + ", sede=" + sede + ", year_fundaci\u00f3n=" + year_fundación + ", presidente=" + presidente + ", empleados=" + empleados + ", cantidad=" + cantidad + '}';
    }

}
