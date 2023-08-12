package ABSTRACT;

abstract class car {
	
	abstract void mileg();

}

class audi extends car {

	@Override
	void mileg() {
		System.out.println("milege 20");
	}

	
}

class bmw extends car{

	@Override
	void mileg() {
		System.out.println("milege 25");
	}
	
}

public class D {
	
	public static void main (String args[]) {
		
		audi o1 = new audi();
		o1.mileg();
		
		bmw o2 = new bmw ();
		o2.mileg();
	}
	
	
	

}

