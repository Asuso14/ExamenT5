package org.example.carrera_solidaria;

import java.util.ArrayList;

//Clase, de el organizador, que va a organizar y monitorizar los corredores.
public class Organizador {

    private final String NOMBRE = "IES MUTXAMEL";
    private String edicion;
    private ArrayList<Corredor> listaCorredores;

    //Constructor, que solo se ingresa el nombre ya que el nombre esta predefinido y lo otro es una lista que empezara vacia.
    public Organizador(String edicion){
        this.edicion = edicion;
        listaCorredores = new ArrayList<>(700);
    }

    //metodo para agregar un corredor a la lista.
    public void inscribir_corredor(Corredor corredor){
        listaCorredores.add(corredor);
    }

    //metodo para borrar un corredor de la lista.
    public void borrar_corredor(Corredor corredor){
        listaCorredores.remove(corredor);
    }

    //metodo que sirve para imprimir todos los corredores de la lista con el formnato idonéo.
    public void mostrarCorredores(){
        System.out.println("Corredores inscritos: " + listaCorredores.size());
        for (Corredor cor : listaCorredores){
            System.out.println("["+ cor.getDorsal() +"]. " + cor.getNombre());
        }
    }

    //Teniendo en cuenta las vueltas que ha dado el corredor, con el importe por vuelta. Multiplicamos y obtenemos el resultado
    public void calcularDonacion(Corredor corredor){
        System.out.println("El corredor" +
                corredor.getNombre() + "ha conseguido una donacion de " +
                corredor.getImporte_vuelta()*corredor.getNumero_vueltas() +
                " €");
    }

    //Getters, Setters y toString.
    public String getNOMBRE() {
        return NOMBRE;
    }

    public ArrayList<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public void setListaCorredores(ArrayList<Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "Organizador{" +
                "NOMBRE='" + NOMBRE + '\'' +
                ", edicion='" + edicion + '\'' +
                ", listaCorredores=" + listaCorredores +
                '}';
    }
}
