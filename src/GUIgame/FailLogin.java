package GUIgame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

import GameLogic.WindowCloseOperation;

import java.awt.Label;

public class FailLogin {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FailLogin window = new FailLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FailLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(255, 165, 0));
		frame.setBounds(100, 100, 477, 316);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		Label label = new Label("Wrong login credentials. Please try again");
		label.setBackground(new Color(255, 165, 0));
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		frame.getContentPane().add(label, BorderLayout.CENTER);
	}

}
