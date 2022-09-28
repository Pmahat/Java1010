package java1;

public class OverloadingEx {

	public static void AdditionOne(int a , int b) { 
		  System.out.println(a+b); 
		 } 
		 public static void AdditionOne(int a , int b,int c) { 
		  System.out.println(a+b+c); 
		 } 
		 public static void AdditionOne(int a , int b,int c, int d) { 
		  System.out.println(a+b+c+d); 
		 } 
		  
		 
		 public static void main(String[] args) { 
		  // TODO Auto-generated method stub 
		   
		  AdditionOne(1,2); 
		  AdditionOne(1,2,3); 
		  AdditionOne(1,2,3,4); 
		 
		 } 
		 

}
