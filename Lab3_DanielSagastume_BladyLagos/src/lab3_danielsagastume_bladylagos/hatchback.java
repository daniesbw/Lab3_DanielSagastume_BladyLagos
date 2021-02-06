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
public class hatchback extends modelos {

    private int maletero;
    private int longitud;
    private int cantidad;//bolsas de aire

    //Añade a modelo capacidad de maletero, longitud total y cantidad de bolsas de aire
    public hatchback() {
        super();
    }

    public hatchback(int maletero, int longitud, int cantidad, String nombre, int year_fabricación, String motor, String cilindrada, String tecnologías) {
        super(nombre, year_fabricación, motor, cilindrada, tecnologías);
        this.maletero = maletero;
        this.longitud = longitud;
        this.cantidad = cantidad;
    }

    public int getMaletero() {
        return maletero;
    }

    public void setMaletero(int maletero) {
        this.maletero = maletero;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    @Override
    public String toString() {
        return "hatchback{" + "maletero=" + maletero + ", longitud=" + longitud + ", cantidad=" + cantidad + '}';
    }

}
