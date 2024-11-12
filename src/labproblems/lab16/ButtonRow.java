package labproblems.lab16;

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
			/* TODO Make each button in the row work like the 
			 * 		example ColorButton.java (clicking a button 
			 * 		changes the color of that button only)
			 */	
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int num = Integer.parseInt(e.getActionCommand());
		buttons[num].setBackground(new Color((float) Math.random(), (float) Math.random(), (float) Math.random()));
	}

	public static void main(String[] args) {
	/* TODO: 	Look up the JOptionPane method showInputDialog.
				Using showInputDialog, ask the user how many buttons 
				they would like and create a row with that many buttons.
				
				Note: You'll need to convert a String to an int in order
				to pass the return value from showInputDialog to your 
				ButtonRow constructor
	*/
	}
}
