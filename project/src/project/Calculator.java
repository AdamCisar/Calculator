package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.Serializable;

public class Calculator extends CalculatorFrame implements ActionListener {
	
	private double num1, num2, result;
	private	char operator;


	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i=0; i<numbers.length; i++) {
			if (e.getSource() == numbers[i]) {
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}
		}
		
		if (e.getSource() == hisButton) {
			try {
				History.show();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}	
		
		
		if (e.getSource() == decButton) {
			textfield.setText(textfield.getText().concat("."));
		}	
	
		if (e.getSource() == delButton) {
		String string = textfield.getText();
		textfield.setText("");
			for( int i=0; i<string.length()-1; i++) {
				textfield.setText(textfield.getText() + string.charAt(i));
			}	
		}
		
		if (e.getSource() == clrButton) {
			textfield.setText("");
		}
		
		if (e.getSource() == addButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '+';
			textfield.setText("");
		}
		
		if (e.getSource() == multiButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '*';
			textfield.setText("");
		}
		
		if (e.getSource() == divButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '/';
			textfield.setText("");
		}
		
		if (e.getSource() == subButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '-';
			textfield.setText("");
		}
		
	
		if (e.getSource() == equalButton){
			
			try {
				calculate();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}

	}
	
	private void calculate() throws IOException {
		num2 = Double.parseDouble(textfield.getText());
	
		switch(operator) {
		
		case '+':
			result = num1 + num2;
		break;
		
		case '-':
			result = num1 - num2;
		break;
		
		case '/':
			result = num1 / num2;
		break;
		
		case '*':
			result = num1 * num2;
		break;
		
		}
		
		History.write(num1, num2, operator, result);

		textfield.setText(String.valueOf(result));
		
		}
	
}
