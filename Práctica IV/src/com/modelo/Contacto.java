package com.modelo;

import java.io.Serializable;

public class Contacto implements Serializable {
    private String nombre;
    private int numero;

    public Contacto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
