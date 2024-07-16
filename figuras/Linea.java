package figurasgeometricas.figuras;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;

public class Linea extends Figura {
    public Linea(Color color, Point puntoInicio, Point puntoFinal, int grosor) {
        super("Linea", color, puntoInicio, puntoFinal, grosor);
    }

     /*
    @Override
    public void pintar(Graphics g) {
        g.setColor(color);
        g.setStroke(new BasicStroke(grosor));
        g.drawLine(puntoInicio.x, puntoInicio.y, puntoFinal.x, puntoFinal.y);
    }
    */
    
}
