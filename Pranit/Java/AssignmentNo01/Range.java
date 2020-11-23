1. Write a java program which generates the minimum and maximum value for each of the Numeric Wrapper classes (Byte, Short, nteger, Long, Float, Double)

package wrapper.classes;

public class Range {


	public static void main(String[] args) {
		
		System.out.println("Integer Range: Min : " + Integer.MIN_VALUE+" Max : " + Integer.MAX_VALUE);
		
		System.out.println("Double Range: Min : " + Double.MIN_VALUE+" Max : " + Double.MAX_VALUE);
		
		System.out.println("Long Range : Min : " + Long.MIN_VALUE + " Max : " + Long.MAX_VALUE);
		
		System.out.println("Short Range : Min : " + Short.MIN_VALUE + " Max : " + Short.MAX_VALUE);
		
		System.out.println("Byte Range : Min : " + Byte.MIN_VALUE + " Max : " + Byte.MAX_VALUE);
		
		System.out.println("Float Range : Min : " + Float.MIN_VALUE + " Max : " + Float.MAX_VALUE);

	}

}
