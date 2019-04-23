package SensitiveKeyboard;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SensitiveKeyboard implements ActionListener {

	JButton button = new JButton();


	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	public void run() {


frame.add(panel);

frame.setVisible(true);

button.setText("Click me!");


button.addActionListener(this);

panel.add(button);


frame.pack();
frame.setTitle("Sensitive Keyboard");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		
		if(buttonPressed.equals(button)) {
	JOptionPane.showMessageDialog(null,"OUCH!");
			
		}


	
	}
}


