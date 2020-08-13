package singlelevel;

public class B implements C {

	public static void main(String[] args) {
		
		B obj = new B();
		System.out.println("A : " + obj.add());
		System.out.println("C : " + obj.Multi());
		
	}


	@Override
	public int add() {
		int a = 3;
		a = a + 6;
		return a;
	}


	@Override
	public int Multi() {
		int a = 5;
		int b = 7;
		
		return a*b;
	}

}
