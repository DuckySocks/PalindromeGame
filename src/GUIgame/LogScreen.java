package GUIgame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;

import GameLogic.UserService;

import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.Window;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LogScreen {

	public JFrame frame;
	private Panel panel;
	private Panel panel_1;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private Button button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogScreen window = new LogScreen();
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
	public LogScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 192, 203));
		frame.setBounds(100, 100, 665, 357);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel_1 = new Panel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		frame.getContentPane().add(panel_1);
		
		lblNewLabel_1 = new JLabel("Username");
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		panel = new Panel();
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Password");
		panel.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		panel.add(passwordField);
		
		button = new Button("Enter game");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				UserService userservice = new UserService("players");
				if(userservice.login(textField_1.getText(), passwordField.getText())) {
				GamePlay window = new GamePlay();
				window.frame.setVisible(true);
				} else {
					FailLogin fail= new FailLogin();
					fail.frame.setVisible(true);
				}
			}
			
		});
		frame.getContentPane().add(button);
	}

}
