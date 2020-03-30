package day3;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to get the character at the given index within the string.
		String stm= "Get well soon from corona";
		Program1 pgm=new Program1();
		char vl=pgm.getCharIndex("hojj", 1);
		System.out.println(vl);
		System.out.println(stm.length());
		System.out.println(stm.toUpperCase());
		String browser="chromE";
//		if(browser.equals("chrome")) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
		
		System.out.println(browser.hashCode());
		
//		System.out.println(stm.charAt(6));
		
	}

	public char getCharIndex(String stm,int index) {
		char val=stm.charAt(index);
		return val;
	}
	
}
