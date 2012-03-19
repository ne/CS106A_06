/*
 * File: NameSurfer.java
 * ---------------------
 * This program implements the viewer for a baby-name database.
 * Author: Nicolas Echavarria
 */

import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

// Commented to generate Milestone 1
// public class NameSurfer extends Program implements NameSurferConstants {
   public class NameSurfer extends ConsoleProgram implements NameSurferConstants {

    
/* Method: init() */
/**
 * This method has the responsibility for reading in the data base
 * and initializing the interactors at the bottom of the window.
 */
	public void init() {
	    nameField = new JTextField(MAX_NAME);
        nameField.putClientProperty("JTextField.variant","search");
        nameField.setToolTipText("Insert here the name you would like to search for.");
        nameField.setActionCommand("Graph");
        nameField.addActionListener(this);
        name = new JLabel("Name:");
        graphButton = new JButton("Graph");
        clearButton = new JButton("Clear");
        add(name, SOUTH);
        add(nameField, SOUTH);
        add(graphButton, SOUTH);
        add(clearButton, SOUTH);
        addActionListeners();
	}

/* Method: actionPerformed(e) */
/**
 * This class is responsible for detecting when the buttons are
 * clicked, so you will have to define a method to respond to
 * button actions.
 */
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
        if (cmd.equals("Clear")) {
            println("Clear");
        } else if (cmd.equals("Graph")) {
            println("Graph:" + nameField.getText());
        }
	}
    
  /* Private constants */
    private static final int MAX_NAME = 30;
    
  /* Private instance variables */
    private JLabel name;
    private JTextField nameField;
    private JButton clearButton;
    private JButton graphButton;
}
