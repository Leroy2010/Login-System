import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main implements ActionListener {
	
	public static JFrame frame;
	public static JPanel panel;
	
	public static JTextField usernameInput;
	public static JLabel usernameLabel;
	
	public static JPasswordField passwordInput;
	public static JLabel passwordLabel;
	
	public static JButton confirmLogin;
	
	public static JLabel loginAnswers;

	public static void main(String[] args) {
		
		start();

	}
	
	public static void start() {
		
		frame = new JFrame();
		panel = new JPanel();
		
		panel.setLayout(null);
		panel.setBackground(null);
		
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("log in");
		frame.setVisible(true);
		frame.setResizable(false);
		frame.add(panel);
		
		usernameInput = new JTextField();
		usernameInput.setBounds(200, 50, 125, 30);
		panel.add(usernameInput);
		
		usernameLabel = new JLabel();
		usernameLabel.setBounds(100, 50, 125, 30);
		usernameLabel.setText("username : ");
		panel.add(usernameLabel);
		
		passwordInput = new JPasswordField();
		passwordInput.setBounds(200, 100, 125, 30);
		panel.add(passwordInput);
		
		passwordLabel = new JLabel();
		passwordLabel.setBounds(100, 100, 125, 30);
		passwordLabel.setText("password : ");
		panel.add(passwordLabel);
		
		confirmLogin = new JButton();
		confirmLogin.setBounds(125, 150, 75, 30);
		confirmLogin.setText("log in");
		confirmLogin.addActionListener(new Main());
		panel.add(confirmLogin);
		
		loginAnswers = new JLabel();
		loginAnswers.setBounds(75, 200, 400, 30);
		loginAnswers.setText("username : Username, password : Password");
		panel.add(loginAnswers);
		
		frame.setSize(401, 301);
		frame.setSize(400, 300);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == confirmLogin) {
			
			if (usernameInput.getText().equals("Username") && passwordInput.getText().equals("Password")) {
				
				panel.setBackground(Color.green);
				
			}
			
			else {
				
				panel.setBackground(Color.red);
				
			}
			
		}
		
	}

}
