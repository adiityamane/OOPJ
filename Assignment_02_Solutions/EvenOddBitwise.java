public class EvenOddBitwise {
	public static void main(String[] args){
		int a = 12, b = 77;
		check(a);
		check(b);
	}
	
	public static void check(int a){
		if((a&1) == 0){
			System.out.println(a + " is even");
		} else {
			System.out.println(a + " is odd");
		}
	}
}	