package org.example.carrera_solidaria;

import java.util.ArrayList;
import java.util.Arrays;

//Clase corredor, que tiene todos los atributos que necesita cada corredor.
public class Corredor {

    private String nombre;
    static int numDorsal;
    private int dorsal;
    private ArrayList<String> listaPatrocinadores;
    private double importe_vuelta;
    private int Numero_vueltas;

    //Constructor con solo el nomnre, en el que el importe por vuelta es el default.
    public Corredor(String nombre){
        this.nombre = nombre;
        this.dorsal = generateDorsal();
        listaPatrocinadores = new ArrayList<>();
        this.importe_vuelta = 0.5;
        Numero_vueltas = 0;
    }

    //Contructor con el nombre y el importe por vuelta, no se pone el default sino que se pone el que se indica en el programa.
    public Corredor(String nombre, double importe_vuelta){
        this.nombre = nombre;
        this.dorsal = generateDorsal();
        listaPatrocinadores = new ArrayList<>();
        this.importe_vuelta = importe_vuelta;
        Numero_vueltas = 0;
    }

    //Genera un Array, que no esta predefinido para que se puedan ingresar tantos parametros como se quiera.
    public <patrocinador> void insertarPatrocinador(String... patrocinador){
        listaPatrocinadores.add(Arrays.toString(patrocinador));
    }

    //Con una variable static, que ira cambiando el valor. Definimos el número del dorsal.
    private int generateDorsal(){
        ++numDorsal;
        return this.dorsal = numDorsal;
    }

    //Getters, Setters y toString.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public ArrayList<String> getListaPatrocinadores() {
        return listaPatrocinadores;
    }

    public void setListaPatrocinadores(ArrayList<String> listaPatrocinadores) {
        this.listaPatrocinadores = listaPatrocinadores;
    }

    public double getImporte_vuelta() {
        return importe_vuelta;
    }

    public void setImporte_vuelta(double importe_vuelta) {
        this.importe_vuelta = importe_vuelta;
    }

    public int getNumero_vueltas() {
        return Numero_vueltas;
    }

    public void setNumero_vueltas(int vueltas_completadas) {
        this.Numero_vueltas = vueltas_completadas;
    }

    @Override
    public String toString() {
        return "Corredor{" +
                "nombre='" + nombre + '\'' +
                ", dorsal=" + dorsal +
                ", listaPatrocinadores=" + listaPatrocinadores +
                ", importe_vuelta=" + importe_vuelta +
                ", vueltas_completadas=" + Numero_vueltas +
                '}';
    }
}
