package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) { 
		double sum = 0.0;
		if (n==0) {
			return sum;
		}
		else {
		sum+= Math.pow(2, -n)+geometricSum(n-1);
		return sum;
		}
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		if (p%q==0) {
			return q;
		}
		else {
		return gcd(q, p%q);	
		}	
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int reverser(int index, int[] reverseArray) {
		return 0;
	}
	public static int[] toReversed(int[] array) {
		int[] toReverse = new int[array.length];
		if (array.length==0 || array.length==1) {
			return array;
		}
		else {
		 	
		}
			return new int[0];
		
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		double bound = 5.0;
		StdDraw.setXscale(-bound,bound);
		StdDraw.setYscale(-bound,bound);
		if (radiusMinimumDrawingThreshold == radius) {
			circlesUponCircles(xCenter, yCenter, radius);
		}
		else {
			StdDraw.circle(xCenter, yCenter, radius);
			circlesUponCircles(xCenter+radius,yCenter,radius/3.0, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter-radius,yCenter,radius/3.0, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter,yCenter+radius,radius/3.0, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter,yCenter-radius,radius/3.0,radiusMinimumDrawingThreshold);
		}
		
	}

}
