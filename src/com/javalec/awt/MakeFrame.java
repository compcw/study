package com.javalec.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MakeFrame extends Frame implements ActionListener {
	private List list;
	private Panel panel;
	private TextField textfield;
	private Button okbtn;
	private Button exitbtn;
	
	public MakeFrame() {
		list = new List();
		panel = new Panel();
		textfield = new TextField(20);
		okbtn = new Button("OK");
		exitbtn = new Button("EXIT");
		
		setLayout(new BorderLayout());
		add(panel, BorderLayout.NORTH);
		add(list, BorderLayout.CENTER);
		
		panel.add(new Label("Write"));
		panel.add(textfield);
		panel.add(okbtn);
		panel.add(exitbtn);
		
		okbtn.addActionListener(this);
		exitbtn.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				dispose();
				System.exit(0);
			}			
		});
		
	}
	
   @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	   if(e.getSource() == okbtn) {
		   list.add(textfield.getText());
	   } else if(e.getSource() == exitbtn) {
		   setVisible(false);
		   dispose();
		   System.exit(0);
	   }
	}
	
}
