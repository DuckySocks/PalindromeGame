package GUIgame;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import GameLogic.UserService;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginFinal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFinal window = new LoginFinal();
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
	public LoginFinal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 668, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE PALINDROME GAME");
		lblWelcomeToThe.setForeground(Color.BLUE);
		lblWelcomeToThe.setBackground(Color.CYAN);
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(lblWelcomeToThe, BorderLayout.NORTH);
		
		JButton btnStartGame = new JButton("START GAME ");
		btnStartGame.setForeground(new Color(75, 0, 130));
		btnStartGame.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnStartGame.setBackground(new Color(255, 20, 147));
		btnStartGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserCreation creatorWindow= new UserCreation();
				creatorWindow.frame.setVisible(true);
				
				//GamePlay window = new GamePlay();
				//window.frame.setVisible(true);
			}
		});
		frame.getContentPane().add(btnStartGame, BorderLayout.SOUTH);
		
		JTextArea txtrAPalindromeIs = new JTextArea();
		txtrAPalindromeIs.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		txtrAPalindromeIs.setBackground(new Color(255, 215, 0));
		txtrAPalindromeIs.setLineWrap(true);
		txtrAPalindromeIs.setText("A palindrome is a word that reads the same forwards and backwards.   Press \"Start Game\" to start a game where you will enter a word and if you know it is a palindrome or not! The computer will check your answer. ");
		frame.getContentPane().add(txtrAPalindromeIs, BorderLayout.CENTER);
	}

}
