package java1;

abstract class Vehicle {
	
	abstract void start(); 
	  
	 public void countryName() { 
	  System.out.println("Country is India"); 
	 } 
	  
	} 
	 
	class Maruti extends Vehicle { 
	 
	 @Override 
	 void start() { 
	  // TODO Auto-generated method stub 
	  System.out.println("I have a automatic start"); 
	 } 
	  
	} 
	 
	 
	 class program5 { 
	 
	 public static void main(String[] args) { 
	  // TODO Auto-generated method stub 
	   
	  Maruti m  = new Maruti(); 
	  m.start(); 
	  m.countryName(); 
	 
	 } 

}
