/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_danielsagastume_bladylagos;

/**
 *
 * @author Gerardo Lagos
 */
public class fabricas {

    private String nombre;
    private String ubicación;
    private int cantidadMaxima;//máxima de modelos que se pueden fabricar
    private String carroceriaTop;//Top
    private int empleados;//cantidad
    private String nombreMarcas;//nombre de las marcas que ensamblan en dicha fábrica
    private int cantidad;// de autos que se fabrican actualmente

    
    /*
    se conoce su nombre, ubicación, cantidad máxima de modelos que se pueden fabricar, tipo de
    carrocería más fabricada, cantidad de empleados, nombre de las marcas que ensamblan en dicha
    fábrica y cantidad de autos que se fabrican actualmente. 
     */

    public fabricas(String nombre, String ubicación, int cantidadMaxima, String carroceriaTop, int empleados, String nombreMarcas, int cantidad) {
        this.nombre = nombre;
        this.ubicación = ubicación;
        this.cantidadMaxima = cantidadMaxima;
        this.carroceriaTop = carroceriaTop;
        this.empleados = empleados;
        this.nombreMarcas = nombreMarcas;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicación() {
        return ubicación;
    }

    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public String getCarroceriaTop() {
        return carroceriaTop;
    }

    public void setCarroceriaTop(String carroceriaTop) {
        this.carroceriaTop = carroceriaTop;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public String getNombreMarcas() {
        return nombreMarcas;
    }

    public void setNombreMarcas(String nombreMarcas) {
        this.nombreMarcas = nombreMarcas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "fabricas{" + "nombre=" + nombre + ", ubicaci\u00f3n=" + ubicación + ", cantidadMaxima=" + cantidadMaxima + ", carroceriaTop=" + carroceriaTop + ", empleados=" + empleados + ", nombreMarcas=" + nombreMarcas + ", cantidad=" + cantidad + '}';
    }
    
    
}
