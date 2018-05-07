package GUIgame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import GameLogic.UserService;
import GameLogic.WindowCloseOperation;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class UserCreation {

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserCreation window = new UserCreation();
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
	public UserCreation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 652, 357);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowCloseOperation());
		
		Panel panel = new Panel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("create user");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("create");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				UserService userservice = new UserService("players");
				userservice.newUser(textField.getText(), passwordField.getText());
				
				LogScreen window = new LogScreen();
				window.frame.setVisible(true);
				
			}
			
		});
		panel.add(btnNewButton);
		
		JButton btnIAlreadyHave = new JButton("I Already Have an Account");
		btnIAlreadyHave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LogScreen screen= new LogScreen();
				screen.frame.setVisible(true);
			}
		});
		btnIAlreadyHave.setBackground(new Color(0, 255, 255));
		frame.getContentPane().add(btnIAlreadyHave, BorderLayout.CENTER);
	}

}
