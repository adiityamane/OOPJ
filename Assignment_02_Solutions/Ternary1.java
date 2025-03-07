public class Ternary1 {
	public static void main(String[] args){
		pnz(23);
		pnz(0);
		pnz(-8);
	}
	public static void pnz(int x){
		String res = (x==0)? "zero" : (x>0)? "positive" : "negative";
		System.out.println(res);
	}
}	