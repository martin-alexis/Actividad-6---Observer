package domain;

import java.util.Observable;

public interface Observador {
    protected Inflacion inflacion;
    public void actualizar (Observable o, Object arg);

}
