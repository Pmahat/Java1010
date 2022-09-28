package java1;

class Father1{
	String fFirstName;
	String fLastName;
	
	Father1(String fFirstName, String fLastName){
		this.fFirstName= fFirstName;
		this.fLastName= fLastName;
	}
	
	public void getName() {
		System.out.println(this.fFirstName + "" + this.fLastName);
	}
}

class Son extends Father1{
	String sFirstName;
	
	Son(String fFirstName, String fLastName, String sFirstName){
		super(fFirstName, fLastName);
		this.sFirstName= sFirstName;
		
	}
	public void getName() {
		System.out.println(this.sFirstName +"" + this.fFirstName+ "" + this.fLastName);
		super.getName();
	}
}

class Daughter1 extends Father1{
	String fDaughter;
	
	Daughter1(String fFirstName, String fLastName, String fDaughter){
		super(fFirstName, fLastName);
		this.fDaughter=fDaughter;
	}
	
	public void getName() {
		System.out.println(this.fDaughter+ ""+ this.fFirstName+ ""+ this.fLastName);
		super.getName();
	}
}

public class InheritanceS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Daughter1 an = new Daughter1("sher","singh", "an");
		an.getName();
		

	}

}
