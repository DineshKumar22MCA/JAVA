package ABSTRACT;

public class B extends A{

	@Override
	void fun1() {
		System.out.println("fun-1 override from b");		
	}

	void fun3() {
		System.out.println("fun-3");
	}

	@Override
	void fun4() {
		System.out.println("fun-4 override from B");		
	}
}
