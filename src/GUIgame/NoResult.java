package GUIgame;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class NoResult {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NoResult window = new NoResult();
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
	public NoResult() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JTextArea txtrYouAreNot = new JTextArea();
		txtrYouAreNot.setLineWrap(true);
		txtrYouAreNot.setEditable(false);
		txtrYouAreNot.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		txtrYouAreNot.setBackground(new Color(255, 0, 0));
		txtrYouAreNot.setForeground(new Color(0, 0, 0));
		txtrYouAreNot.setText("You are not correct. Exit    this message and try again");
		frame.getContentPane().add(txtrYouAreNot, BorderLayout.CENTER);
	}

}
