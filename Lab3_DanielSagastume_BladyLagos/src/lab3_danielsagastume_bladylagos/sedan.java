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
public class sedan extends modelos {

    private String modelo;
    private Boolean android_play;
    private Boolean android_auto;

    ArrayList<String> asistentes = new ArrayList();
    //Añade a modelo, AndroidPlay (Si o no), AndroidAuto(Si o no) y una lista de Asistentes de Conducción.

    public sedan() {
        super();
    }

    public sedan(String modelo, Boolean android_play, Boolean android_auto, String nombre, int year_fabricación, String motor, String cilindrada, String tecnologías) {
        super(nombre, year_fabricación, motor, cilindrada, tecnologías);
        this.modelo = modelo;
        this.android_play = android_play;
        this.android_auto = android_auto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean getAndroid_play() {
        return android_play;
    }

    public void setAndroid_play(Boolean android_play) {
        this.android_play = android_play;
    }

    public Boolean getAndroid_auto() {
        return android_auto;
    }

    public void setAndroid_auto(Boolean android_auto) {
        this.android_auto = android_auto;
    }

    public ArrayList<String> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(ArrayList<String> asistentes) {
        this.asistentes = asistentes;
    }


    @Override
    public String toString() {
        return "sedan{" + "modelo=" + modelo + ", android_play=" + android_play + ", android_auto=" + android_auto + ", asistentes=" + asistentes + '}';
    }

}
