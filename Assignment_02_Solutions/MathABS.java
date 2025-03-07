public class MathABS {
	public static void main(String args[]){
		check(10);
		check(-88);
	}
	
	public static void check(int A){
		int result = (A>0)? A : -A;
		System.out.println("absolute value: " + result);
	}
}