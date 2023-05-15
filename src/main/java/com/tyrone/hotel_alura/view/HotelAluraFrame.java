import javax.swing.*;
import net.miginfocom.swing.MigLayout;
import java.awt.*;

public class HotelAluraFrame extends JFrame {

	private JPanel panel = new JPanel(new MigLayout("fill", "[70%][30%]", "[100%][100%]"));

	public HotelAluraFrame() {
		setTitle("Ejemplo de imagen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel.setBackground(Color.blue);

		// Panel izquierdo (imagen)
		ImageIcon imagenIzquierda = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/menu-img.png"));
		JLabel labelIzquierda = new JLabel(imagenIzquierda);
		panel.add(labelIzquierda, "cell 0 0, spany 2");

		// Panel derecho
		ImageIcon imagenSuperiorDerecha = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/aH-150px.png"));
		JLabel labelSuperiorDerecha = new JLabel(imagenSuperiorDerecha);
		panel.add(labelSuperiorDerecha, "cell 1 0");

		ImageIcon imagenCentralDerecha = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/login.png"));
		JLabel labelCentralDerecha = new JLabel(imagenCentralDerecha);
		panel.add(labelCentralDerecha, "cell 1 1");

		ImageIcon imagenInferiorDerecha = new ImageIcon(HotelAluraFrame.class.getResource("/imagenes/cerrar-sesion 32-px.png"));
		JLabel labelInferiorDerecha = new JLabel(imagenInferiorDerecha);
		panel.add(labelInferiorDerecha, "cell 1 1, aligny bottom");

		// Panel inferior derecho
		JPanel footer = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel copyRigt = new JLabel("Desarrollado por Tyrone Pilay en © 2023");
		copyRigt.setForeground(Color.white);
		footer.add(copyRigt);
		footer.setBackground(Color.DARK_GRAY);
		panel.add(footer, "cell 0 2 2 1, growx");

		add(panel);
		setSize(910, 537);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
