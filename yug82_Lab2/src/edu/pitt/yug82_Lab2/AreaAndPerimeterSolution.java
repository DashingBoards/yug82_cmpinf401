package edu.pitt.yug82_Lab2;

import javax.swing.JOptionPane;

public class AreaAndPerimeterSolution {

	public static void main(String[] args) {
		String r = JOptionPane.showInputDialog("Please input the radius of the circle");
		double radius = Double.parseDouble(r);
		double perimeter = 2*Math.PI*radius;
		int perimeterRounded = (int) Math.round(perimeter * 1000);
		perimeter = perimeterRounded / 1000.0;
		double area = Math.PI*radius*radius;
		int areaRounded = (int) Math.round(area*100);
		area = areaRounded / 100.0;
		String output = "The circle with radius "+ r + " has an area of "+ area + " and a perimeter of " + perimeter;
		JOptionPane.showMessageDialog(null, output);
	}

}
