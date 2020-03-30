package day3;

public class StringManupulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//== - int and string and equal - only for string
		
		int a=10;
		int b=-20;
		
		String name="archana";
		String name2="ArChAna";
		
		
		System.out.println(a==b);
		System.out.println(name==name2);
		System.out.println(name.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name.codePointAt(3));
		System.out.println(name.concat(" br"));
		System.out.println(name2.toLowerCase());
		
		
		
		
	}

}
