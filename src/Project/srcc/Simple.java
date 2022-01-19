package Project.srcc;

public abstract class Simple implements Calculator {

	@Override
	public void add() {
		System.out.println("ADD");
		
	}

	@Override
	public void subs() {
		System.out.println("SUBSTRACT");
		
	}

	@Override
	public void multi() {
		System.out.println("MULTIPLE");
		
	}

	@Override
	public void div() {
		System.out.println("DIVIDE");
		
	}

	@Override
	public void mod() {
		System.out.println("MODULUS");
		
	}

}
