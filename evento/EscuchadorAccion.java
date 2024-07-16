package figurasgeometricas.evento;

import figurasgeometricas.guis.VentanaPrincipal;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;

public class EscuchadorAccion implements ActionListener{
	private VentanaPrincipal ventana;

	public EscuchadorAccion(VentanaPrincipal ventana){
		this.ventana = ventana;
	}

	public void actionPerformed(ActionEvent e){
		int opcionUsuario = JOptionPane.showConfirmDialog(ventana, "Salir!", "", 
			JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(opcionUsuario==JOptionPane.YES_OPTION){

			ventana.dispose(); //liberar recursos
		}else if(opcionUsuario==JOptionPane.NO_OPTION){
			JOptionPane.showMessageDialog(ventana, "Entendido!", "Cancelando", JOptionPane.INFORMATION_MESSAGE);
		}else{ }
	}
}