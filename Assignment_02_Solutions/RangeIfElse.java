public class RangeIfElse {
	public static void main(String[] args){
		int x = 35, y = 65;
		check(x);
		check(y);
	}
	
	public static void check(int a){
		System.out.println((a>=20 && a<=50)? a + " lies in the range." : a + " doesn't lie within the range");
	} 
}	