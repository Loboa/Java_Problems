//This program takes a string argument from application entry input and reverse the first String 
public class myClass{
	public static void main(String[] args) {System.out.println(reverse(args[0]));}
	public static String reverse(String s ) {StringBuilder sd = new StringBuilder(s);
	return sd.reverse().toString();
	}


}
