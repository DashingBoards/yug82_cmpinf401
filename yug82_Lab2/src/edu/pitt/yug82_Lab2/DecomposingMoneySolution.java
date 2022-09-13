package edu.pitt.yug82_Lab2;

import javax.swing.JOptionPane;

public class DecomposingMoneySolution {

	public static void main(String[] args) {
		String money = JOptionPane.showInputDialog("Please enter the amount of dollars");
		int dollar = Integer.parseInt(money);
		int grands = dollar / 1000;
		int benjamin = dollar % 1000 / 100;
		int sawbucks = dollar % 100 / 10;
		int bucks = dollar % 10;
		JOptionPane.showMessageDialog(null, grands + "grands");
		JOptionPane.showMessageDialog(null, benjamin + "Benjamins");
		JOptionPane.showMessageDialog(null, sawbucks + "sawbucks");
		JOptionPane.showMessageDialog(null, bucks + "bucks");
	}

}
