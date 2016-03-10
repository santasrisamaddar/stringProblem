package StringProblem;

public class StrProblem {

	public static void main(String[] args) {
		
		System.out.println(remCharInStr("This is a java programming.", 'i'));
		
		System.out.println(remCharInStr("", 'i'));
	}
	
	public static boolean remCharInStr(String str, char c){
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++){
		    if (str.charAt(i) != c){
		        sb.append(str.charAt(i));
		    }
		}
		System.out.println(sb.toString());
		
		if(str==""){
			return false;
		}
		return true;
	}

}
