package GUIgame;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class YesResult {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YesResult window = new YesResult();
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
	public YesResult() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea txtrYouAreCorrect = new JTextArea();
		txtrYouAreCorrect.setBackground(new Color(124, 252, 0));
		txtrYouAreCorrect.setFont(new Font("Comic Sans MS", Font.BOLD, 33));
		txtrYouAreCorrect.setText("YOU ARE CORRECT!!!!!!!!");
		frame.getContentPane().add(txtrYouAreCorrect, BorderLayout.CENTER);
	}

}
