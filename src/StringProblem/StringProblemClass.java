package StringProblem;

public class StringProblemClass {
	public static void main(String[] args) {
	

		System.out.println(remCharInStr1("This is a java programming.", 'i'));
		
		System.out.println(remCharInStr1("", 'i'));
		
		
		
	}
	
	public static boolean remCharInStr1(String str, char c){
		String s = String.valueOf(c);
		str = str.replace(s, "");
		System.out.println(str);
		
		if(str=="") return false;
		
		return true;
	}
}
