package INHERITANCE_HIERARCHICAL;

public class mother extends father {
	
	private int jewel = 1; 
	
	mother(){
		
		super();
		System.out.println(super.cash);
		super.money();
		System.out.println(this.jewel);
		System.out.println("moms construcor");
	}

}
