public class NoOfOnes{
	public static void main(String[] args){
		setbits(12);
		setbits(88);
	}
	
	public static void setbits(int num){ 
		int count = 0;
		while(num > 0){
            num = (num & (num - 1));
            count++;
        }
		System.out.println(count);
	} 
}	