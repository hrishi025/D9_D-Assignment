package question.no3;

public class CommandLineArguments {

	public static void main(String[] args) {

		String input =  args[0];
		System.out.println(input);
		
		// Reverse number [e.g. for 1234 ,4321]
		
		StringBuffer sbr = new StringBuffer(input);
        sbr.reverse();
        System.out.println(sbr);
        
        // Check weather given number is palindrome or not.
        
        String str =  args[0];
        String inputrev = new StringBuffer(str).reverse().toString();
        
        if(input.equals(inputrev))
        	System.out.println("Given Number is Palindrome");
        else
        	System.out.println("Given Number is not Palindrome");

	}

}
