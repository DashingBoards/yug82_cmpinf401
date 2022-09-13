package edu.pitt.yug82_Lab2;

import javax.swing.JOptionPane;

public class PythagoreanTheoremSolution {

	public static void main(String[] args) {
		String triangleSide1 = JOptionPane.showInputDialog("Please input the length of the first side of the triangle");
		String triangleSide2 = JOptionPane.showInputDialog("Please input the length of the second side of the triangle");
		int lengthSide1 = Integer.parseInt(triangleSide1);
		int lengthSide2 = Integer.parseInt(triangleSide2);
		double lengthHypotenus = Math.sqrt(Math.pow(lengthSide1, 2)+Math.pow(lengthSide2, 2));
		int lengthHypotenusRounded = (int) Math.round(lengthHypotenus * 100);
		lengthHypotenus = lengthHypotenusRounded / 100.0;
		String outputText = "The hypotenus is " + lengthHypotenus;
		JOptionPane.showMessageDialog(null, outputText);
	}

}
