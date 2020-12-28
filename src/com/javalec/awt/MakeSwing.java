package com.javalec.awt;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MakeSwing extends JFrame implements ActionListener{
	
	JPanel jPanel = null;
	JLabel jLabel = null;
	JButton jButton = null;
	JTextField jTextField = null;
	JComboBox jComboBox = null;
	JCheckBox jCheckBox = null;
	JLabel jLabelBlank = null;
	JButton jButtonExit = null;
	
	String[] items = {"1¹ø", "2¹ø", "3¹ø"};
	
	public MakeSwing() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jPanel = (JPanel)getContentPane();
		jPanel.setLayout(new FlowLayout());
		jLabel = new JLabel("Label");
		jButton = new JButton("Button");
		jTextField = new JTextField(20);
		jComboBox = new JComboBox<String>(items);
		jCheckBox = new JCheckBox("CheckBox");
		jLabelBlank = new JLabel();
		jButtonExit = new JButton("EXIT");
		
		jPanel.add(jLabel);
		jPanel.add(jButton);
		jPanel.add(jTextField);
		jPanel.add(jComboBox);
		jPanel.add(jCheckBox);
		jPanel.add(jLabelBlank);
		jPanel.add(jButtonExit);
		
		jLabel.setPreferredSize(new Dimension(50, 50));
		jButton.setPreferredSize(new Dimension(100, 50));
		jTextField.setPreferredSize(new Dimension(300, 50));
		jComboBox.setPreferredSize(new Dimension(50, 50));
		jCheckBox.setPreferredSize(new Dimension(100, 50));
		jLabelBlank.setPreferredSize(new Dimension(200, 50));
		jButtonExit.setPreferredSize(new Dimension(100, 50));
		
		jButton.addActionListener(this);
		jButtonExit.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	   if(e.getSource() == jButton) {
		   jLabelBlank.setText(jTextField.getText());
	   } else if(e.getSource() == jButtonExit) {
		   setVisible(false);
		   dispose();
		   System.exit(0);
	   }
	}
}
