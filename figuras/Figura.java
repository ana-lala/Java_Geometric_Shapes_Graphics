package figurasgeometricas.figuras;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;

public abstract class Figura {
    protected String tipo;
    protected int grosor;
    protected Point puntoInicio;
    protected Point puntoFinal;
    protected Color color;

    public void Figura(String tipo, Color color, Point puntoInicio, Point puntoFinal, int grosor) {
        this.tipo = tipo;
        this.color = color;
        this.puntoInicio = puntoInicio;
        this.puntoFinal = puntoFinal;
        this.grosor = grosor;
    }

    public abstract void pintar(Graphics g);
}
