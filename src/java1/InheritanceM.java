package java1;



class GrandFather{
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


class Father extends GrandFather{
	
	String fFirstName;
	
	Father(String firstName, String lastName, String fFirstName){
		super(firstName,lastName);
		this.fFirstName = fFirstName;
	}
	
	@Override
	public void displayName() {
		System.out.println(this.fFirstName + " "+ this.firstName + " "+this.lastName);
		super.displayName();
	}
	
	
}

class Daughter extends Father{
	String fDaughter;

	Daughter(String firstName, String lastName, String fFirstName, String fDaughter) {
		super(firstName, lastName, fFirstName);
		this.fDaughter= fDaughter;
	
		// TODO Auto-generated constructor stub
	}
	
	public void displayName() {
		System.out.println(this.fDaughter + " " + this.fFirstName + " " + this.lastName);
		super.displayName();
	}
	
}

public class InheritanceM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Daughter angel = new Daughter("Sher" , "Mahat", "Singh", "Angel");
		angel.displayName();
		

	}

}
