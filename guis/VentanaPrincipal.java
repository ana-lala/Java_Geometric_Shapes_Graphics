package figurasgeometricas.guis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import figurasgeometricas.evento.EscuchadorAccion;

public class VentanaPrincipal extends JFrame {
    private JMenuBar menuBar;
    private JMenu archivoMenu;
    private JMenuItem abrirMenuItem, cerrarMenuItem, salirMenuItem;
    private MenuPanel menuPanel;
    private DibujoPanel dibujoPanel;
    private EscuchadorAccion escuchadorAccion;

    public VentanaPrincipal() {
        setTitle("Dibujo de Ana Chenoweth");
        setSize(800, 600);
        setResizable(false);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);

        //escuchadorAccion = new EscuchadorAccion(this);

        //ponerMenu();

        menuPanel = new MenuPanel();
        dibujoPanel = new DibujoPanel();

        add(menuPanel, BorderLayout.WEST);
        add(dibujoPanel, BorderLayout.CENTER);
    }

    public void ponerMenu() {
        menuBar = new JMenuBar();
        archivoMenu = new JMenu("Archivo");

        abrirMenuItem = new JMenuItem("Abrir");
        abrirMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Agrega aquí la lógica para abrir un archivo
                JFileChooser ven1 = new JFileChooser();
                ven1.showOpenDialog(null);
            }
        });

        cerrarMenuItem = new JMenuItem("Cerrar");
        cerrarMenuItem.addActionListener(escuchadorAccion);

        salirMenuItem = new JMenuItem("Salir");
        salirMenuItem.addActionListener(escuchadorAccion);

        archivoMenu.add(abrirMenuItem);
        archivoMenu.add(cerrarMenuItem);
        archivoMenu.addSeparator();
        archivoMenu.add(salirMenuItem);

        menuBar.add(archivoMenu);
        setJMenuBar(menuBar);
    }
}
