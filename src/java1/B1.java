package java1;

public interface B1 {
	
	void getMethodB11(String method1);
	void getMethodB22(String method2);
	void getMethodB33(String method3);

}

interface D1 {
	void getMethodD11(String method1);
	void getMethodD22(String method2);
	void getMethodD33(String method3);

}

class C1 implements B1,D1{

	@Override
	public void getMethodD11(String method1) {
		// TODO Auto-generated method stub
		System.out.println("dmethod11:"+method1);
		
	}

	@Override
	public void getMethodD22(String method2) {
		// TODO Auto-generated method stub
		System.out.println("dmethod22:"+method2);
		
	}

	@Override
	public void getMethodD33(String method3) {
		// TODO Auto-generated method stub
		System.out.println("dmethod33:"+method3);
		
	}

	@Override
	public void getMethodB11(String method1) {
		// TODO Auto-generated method stub
		System.out.println("bmethod11:"+method1);
		
	}

	@Override
	public void getMethodB22(String method2) {
		// TODO Auto-generated method stub
		System.out.println("bmethod22:"+method2);
		
	}

	@Override
	public void getMethodB33(String method3) {
		// TODO Auto-generated method stub
		System.out.println("dmethod33:"+method3);
		
	}
	
}
