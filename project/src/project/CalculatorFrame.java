package project;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CalculatorFrame extends JFrame{
	
	JButton[] numbers = new JButton[10];
	JButton delButton, decButton, equalButton, addButton, subButton, multiButton, divButton, clrButton;
	JTextField textfield = new JTextField();
	
	CalculatorFrame(){
		
		textfield.setBounds(50, 25, 300, 50);
		textfield.setFont(new Font("Serif", Font.BOLD, 20));
		textfield.setEditable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(450, 80, 400, 400);
		this.setLayout(null);
		

		for (int i=0; i<numbers.length; i++) {
			numbers[i] = new JButton(String.valueOf(i));
			numbers[i].setFocusable(false);
			numbers[i].setForeground(Color.BLUE);
			numbers[i].addActionListener((ActionListener) this);
	}
		//Creating custom buttons 
		delButton = createButton("<<");
		decButton = createButton(".");
		addButton = createButton("+");
		subButton = createButton("-");
		divButton = createButton("/");
		multiButton = createButton("*");
		equalButton = createButton("=");
		clrButton = createButton("C");
		
		JPanel panel = new JPanel();
		panel.setBounds(150, 120, 180, 180);
		panel.setLayout(new GridLayout(4,2, 10,10));
		
		JPanel OpPanel = new JPanel();
		OpPanel.setBounds(50, 120, 80, 230);
		
		JPanel equalPanel = new JPanel();
		equalPanel.setBounds(150, 310, 180, 180);
		equalPanel.setLayout(new GridLayout(4,2, 10,10));
				
		panel.add(delButton);
		panel.add(numbers[1]);
		panel.add(numbers[2]);
		panel.add(numbers[3]);
		panel.add(numbers[4]);
		panel.add(numbers[5]);
		panel.add(numbers[6]);
		panel.add(numbers[7]);
		panel.add(numbers[8]);
		panel.add(numbers[9]);
		panel.add(numbers[0]);
		panel.add(decButton);
		
		equalPanel.add(equalButton);
		
		OpPanel.add(addButton);
		OpPanel.add(multiButton);
		OpPanel.add(divButton);
		OpPanel.add(subButton);
		OpPanel.add(clrButton);
		
		this.add(OpPanel);
		this.add(equalPanel);
		this.add(textfield);
		this.add(panel);
		this.setVisible(true);
	}
	
	
	private JButton createButton(String title) {
		
		JButton button = new JButton(title);
		
		addActionListener(button);
		setFocusableButtons(button);
		return button;
	}
	
	private void setFocusableButtons(JButton button) {
		
		button.setFocusable(false);
		
	}
	
	private void addActionListener(JButton button) {
		
		button.addActionListener((ActionListener) this);

	}
	

	
}