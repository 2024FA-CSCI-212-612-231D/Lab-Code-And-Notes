package labsolutions.lab16;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonRow extends JFrame implements ActionListener {
	
	private JButton[] buttons;
	
	public ButtonRow(int numButtons) {
		setSize(100 * numButtons, 100);
		setVisible(true);
		setLayout(new GridLayout(1, numButtons));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		buttons = new JButton[numButtons];
		
		for(int i = 0; i < numButtons; i++) {
			JButton button = new JButton();
			
			// This line registers the current instance 
			// (this, which refers to the ButtonRow object) 
			// as an ActionListener for the button
			button.addActionListener(this);
			
			// Setting an action command allows each button 
			// to carry a unique identifier (its index) as a String
			// Later, in actionPerformed, we retrieve this action 
			// command to identify which button was clicked
			button.setActionCommand("" + i); // This is a quick way to turn an integer into a string by concatenating it with an empty string
			
			buttons[i] = button;
			
			// add(button) adds the button to the JFrame (or ButtonRow window)
			add(button);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int num = Integer.parseInt(e.getActionCommand());
		buttons[num].setBackground(new Color((float) Math.random(), (float) Math.random(), (float) Math.random()));
	}

	public static void main(String[] args) {
		String numButtons = JOptionPane.showInputDialog("How many buttons?");
		new ButtonRow(Integer.parseInt(numButtons));
	}

}
