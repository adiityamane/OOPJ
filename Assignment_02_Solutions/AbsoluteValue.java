public class AbsoluteValue{
	public static void main(String[] args){
		abs(23);
		abs(-1);
	}
	
	public static void abs(int num){ 
		int mask = num >> 31; 
		int abs = (num + mask) ^ mask;
		System.out.println(abs);
	} 
}	