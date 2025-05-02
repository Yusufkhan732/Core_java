package explicitconstructorcalling;

public class B extends A{
	
	public B() {
		
		super(10); // using super keyword to call a constructor
		System.out.println("B 1 param constructor");
		
	}
}