package day3;

public class StringManupulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg="Work from home till march 31st";
		
		
		String msg1="ArVIndDSAFADG_56789";
		String msg2="Arvind_56789deepal";
		System.out.println(msg1);
		System.out.println(msg2);
		
//		String name=msg1.split(regex:"_ ")[0];
//		String num=msg1.split(regex:"_ ")[1];
//		String n1=msg2.split(regex:"9")[0];
//		String n2=msg2.split(regex:"9")[1];
		
//		System.out.println(name);//Arvind
//		System.out.println(num);//56789
//		System.out.println(n1);//Arvind_56789
//		System.out.println(n2);//deepal
		
		String s=msg1.substring(1, 7).toLowerCase()+msg1.substring(8);
		
		System.out.println(s);
		System.out.println(msg1.replace("A", "#"));
		
		
	}

}
