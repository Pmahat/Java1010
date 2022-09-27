package basicJava;

class GrandFather {
	
	String firstName;
	String lastName;
	
	// constructor
	GrandFather(String firstName , String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void displayName() {
		System.out.println(this.firstName + " "+ this.lastName );
	}
	
}

class Father extends GrandFather {
	
	String fFirstName;
	// If parent is having constructor , we need to have constructor in child as well
	// In child constructor first line should be call to parent constructor using super
	
	Father(String firstName ,String lastName ,String fFirstName){
		super(firstName,lastName);
		this.fFirstName = fFirstName;
	}
	@Override
	public void displayName() {
		System.out.println(this.fFirstName + " "+ this.firstName + " "+this.lastName);
		super.displayName();
	}
	
}
// Class son 
class Son extends Father{
	
	String sFirstName;
	
	Son(String firstName ,String lastName ,String fFirstName,String sFirstName ){
		super(firstName, lastName, fFirstName);
		this.sFirstName= sFirstName;
	}
	
	@Override
	public void displayName() {
		System.out.println(this.sFirstName + " " + this.fFirstName + " " + this.lastName);
		super.displayName();
	}
}




public class InheritanceMultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		GrandFather manohar = new GrandFather("manohar","deshpande");
//		manohar.displayName();
		
	//	Father shirish = new Father("manohar","deshpande","shirish");
	//	shirish.displayName();
		
		Son chinmay = new Son("manohar" , "deshpande", "shirish", "chinmay");
		chinmay.displayName();

	}

}
