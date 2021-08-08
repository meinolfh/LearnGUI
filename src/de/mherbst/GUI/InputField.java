package de.mherbst.GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class InputField extends JTextField {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InputField(int cols) {
		super(cols);
		setFont(new Font("Serif", Font.PLAIN, 16));
		setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
	}

	
	
}
