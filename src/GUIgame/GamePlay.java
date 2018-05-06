package GUIgame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import GameLogic.GameLogic;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class GamePlay {

	public JFrame frame;
	private JTextField txtPleaseEnterWord;
	private JButton btnYes;
	private JButton btnNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GamePlay window = new GamePlay();
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
	public GamePlay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 669, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextArea txtrInTheSpace = new JTextArea();
		txtrInTheSpace.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		txtrInTheSpace.setLineWrap(true);
		txtrInTheSpace.setText(
				"In the space below, enter a word (longer than 3 letters) from your head. Then, click \"yes\" or \"no\" on if YOU think it is a palindrome. The computer will then tell you if you are       correct!");
		frame.getContentPane().add(txtrInTheSpace, BorderLayout.NORTH);

		txtPleaseEnterWord = new JTextField();
		txtPleaseEnterWord.setBackground(new Color(175, 238, 238));
		txtPleaseEnterWord.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPleaseEnterWord.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtPleaseEnterWord.setText("");
			}
		});
		txtPleaseEnterWord.setText("PLEASE ENTER WORD HERE:");
		frame.getContentPane().add(txtPleaseEnterWord, BorderLayout.CENTER);
		txtPleaseEnterWord.setColumns(10);

		btnYes = new JButton("YES!!");
		btnYes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GameLogic logic = new GameLogic();
				
				if (logic.isMatch(txtPleaseEnterWord.getText())) {
					YesResult window = new YesResult();
					window.frame.setVisible(true);
				} else {
					NoResult window =new NoResult();
					window.frame.setVisible(true);
				}
			}
		});
		btnYes.setBackground(new Color(127, 255, 0));
		frame.getContentPane().add(btnYes, BorderLayout.WEST);

		btnNo = new JButton("NO!!!");
		btnNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GameLogic logic= new GameLogic();
				if (logic.isMatch(txtPleaseEnterWord.getText())) {
				NoResult window = new NoResult();
				window.frame.setVisible(true);
				} else {
					NoResult window =new NoResult();
					window.frame.setVisible(true);
				}
			}
		});
		btnNo.setBackground(new Color(255, 0, 0));
		frame.getContentPane().add(btnNo, BorderLayout.EAST);
	}

}
