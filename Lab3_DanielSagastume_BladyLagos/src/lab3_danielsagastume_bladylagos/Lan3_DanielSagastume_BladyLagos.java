package lab3_danielsagastume_bladylagos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lan3_DanielSagastume_BladyLagos {

    public static void main(String[] args) {
        ArrayList coorporaciones = new ArrayList();
        int op = 0;
        while (op != 5) {
            op = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar:\n"
                    + "2. Modificar(No terminada :c) \n"
                    + "3. Eliminar \n"
                    + "4. Reporte\n"
                    + "5. Salir"));
            switch (op) {
                case 1:
                    int op2 = Integer.parseInt(JOptionPane.showInputDialog("Agregar coorporacion\n"
                            + "2. Agregar marca"
                            + "3. Agregar Modelos\n"
                            + "4. Agregar Fábricas\n"
                            + "5. Agregar Divisiones tecnológicas\n"
                            + "6. regresar "));
                    switch (op2) {
                        case 1:
                            ArrayList<marcas> marcas = new ArrayList();
                            ArrayList<fabricas> fabricas = new ArrayList();
                            ArrayList<tecnologicas> divisiones = new ArrayList();
                            String nombre = JOptionPane.showInputDialog("IUngrese el nombre de la cooporacion: ");
                            String sede = JOptionPane.showInputDialog("Ingrese la sede de coorporacion: ");
                            int año_cor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fundacion: "));
                            String CEO = JOptionPane.showInputDialog("Ingrese el CEO o presidente: ");
                            int empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados: "));
                            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de autos fabricados: "));
                            coorporaciones.add(new corporaciones(marcas, divisiones, fabricas, nombre, sede, año_cor, CEO, empleados, cantidad));
                            break;
                        case 2:
                            ArrayList<modelos> modelos1 = new ArrayList();
                            String salida = "";//Para que el usuario vea las posiciones
                            for (Object t : coorporaciones) {
                                if (t instanceof corporaciones) {
                                    salida += coorporaciones.indexOf(t) + "- " + t + "\n";
                                }
                            }
                            int p = Integer.parseInt(JOptionPane.showInputDialog(salida + "\n"
                                    + "Ingrese la posicion de coorporacion que quiere agregar marca: "));
                            if (coorporaciones.get(p) instanceof corporaciones) {
                                //Marca
                                ArrayList<marcas> marca = new ArrayList();
                                String nom_marca = JOptionPane.showInputDialog("Ingrese el nombre de la marca");
                                String lema = JOptionPane.showInputDialog("Ingrese el slogan o lema de la marca: ");
                                int año_marca = Integer.parseInt(JOptionPane.showInputDialog("Ingrese  el año de fundacion de la marca: "));
                                String integracion = JOptionPane.showInputDialog("Ingrese el año que se integro a la coorporacion: ");
                                String fundador = JOptionPane.showInputDialog("Ingrese el fundador de la marca: ");
                                int ventas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ventas anuales: "));
                                String presidente = JOptionPane.showInputDialog("Ingrese el CEO o presidente: ");
                                int num_modelos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de modelos de la marca: "));
                                int opp = Integer.parseInt(JOptionPane.showInputDialog("1. Marca premiun\n"
                                        + "2. Marca generalista"));
                                if (opp == 1) {//Premiun
                                    String nom_div = JOptionPane.showInputDialog("Ingrese el nombre de la division deportiva: ");
                                    String nom_divdepor = JOptionPane.showInputDialog("Ingrese la division deportiva ");
                                    String carroceria = JOptionPane.showInputDialog("Ingrese la carroceria mas vendidad ");
                                    premium pe = new premium(nom_div, nom_divdepor, nom_marca, carroceria, lema, año_marca, integracion, fundador, ventas, presidente, num_modelos, modelos1);
                                    marca.add(pe);
                                    ((corporaciones) coorporaciones.get(p)).setMarca(marca);
                                } else if (opp == 2) {//Generalista
                                    boolean marca_gen;
                                    int op_gen = Integer.parseInt(JOptionPane.showInputDialog("1. low-cost\n"
                                            + "2. semi-premiun"));
                                    if (op_gen == 1) {
                                        marca_gen = true;
                                    } else if (op_gen == 2) {
                                        marca_gen = false;
                                    }
                                    generalista g = new generalista();
                                    marca.add(g);
                                    ((corporaciones) coorporaciones.get(p)).setMarca(marca);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "No existe esa coorporacion");
                            }
                            break;
                        case 3:

                            ArrayList<String> teconologias = new ArrayList();
                            String salida2 = "";//Para que el usuario vea las posiciones
                            for (Object t : coorporaciones) {
                                if (t instanceof corporaciones) {
                                    salida2 += coorporaciones.indexOf(t) + "- " + t + "\n";
                                }
                            }
                            int p2 = Integer.parseInt(JOptionPane.showInputDialog(salida2 + "\n"
                                    + "Ingrese la posicion de coorporacion que quiere agregar marca: "));
                            if (coorporaciones.get(p2) instanceof corporaciones) {
                                String salida3 = "";//Para que el usuario vea las posiciones
                                for (Object t : coorporaciones) {
                                    if (t instanceof corporaciones) {
                                        salida2 += coorporaciones.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                int p4 = Integer.parseInt(JOptionPane.showInputDialog(salida3 + "\n"
                                        + "Ingrese la posicion de coorporacion que quiere agregar marca: "));
                                //Pregunta
                                String nom_modelo = JOptionPane.showInputDialog("Ingrese el nombre del modelo: ");
                                int year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fabricacion: "));
                                String motor = JOptionPane.showInputDialog("Ingrese tipo del moto: ");
                                String cilindridad = JOptionPane.showInputDialog("Ingrese cilindridad del motor: ");
                                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio: "));
                                String tecnologia = JOptionPane.showInputDialog("Ingrese tecnologias: ");
                                int op_m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que tipo de carroceria\n"
                                        + "1. Hatchback\n"
                                        + "2. Sedan\n"
                                        + "3. SUV"));
                                if (op_m == 1) {//Hatchback
                                    ArrayList<modelos> modelos = new ArrayList();
                                    int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del maletero: "));
                                    int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud: "));
                                    int capacidad_bolsas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de bolsas de aire: "));
                                    hatchback h = new hatchback(capacidad, longitud, capacidad_bolsas, nom_modelo, year, motor, cilindridad, tecnologia);
                                    ((corporaciones) coorporaciones.get(p2)).getMarca().get(p4).getModelos_add().add(h);
                                } else if (op_m == 2) {//SEDAN
                                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo: ");
                                    boolean andoid_p = false;
                                    int android_play = Integer.parseInt(JOptionPane.showInputDialog("El auto tiene andoidPlay: \n"
                                            + "1. si\n"
                                            + "2. no\n"));
                                    if (android_play == 1) {
                                        andoid_p = true;
                                    } else if (android_play == 2) {
                                        andoid_p = false;
                                    }
                                    boolean android_a = false;
                                    int android_auto = Integer.parseInt(JOptionPane.showInputDialog("El auto tiene AndroidAuto: \n"
                                            + "1. si\n"
                                            + "2. no\n"));
                                    if (android_auto == 1) {
                                        android_a = true;
                                    } else if (android_auto == 2) {
                                        android_a = false;
                                    }
                                    char resp = 's';
                                    while (resp == 's' || resp == 'S') {
                                        String tech = JOptionPane.showInputDialog("Ingrese la tecnologia: ");
                                        teconologias.add(tech);
                                        String respp = JOptionPane.showInputDialog("Desea agregar otra tecnologia(s/n): ");
                                        resp = respp.charAt(0);
                                    }
                                    sedan s = new sedan(modelo, andoid_p, android_a, nom_modelo, year, motor, cilindridad, tecnologia);
                                    coorporaciones.add(s);
                                    ((corporaciones) coorporaciones.get(p2)).getMarca().get(p4).getModelos_add().add(s);
                                } else if (op_m == 3) {
                                    ArrayList<modelos> modelos = new ArrayList();
                                    boolean todo_tereno = false;
                                    int todo = Integer.parseInt(JOptionPane.showInputDialog("El auto tiene 4x4: \n"
                                            + "1. si\n"
                                            + "2. no\n"));
                                    if (todo == 1) {
                                        todo_tereno = true;
                                    } else if (todo == 2) {
                                        todo_tereno = false;
                                    }
                                    int max = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el maximo de pasahjeros: "));
                                    String nom_nav = JOptionPane.showInputDialog("Ingrese el nombre del navegador: ");
                                    SUV s = new SUV(todo_tereno, max, nom_nav, nom_modelo, year, motor, cilindridad, tecnologia);
                                    ((corporaciones) coorporaciones.get(p2)).getMarca().get(p4).getModelos_add().add(s);
                                }
                            }
                            break;
                        case 4:
                            String salida4 = "";
                            for (Object t : coorporaciones) {
                                if (t instanceof corporaciones) {
                                    salida4 += coorporaciones.indexOf(t) + "- " + t + "\n";
                                }
                            }
                            int p4 = Integer.parseInt(JOptionPane.showInputDialog(salida4 + "\n"
                                    + "Ingrese la posicion de coorporacion que quiere agregar la fabrica: "));
                            if (coorporaciones.get(p4) instanceof corporaciones) {
                                String nom_fab = JOptionPane.showInputDialog("Ingrese el nombre de la fabrica ");
                                String ubicación = JOptionPane.showInputDialog("Ingrese la ubicacion de la fabrica: ");;
                                int cantidadMaxima = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad maxima de modelos: "));//máxima de modelos que se pueden fabricar
                                String carroceriaTop = JOptionPane.showInputDialog("Ingrese la carroceria mas vendida");
                                int empleados_max = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados: "));//máxima de modelos que se pueden fabricar
                                String nombreMarca = (JOptionPane.showInputDialog("Ingrese la marca que opera "));//máxima de modelos que se pueden fabricar;//nombre de las marcas que ensamblan en dicha fábrica
                                int cantidad_autos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de autos que fabrican: "));//máxima de modelos que se pueden fabricar
                                fabricas f = new fabricas(nom_fab, ubicación, cantidadMaxima, carroceriaTop, empleados_max, nombreMarca, cantidad_autos);
                                ((corporaciones) coorporaciones.get(p4)).getFabricas().add(f);
                            }
                            break;
                        case 5:
                            String salida5 = "";
                            for (Object t : coorporaciones) {
                                if (t instanceof corporaciones) {
                                    salida5 += coorporaciones.indexOf(t) + "- " + t + "\n";
                                }
                            }
                            int p5 = Integer.parseInt(JOptionPane.showInputDialog(salida5 + "\n"
                                    + "Ingrese la posicion de coorporacion que quiere agregar la division: "));
                            if (coorporaciones.get(p5) instanceof corporaciones) {
                                String nombre_tec = JOptionPane.showInputDialog("Ingrese el nombre de la division: ");
                                int yearcreacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese rl año de creacion: "));;
                                String campo = JOptionPane.showInputDialog("Ingrese el campo al que se dedican: ");
                                String tecnologias = JOptionPane.showInputDialog("Ingrese tecnologias ya creada: ");
                                tecnologicas t = new tecnologicas(nombre_tec, yearcreacion, campo, tecnologias);
                                ((corporaciones) coorporaciones.get(p5)).getDivisiones().add(t);
                            }
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3://eliminar
                    String salida5 = "";
                    for (Object t : coorporaciones) {
                        if (t instanceof corporaciones) {
                            salida5 += coorporaciones.indexOf(t) + "- " + t + "\n";
                        }
                    }
                    int p5 = Integer.parseInt(JOptionPane.showInputDialog(salida5 + "\n"
                            + "Ingrese la posicion de coorporacion que quiere eliminar: "));
                    if (coorporaciones.get(p5) instanceof corporaciones) {
                        coorporaciones.remove(p5);
                    }
                    break;
                case 4://Reporte
                    String salida = "";
                    for (Object t : coorporaciones) {
                        if (t instanceof corporaciones) {
                            salida += coorporaciones.indexOf(t) + "- " + t + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, salida);
                    break;
            }//Fin switch Agregar corp, modidifcar, eliminar
        }//Fin menu PRINCIPAL
    }//Fin del main  
}//Fin clase
