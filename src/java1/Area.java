package java1;

public interface Area {
	
	void getArea(int length , int breadth);
	class Rectangle implements Area {
		@Override
		public void getArea(int length, int breadth) {
			// TODO Auto-generated method stub
			System.out.println("The area of rectangle " + (length * breadth));	
		}
	}

	class Square implements Area {
		@Override
		public void getArea(int length, int breadth) {
			// TODO Auto-generated method stub
			System.out.println("The area of square " + (2*length * breadth));	
		}
		

}
}
