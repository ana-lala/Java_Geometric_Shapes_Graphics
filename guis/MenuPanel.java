package figurasgeometricas.guis;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import figurasgeometricas.figuras.Figura;
import figurasgeometricas.figuras.Linea;
import figurasgeometricas.figuras.Ovalo;
import figurasgeometricas.figuras.Rectangulo;

//CORREGIR QUEREMOS QUE SEA UN ARREGLO DE FIGURAS

public class MenuPanel extends JPanel {
    private JRadioButton rectanguloButton;
    private JRadioButton ovaloButton;
    private JRadioButton lineaButton;
    private JComboBox<String> colorComboBox;
    private JSpinner grosorSpinner;

    public MenuPanel() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBorder(BorderFactory.createTitledBorder("Menu"));

        rectanguloButton = new JRadioButton("Rectangulo");
        ovaloButton = new JRadioButton("Ovalo");
        lineaButton = new JRadioButton("Linea");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rectanguloButton);
        buttonGroup.add(ovaloButton);
        buttonGroup.add(lineaButton);
        lineaButton.setSelected(true);

        colorComboBox = new JComboBox<>(new String[]{"Rojo", "Verde", "Azul", "Amarillo", "Negro", "Blanco"});

        grosorSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 50, 1));

        add(rectanguloButton);
        add(ovaloButton);
        add(lineaButton);
        add(colorComboBox);
        add(grosorSpinner);
    }

    public Figura crearFigura(Point puntoInicio, Point puntoFinal) {
        String figuraSeleccionada = "";
        if (rectanguloButton.isSelected()) {
            figuraSeleccionada = "Rectangulo";
        } else if (ovaloButton.isSelected()) {
            figuraSeleccionada = "Ovalo";
        } else if (lineaButton.isSelected()) {
            figuraSeleccionada = "Linea";
        }
    
        Color color = obtenerColorSeleccionado();
        int grosor = (int) grosorSpinner.getValue();
    
        Figura figura = null;
        if (figuraSeleccionada.equals("Rectangulo")) {
            figura = new Rectangulo(color, puntoInicio, puntoFinal, grosor);
        } else if (figuraSeleccionada.equals("Ovalo")) {
            figura = new Ovalo(color, puntoInicio, puntoFinal, grosor);
        } else if (figuraSeleccionada.equals("Linea")) {
            figura = new Linea(color, puntoInicio, puntoFinal, grosor);
        }
    
        return figura;
    }
    

    private Color obtenerColorSeleccionado() {
        String colorSeleccionado = (String) colorComboBox.getSelectedItem();
        switch (colorSeleccionado) {
            case "Rojo":
                return Color.RED;
            case "Verde":
                return Color.GREEN;
            case "Azul":
                return Color.BLUE;
            case "Amarillo":
                return Color.YELLOW;
            case "Negro":
                return Color.BLACK;
            case "Blanco":
                return Color.WHITE;
            default:
                return Color.BLACK;
        }
    }
}
