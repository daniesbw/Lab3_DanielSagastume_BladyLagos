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
public class premium extends marcas {

    private String división_deportiva;
    private String nombre_división;
    private String carrocería;
    //la marca nombre de su división deportiva
    //nombre de su división de lujo
    //tipo de carrocería más fabricada (sedán, hatchback o coupé).

    public premium() {
        super();
    }

    public premium(String división_deportiva, String nombre_división, String carrocería, String nombre, String lema, int year_fundación, String year_integracion, String fundador, int ventas, String presidente, int modelos, ArrayList<lab3_danielsagastume_bladylagos.modelos> modelos_add) {
        super(nombre, lema, year_fundación, year_integracion, fundador, ventas, presidente, modelos, modelos_add);
        this.división_deportiva = división_deportiva;
        this.nombre_división = nombre_división;
        this.carrocería = carrocería;
    }

    

    public String getDivisión_deportiva() {
        return división_deportiva;
    }

    public void setDivisión_deportiva(String división_deportiva) {
        this.división_deportiva = división_deportiva;
    }

    public String getNombre_división() {
        return nombre_división;
    }

    public void setNombre_división(String nombre_división) {
        this.nombre_división = nombre_división;
    }

    public String getCarrocería() {
        return carrocería;
    }

    public void setCarrocería(String carrocería) {
        this.carrocería = carrocería;
    }

    @Override
    public String toString() {
        return "premium{" + "divisi\u00f3n_deportiva=" + división_deportiva + ", nombre_divisi\u00f3n=" + nombre_división + ", carrocer\u00eda=" + carrocería + '}';
    }

}
