
public class calculator {
	private int a, b;
	
	//---[ Setters ]---
	// Setters used in case value restraints need to be applied
	public void setA(int a) {
		this.a = a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	//---[ Operator methods ]---
	public int addition() {
		return a + b;
	}
	
	public int subtraction() {
		return a - b;
	}
	
	public int multiplication() {
		return a * b;
	}
	
	public float division() {
		// Compares values before dividing to avoid error
		if (a < b) {
			System.out.println("Warning: Cannot divide by zero!");
			return 0;
		} else {
			return (float) a / (float) b;
		}
	}
	
	public int modulo() {
		// Same comparison as division()
		if (a < b) {
			System.out.println("Warning: Cannot divide by zero!");
			return 0;
		} else {
			return a % b;
		}
	}

}
