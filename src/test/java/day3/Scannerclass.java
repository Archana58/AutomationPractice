package day3;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//			reuse multiple times using scanner class.
				Scanner sc=new Scanner(System.in);
				
				System.out.println("enter a number: ");
				
				int num1=sc.nextInt();
				
                System.out.println("enter a number: ");
				
				int num2=sc.nextInt();
				
//                System.out.println("enter a number: ");
//				
//				int num3=sc.nextInt();
//				
//                System.out.println("enter a number: ");
//				
//				int num4=sc.nextInt();
				
		        Scannerclass c= new Scannerclass();
				c.addTwoNumber(num1,num2);
				
				c.mulTwoNumber(num1,num2);
				int val=c.divTwoNumber(num1, num2);
				
				System.out.println("divison of two no is:   " +  val);
	}
		//access modifier,return type,method name(arguments)method with no return type
			public void addTwoNumber(int num1,int num2) {
				
				int sum=num1+num2;
				System.out.println("addition of two no is:   " +  sum);
			
			
	}
            public void mulTwoNumber(int num1,int num2) {
				
				int mul=num1*num2;
				System.out.println("multiplication of two no is:   " +  mul);
            }	
				public int divTwoNumber(int num1,int num2) {
					
					int div=num1/num2;
					return div;
				
				
	}
	}


