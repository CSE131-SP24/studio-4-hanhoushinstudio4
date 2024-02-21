package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class chloeFlag {

	public static void main(String[] args) {
	
		// bottom cookie
		Color brown = new Color (101,67,33);
		StdDraw.setPenColor(brown);
		StdDraw.filledCircle(0.55,0.5,0.2);
		
		// icecream
		Color vanilla = new Color (249, 229, 188);
		StdDraw.setPenColor(vanilla);
		StdDraw.filledCircle(0.45,0.5,0.2);
		
		// top cookie
		StdDraw.setPenColor(brown);
		StdDraw.filledCircle(0.35,0.5,0.2);
		
		// mandms
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledCircle(0.42, 0.52, 0.03);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(0.3, 0.4, 0.03);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledCircle(0.27, 0.6, 0.03);
		
	
	}
}
	
