import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ShipControl extends JFrame implements ActionListener{

    // Controles graficos de la IU
	private JPanel panel;
	private JButton startButton;
    private JLabel label;
    private JTextArea text;

    // Constructor
    public ShipControl() {

        startMision();

    }

    public void startMision(){

        // Configurar el titulo y el tamano de la ventana
		setTitle("Ship Control Interface");
		setSize(1000, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Crear componentes de la interfaz grafica
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
        panel.setPreferredSize(new Dimension(600, 250));
        startButton = new JButton("Start");
        startButton.setBackground(Color.BLUE);
        text = new JTextArea();
		text.setBackground(Color.WHITE);
        label = new JLabel("Status");
        label.setBackground(Color.RED);

        // Configuración de la GUI
        panel.setLayout(new BorderLayout());
		panel.add(startButton, BorderLayout.NORTH);
        panel.add(label, BorderLayout.CENTER);
		panel.add(text, BorderLayout.SOUTH);

        
        // Agregar el panel al contenido del JFrame
        add(panel);

        startButton.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
                // Lógica para manejar el evento de clic del botón startButton
                if (e.getSource() == startButton) {
                    // Crear instancia de la clase SpaceShip
                    SpaceShip spaceShip = new SpaceShip();
                    spaceShip.fly();
                }
            }
        });

        // Mostrar la interfaz gráfica
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void main(String[] args) {
		// Crear y mostrar la interfaz gr�fica en el hilo de eventos de Swing
		SwingUtilities.invokeLater(() -> {
			new ShipControl();
		});
	}

   
}