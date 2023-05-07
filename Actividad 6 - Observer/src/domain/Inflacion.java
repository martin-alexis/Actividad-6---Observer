package domain;

///////////////////////////////// [SUJETO] /////////////////////////////////

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Inflacion extends Observable {

    private double valorInflacion;
    private List<Observer> observadores;

    public Inflacion(double valorInicial) {
        this.valorInflacion = valorInicial;
        this.observadores = new ArrayList<>();
    }

    public void setValorInflacion(double nuevoValor) {
        this.valorInflacion = nuevoValor;
        this.setChanged();
        this.notifyObservers();
    }

    public double getValorInflacion() {
        return this.valorInflacion;
    }

    public void registrarObservador(Observer observador) {
        this.observadores.add(observador);
    }

    public void eliminarObservador(Observer observador) {
        this.observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.update(this, null);
        }
    }

    public void actualizarPrecios(double porcentajeAumento) {

    }
}

