package domain;

         ///////////////////////////////// [OBSERVADOR] /////////////////////////////////

import java.util.Observable;

public class Producto implements Observador {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio, Inflacion inflacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.inflacion = inflacion;
        this.inflacion.registrarObservador(this::actualizar);
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }


    @Override
    public void actualizar(Observable o, Object arg) {

    }
}

