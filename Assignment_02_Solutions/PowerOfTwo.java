public class PowerOfTwo{
	public static void main(String[] args){
		check(4);
		check(66);
	}
	
	public static void check(int a){
		if(a<0) a = -a;
		if((a & (a-1))==0)
			System.out.println(a + " is a power of two");
		else
			System.out.println(+ a + " is not a power of two");	
	} 
}	