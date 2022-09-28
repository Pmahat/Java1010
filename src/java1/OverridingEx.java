package java1;


public class OverridingEx {
	public void displayInfo() {
		System.out.println("Common programming language");
	}
}

class Java extends OverridingEx{
	
	@Override
	public void displayInfo() {
		System.out.println("Java language");
		super.displayInfo();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Java java = new Java();
		java.displayInfo();


	}

}
