public class Letters {
	public static void main(String args[]){
		check('u');
		check('P');
		check('8');
	}
	
	public static void check(char A){
		int a = (int) A;
		String result = (a>64 && a<91)? "Uppercase" : (a>96 && a<123)? "Lowercase" : "Not a character";
		System.out.println(result);
	}
}


