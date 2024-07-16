package figurasgeometricas.figuras;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;

public class Rectangulo extends Figura {
    public Rectangulo(Color color, Point puntoInicio, Point puntoFinal, int grosor) {
        super("Rectangulo", color, puntoInicio, puntoFinal, grosor);
    }

    @Override
    public void pintar(Graphics g) {
        g.setColor(color);
        g.setStroke(new BasicStroke(grosor));
        int x = Math.min(puntoInicio.x, puntoFinal.x);
        int y = Math.min(puntoInicio.y, puntoFinal.y);
        int width = Math.abs(puntoInicio.x - puntoFinal.x);
        int height = Math.abs(puntoInicio.y - puntoFinal.y);
        g.drawRect(x, y, width, height);
    }
}
