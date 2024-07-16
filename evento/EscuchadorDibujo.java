package figurasgeometricas.evento;

import figurasgeometricas.guis.DibujoPanel;
import figurasgeometricas.guis.MenuPanel;
import figurasgeometricas.figuras.Figura;
import figurasgeometricas.guis.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Point;

public class EscuchadorDibujo implements ActionListener, MouseListener {
    private VentanaPrincipal ventanaPrincipal;
    private DibujoPanel dibujoPanel;
    private MenuPanel menuPanel;
    private Point puntoInicio;

    public EscuchadorDibujo(VentanaPrincipal ventanaPrincipal, DibujoPanel dibujoPanel, MenuPanel menuPanel) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.dibujoPanel = dibujoPanel;
        this.menuPanel = menuPanel;
        puntoInicio = null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Manejar eventos de los botones del menú si es necesario.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Detectar clic del ratón si es necesario.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Capturar el punto de inicio cuando el usuario presiona el botón del ratón.
        puntoInicio = e.getPoint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (puntoInicio != null) {
            // Capturar el punto final cuando el usuario suelta el botón del ratón.
            Point puntoFinal = e.getPoint();
            Figura nuevaFigura = menuPanel.crearFigura(puntoInicio, puntoFinal);
            dibujoPanel.agregarFigura(nuevaFigura);
            ventanaPrincipal.repaint(); // Repintar la ventana principal para reflejar los cambios.
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Implementar si es necesario.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Implementar si es necesario.
    }
}
