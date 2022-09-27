package basicJava;

class PersonEx {
//	int age = 10;
//	String fullName = "pravesh Mahat";
	
	int age;
	String fullName;
	static String country  = "Nepal";
	
	public PersonEx(int age , String fn){
		this.age = age;
		this.fullName = fn;
	}
	
	public void walk() {
		System.out.println("I am walking today");
		System.out.println(this.fullName);
	}
	
	public static void Cal() {
		System.out.println("Straight out of class");
	}
	
	
	
	
}




public class RevisionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonEx sarikaP = new PersonEx(34,"Sarika K");
		PersonEx sarikaPa = new PersonEx(34,"Sarikaa O");
		
		System.out.println(sarikaPa.age);
		System.out.println(sarikaPa.fullName);
		
		sarikaPa.walk();
		PersonEx.Cal();
		System.out.println(PersonEx.country);

	}

}
