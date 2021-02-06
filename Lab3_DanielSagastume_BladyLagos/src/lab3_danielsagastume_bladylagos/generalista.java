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
public class generalista extends marcas {
    
    private String marca;
     //Añade a la marca su tipo (low-cost o semi-premium)

    public generalista() {
        super();
    }

    public generalista(String marca, String nombre, String lema, int year_fundación, String year_integracion, String fundador, int ventas, String presidente, int modelos, ArrayList<lab3_danielsagastume_bladylagos.modelos> modelos_add) {
         super(nombre, lema, year_fundación, year_integracion, fundador, ventas, presidente, modelos, modelos_add);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "generalista{" + "marca=" + marca + '}';
    }   
    
}
