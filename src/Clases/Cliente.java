package Clases;

import java.io.*;
import java.util.*;

public class Cliente {

    private String nombre;
    private String numeroTelefono;
    private int numReservacion;

    public Cliente() {
        this.nombre = nombre;
        this.numReservacion = numReservacion;
    }
    
    public Cliente(String nombre, String numeroTelefono, int numReservacion) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.numReservacion = numReservacion;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return this.numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getNumReservacion() {
        return this.numReservacion;
    }

    public void setNumReservacion(int numReservacion) {
        this.numReservacion = numReservacion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", numeroTelefono=" + numeroTelefono + ", numReservacion=" + numReservacion + '}';
    }
    }

