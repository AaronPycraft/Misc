//Aaron Pycraft
//5-19-2014
//JAVA book,page 664 exercise 17.1
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;

public class GUI_TEXT_Formatting extends JFrame {
//Data fields
	ButtonListener listener = new ButtonListener();
	
//Methods
	public void ColorChange_Red() {
	jtxtText.setBackground(new Color(255,0,0));
	}
	public void ColorChange_Yellow() {
	jtxtText.setBackground(new Color(255,0,0));
	}
	public void ColorChange_White() {
	jtxtText.setBackground(new Color(255,0,0));
	}
	public void ColorChange_Gray() {
	jtxtText.setBackground(new Color(255,0,0));
	}
	public void ColorChange_Green() {
	jtxtText.setBackground(new Color(255,0,0));
	}
	
//Constructors
	public GUI_TEXT_Formatting() {
	//create radio buttons
	JPanel jpRadioButtons = new JPanel();
	jpRadioButtons.setLayout(new GridLayout(1,5));
	jpRadioButtons.setBorder(BorderFactory.createEtchedBorder());
	JRadioButton jbtRed = new JRadioButton("Red");
	JRadioButton jbtYellow = new JRadioButton("Yellow");
	JRadioButton jbtWhite = new JRadioButton("White");
	JRadioButton jbtGray = new JRadioButton("Gray");
	JRadioButton jbtGreen = new JRadioButton("Green");
	
	jbtRed.addActionListener(listener);
	jbtYellow.addActionListener(listener);
	jbtWhite.addActionListener(listener);
	jbtGray.addActionListener(listener);
	jbtGreen.addActionListener(listener);
	
	jpRadioButtons.add(jbtRed);
	jpRadioButtons.add(jbtYellow);
	jpRadioButtons.add(jbtWhite);
	jpRadioButtons.add(jbtGray);
	jpRadioButtons.add(jbtGreen);
	
	ButtonGroup radioButtonGroup = new ButtonGroup();
	radioButtonGroup.add(jbtRed);
	radioButtonGroup.add(jbtYellow);
	radioButtonGroup.add(jbtWhite);
	radioButtonGroup.add(jbtGray);
	radioButtonGroup.add(jbtGreen);
	
	add(jpRadioButtons,BorderLayout.NORTH);
	
	//create text field
	JTextField jtxtText = new JTextField("Hello");
	add(jtxtText,BorderLayout.CENTER);

	//create buttons
	JPanel jpLRButtons = new JPanel();
	jpLRButtons.setLayout(new GridLayout(1,4));
	JButton jbtLeft = new JButton("<=");
	JButton jbtRight = new JButton("=>");
	jbtLeft.addActionListener(listener);
	jbtRight.addActionListener(listener);
	jbtRight.setSize(new Dimension(50,50));
	jbtLeft.setSize(new Dimension(50,50));
	jpLRButtons.add(jbtLeft);
	jpLRButtons.add(jbtRight);
	add(jpLRButtons,BorderLayout.SOUTH);
	}//end default constructor

//Main
	public static void main(String[] args) {
	//create frame
	GUI_TEXT_Formatting frame = new GUI_TEXT_Formatting();
	frame.setTitle("Formatting a line of text...");
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setSize(new Dimension(400,200));
	frame.pack();
	}//end main

//listener class
	public class ButtonListener implements ActionListener {
	
		public void actionPerformed(ActionEvent e) {
		if(e.getSource==jbtRed)
			ColorChange_Red();
		
		}//end actionPerformed method
	}//end ButtonListener class
	
	}//end GUI_TEXT_Formatting class
