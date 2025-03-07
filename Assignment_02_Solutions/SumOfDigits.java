public class SumOfDigits{
	public static void main(String[] args){
		int x = 456;
		int res = 0;
		while(x!=0){
			res = res + (x%10);
			x = x/10;
		}
		System.out.println("Sum: " + res);
	}
}