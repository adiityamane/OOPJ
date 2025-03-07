public class StringBuilder {
	static public void main(String me[]){
		int x = 876, rev = 0;
		int temp = x;
		while(x!=0){
			rev = rev * 10 + x % 10;
			x = x/10;
		}
		System.out.println("Reverse of " + temp + " is " + rev);
	}
} 