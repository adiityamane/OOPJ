public class LeftShift{
	public static void main(String[] args){
		check(9);
		check(30);
		check(-21);
	}
	
	public static void check(int a){
		//Use bitwise left shift (  <<  ) 
		int result = a << 3;
		System.out.println(result);
	} 
}	