package question.no2;

/*	Q.2. Write a java program to check type compatibility for following statements. Observe the effect. Make changes 
in terms of casting if needed and also display the width of all the above data types.
	 int : 9348.39
	 long int : 100
	 short : 80999
	 long : 2373467e18
	 byte : 129
	 float : 218.928
	 double : 2930.3f
	 char : -3
	 boolean : 0		*/


public class TypeCompatibility {

	
	public static void main(String[] args) {

		int A = (int) 9348.39;
		
		System.out.println("int : 9348.39 : " + A);
		System.out.println("Width of Integer : " + Integer.SIZE/8 + " Bytes");
		
//		long int B = 100;
		
//		Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
//			Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration
//			Syntax error, insert ";" to complete LocalVariableDeclarationStatement
//
//			at question.no2.TypeCompatibility.main(TypeCompatibility.java:26)

		
//		System.out.println("\nlong int : 100 : " + B);
		System.out.println("Width of Long : " + Long.SIZE/8 + " Bytes");
		
		short C = (short) 80999;
		
		System.out.println("\nshort : 80999 : " + C);
		System.out.println("Width of Short : " + Short.SIZE/8 + " Bytes");
		
		long D = (long) 2373467e18;
		
		System.out.println("\nlong : 2373467e18 : " + D);
		System.out.println("Width of Long : " + Long.SIZE/8 + " Bytes");
		
		byte E = (byte) 129;
		
		System.out.println("\nbyte : 129 : " + E);
		System.out.println("Width of Byte : " + Byte.SIZE/8 + " Bytes");
		
		float F = (float) 218.928;
		
		System.out.println("\nfloat : 218.928 : " + F);
		System.out.println("Width of Float : " + Float.SIZE/8 + " Bytes");
		
		double G = 2930.3f;
		
		System.out.println("\ndouble : 2930.3f : " + G);
		System.out.println("Width of Double : " + Double.SIZE/8 + " Bytes");
		
		char H = (char) -3;
		
		System.out.println("\nchar : -3 : " + H);
		System.out.println("Width of Char : " + Character.SIZE/8 + " Bytes");
		
//		boolean I = 0;
		
//		System.out.println(I);
		//System.out.println("Width of Boolean : " + Boolean.SIZE/8 + " Bytes");
		
//		Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
//			Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration
//			Syntax error, insert ";" to complete LocalVariableDeclarationStatement
//			Type mismatch: cannot convert from int to boolean
//
//			at question.no2.TypeCompatibility.main(TypeCompatibility.java:26)

		
		
	}

}
















