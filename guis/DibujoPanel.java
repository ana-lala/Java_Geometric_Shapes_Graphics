package figurasgeometricas.guis;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import figurasgeometricas.figuras.Figura;


public class DibujoPanel extends JPanel {
    private ArrayList<Figura> listaDeFiguras;

    public DibujoPanel() {
        setLayout(new FlowLayout());
        setBorder(BorderFactory.createTitledBorder("Dibujo"));
        listaDeFiguras = new ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        listaDeFiguras.add(figura);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Figura figura : listaDeFiguras) {
            figura.pintar(g);
        }
    }
}
