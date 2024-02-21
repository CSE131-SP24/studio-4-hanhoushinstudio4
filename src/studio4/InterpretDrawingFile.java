package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeName = in.next();
		
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		
		Color someThing = new Color (red, green, blue);
		StdDraw.setPenColor (someThing);
		
		boolean filledShape = in.nextBoolean();
		
		if (filledShape == true && shapeName == "ellipse") {
			
			double x = in.nextDouble();
			double y = in.nextDouble();
			double xDiameter = in.nextDouble();
			double yDiameter = in.nextDouble();
			StdDraw.filledEllipse(x, y, xDiameter, yDiameter);
		}
		else if (filledShape == false && shapeName == "ellipse") {
			
			double x = in.nextDouble();
			double y = in.nextDouble();
			double xDiameter = in.nextDouble();
			double yDiameter = in.nextDouble();
			StdDraw.filledEllipse(x, y, xDiameter, yDiameter);
					
	}
	}
}
