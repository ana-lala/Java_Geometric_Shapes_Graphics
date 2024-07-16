package figurasgeometricas.evento;

import figurasgeometricas.guis.VentanaPrincipal;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class EscuchadorVentana extends WindowAdapter {
    private VentanaPrincipal ventana;

    public EscuchadorVentana(VentanaPrincipal ventana) {
        this.ventana = ventana;
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }
}
