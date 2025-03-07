public class PassFail{
	public static void main(String args[]){
		check(43);
		check(18);
	}
	
	public static void check(int a){
		String result = (a>=40)? "Pass" : "Fail";
		System.out.println(result);
	}
}