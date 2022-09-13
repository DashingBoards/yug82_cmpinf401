package edu.pitt.yug82_Lab3;

import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Please input the number and unit that needs to be coverted");
		String[] userInputs = userInput.split(" ");
		double userInputValue = Double.parseDouble(userInputs[0]);
		String userInputUnit = userInputs[1];
		String userOutput = "";
		if (userInputUnit.equalsIgnoreCase("in"))
		{
			userOutput = userInput + " = " + userInputValue * 2.54 + "cm";
		}
		else if (userInputUnit.equalsIgnoreCase("cm"))
		{
			userOutput = userInput + " = " + userInputValue / 2.54 + "in";
		}
		else if (userInputUnit.equalsIgnoreCase("yd"))
		{
			userOutput = userInput + " = " + userInputValue * 0.9144 + "m";
		}
		else if (userInputUnit.equalsIgnoreCase("m"))
		{
			userOutput = userInput + " = " + userInputValue / 0.9144 + "yd";
		}
		else if (userInputUnit.equalsIgnoreCase("oz"))
		{
			userOutput = userInput + " = " + userInputValue * 28.35 + "gm";
		}
		else if (userInputUnit.equalsIgnoreCase("gm"))
		{
			userOutput = userInput + " = " + userInputValue / 28.35 + "oz";
		}
		else if (userInputUnit.equalsIgnoreCase("lb"))
		{
			userOutput = userInput + " = " + userInputValue * 0.4536 + "kg";
		}
		else if (userInputUnit.equalsIgnoreCase("kg"))
		{
			userOutput = userInput + " = " + userInputValue / 0.4536 + "lb";
		}
		else
		{
			userOutput = "There isn't a matching unit for your input!";
		}
		JOptionPane.showMessageDialog(null, userOutput);

	}

}
