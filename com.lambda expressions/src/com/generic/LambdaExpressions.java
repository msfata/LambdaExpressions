/**
 * 
 */
package com.generic;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LambdaExpressions extends JFrame {

	/**
	 * @author msfata ProgrammingHelp
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LambdaExpressions frame = new LambdaExpressions();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LambdaExpressions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(44, 104, 571, 94);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		/*
		 * button
		 */
		JButton btnNormalButton = new JButton("Normal Button");
		btnNormalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("Normal Action Listener");
			}
		});
		btnNormalButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(btnNormalButton);

		/*
		 * button with Lambda expressions
		 */
		JButton btnLambdaButton = new JButton("Lambda Button");
		btnLambdaButton.addActionListener(e -> {
			textField.setText("Lambda Action Listener");
		});
		btnLambdaButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(btnLambdaButton);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField.setBounds(44, 24, 571, 67);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
