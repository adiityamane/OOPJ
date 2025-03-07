public class VowelOrConsonant{
	public static void main(String[] args){
		char x = 'A';
		check(x);
		x = 'u';
		check(x);
		x = 'Q';
		check(x);
		x = 'Z';
		check(x);
	}
	
	public static void check(char a){
		char ch = Character.toLowerCase(a);
		String str = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch =='u')? a + " is a vowel." : a + " is a consonant";  
		System.out.println(str);
	} 
}	