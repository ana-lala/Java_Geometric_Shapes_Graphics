package figurasgeometricas;

import figurasgeometricas.evento.EscuchadorDibujo;
import figurasgeometricas.evento.EscuchadorVentana;
import figurasgeometricas.guis.DibujoPanel;
import figurasgeometricas.guis.MenuPanel;
import figurasgeometricas.guis.VentanaPrincipal;

public class Principal {
    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        MenuPanel menuPanel = new MenuPanel();
        DibujoPanel dibujoPanel = new DibujoPanel();

        ventana.add(menuPanel);
        ventana.add(dibujoPanel);

        EscuchadorVentana escuchadorVentana = new EscuchadorVentana(ventana);
        ventana.addWindowListener(escuchadorVentana);

        EscuchadorDibujo escuchadorDibujo = new EscuchadorDibujo(ventana, dibujoPanel, menuPanel);
        dibujoPanel.addMouseListener(escuchadorDibujo);

        ventana.setVisible(true);
    }
}
