/*
 * Author: Ethan Wong
 * 
 * Question: 1.5.19 from Robert Sedgewick and Kevin Wayne:
 * Introduction to Programming in Java: An Interdisciplinary Approach
 */
public class Connections {

	public static void main(String[]args) {
		
		if (args.length==0)
			args = new String[] {"16", "1.0"};
		
		int n = Integer.parseInt(args[0]);
		double p = Double.parseDouble(args[1]);
		double a = 0;
		double b = 0;
		
		//Sets the scale of the canvas
		StdDraw.setXscale(-1.2, 1.2);
		StdDraw.setYscale(-1.2, 1.2);
		
		//Draws the set number of points on the circumference of the circle
		for(int i = 0; i < n; i++) {
			StdDraw.setPenRadius(0.05);
			StdDraw.point(Math.cos(a), Math.sin(a));
			a = a + 2 * Math.PI / n;
		}
		
		//Nested loop
		for(int j = 0; j < n; j++) {
			a = 0;
			
			for(int k = 0; k < n; k++) {
				//Draws a random number and assigns it to RanNum
				double RanNum = (double) Math.random();
				
				StdDraw.setPenRadius(0.005);
				
				//Compares tha random number to the probability of it being drawn
				if (RanNum <= p)
					StdDraw.line(Math.cos(b), Math.sin(b), Math.cos(a), Math.sin(a));
				
				a = a + 2 * Math.PI / n;
			}
			
			b = b + 2 * Math.PI / n;
		}
	}
}
