public class Q6{
	public static void main(String[] args){
		int x=2, y=3, z=7;
		int res = ((x>y && x>z)? x : (y>x && y>z)? y : z);
		System.out.println(res + " is the largest number.");
	}
}	