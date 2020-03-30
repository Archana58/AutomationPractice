package day2;

public class calc_reusable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	reuse multiple times.
		
		calc_reusable c= new calc_reusable();
		c.addTwoNumber(10,20);
		c.mulTwoNumber(12,23);
//		with return type as int
		int val=c.divTwoNumber(25,5);

		System.out.println("division of two no is:   "   +   val);
		
	}
//access modifier,return type,method name(arguments)
	public void addTwoNumber(int a,int b) {
		
		int sum=a+b;
		System.out.println("addition of two no is:   " +  sum);
	}
		
//	without return type 
		public void mulTwoNumber(int a1,int b1) {
			
			int mul=a1*b1;
			System.out.println("multiplication of two no is:   " +   mul);
		}	
			
//		with return type int 
		public int divTwoNumber(int a2,int b2) {
				
				int div=a2/b2;
				return div;
//				System.out.println("division of two no is:   " +   div);
			
	}
}
