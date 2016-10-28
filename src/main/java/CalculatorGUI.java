import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculatorGUI {

	JFrame frame;
	private JTextField textFieldFirstNumber;
	private JTextField textFieldSecondNumber;
	private JLabel lblResult = new JLabel("Result: ");
	private Calculator calculator = new Calculator ();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public CalculatorGUI() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldFirstNumber = new JTextField();
		textFieldFirstNumber.setBounds(155, 35, 114, 19);
		frame.getContentPane().add(textFieldFirstNumber);
		textFieldFirstNumber.setColumns(10);
		
		textFieldSecondNumber = new JTextField();
		textFieldSecondNumber.setBounds(155, 81, 114, 19);
		frame.getContentPane().add(textFieldSecondNumber);
		textFieldSecondNumber.setColumns(10);
		
		JLabel lblFirstNumber = new JLabel("Number 1: ");
		lblFirstNumber.setBounds(40, 37, 114, 15);
		frame.getContentPane().add(lblFirstNumber);
		
		JLabel lblSecondNumber = new JLabel("Number 2: ");
		lblSecondNumber.setBounds(40, 83, 100, 15);
		frame.getContentPane().add(lblSecondNumber);
		
		lblResult = new JLabel("Result: ");
		lblResult.setBounds(40, 122, 229, 15);
		frame.getContentPane().add(lblResult);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double firstNumber = 0.0;
				double secondNumber = 0.0;
				double result = 0.0;
				
				firstNumber = Double.valueOf(textFieldFirstNumber.getText().toString());
				secondNumber = Double.valueOf(textFieldSecondNumber.getText().toString());
				
				result = calculator.add(firstNumber, secondNumber);
				lblResult.setText("Result is: " + result);
				
			}
		});
		btnAdd.setBounds(28, 176, 50, 50);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = 0.0;
				double secondNumber = 0.0;
				double result = 0.0;
				
				firstNumber = Double.valueOf(textFieldFirstNumber.getText().toString());
				secondNumber = Double.valueOf(textFieldSecondNumber.getText().toString());
				
				result = calculator.subtract(firstNumber, secondNumber);
				lblResult.setText("Result is: " + result);
			}
		});
		btnSubtract.setBounds(118, 176, 50, 50);
		frame.getContentPane().add(btnSubtract);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = 0.0;
				double secondNumber = 0.0;
				double result = 0.0;
				
				firstNumber = Double.valueOf(textFieldFirstNumber.getText().toString());
				secondNumber = Double.valueOf(textFieldSecondNumber.getText().toString());
				
				result = calculator.multiply(firstNumber, secondNumber);
				lblResult.setText("Result is: " + result);
			}
		});
		btnMultiply.setBounds(219, 176, 50, 50);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double firstNumber = 0.0;
				double secondNumber = 0.0;
				double result = 0.0;
				
				firstNumber = Double.valueOf(textFieldFirstNumber.getText().toString());
				secondNumber = Double.valueOf(textFieldSecondNumber.getText().toString());
				
				result = calculator.divide(firstNumber, secondNumber);
				lblResult.setText("Result is: " + result);
			}
		});
		btnDivide.setBounds(321, 176, 50, 50);
		frame.getContentPane().add(btnDivide);
	}
}
