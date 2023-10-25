
public class ReverseString {
	public static void main(String [] args) {
		String str = "Camera";
		System.out.println(reverseString(str));
		
		
		
	}

	private static String reverseString(String str) {
		if ((str == null ) || (str.length() <= 1)){
			return str;
		}
		System.out.print(str.charAt(str.length()-1));
        return reverseString(str.substring(0,str.length()-1));
	}

}
