
public class Calculator2 {
	

	public static void main(String[] args) {
		Calculator2 calculator = new Calculator2();
		int result = calculator.add(1, 2);
		System.out.println(result);
		
		result = calculator.subtract(3, 2);
		System.out.println(result);
		
		result = calculator.multiply(2, 1);
		System.out.println(result);
		
		result = calculator.divide(4, 2);
		System.out.println(result);
	
	}
	private int divide(int i, int j) {
		// TODO Auto-generated method stub
		return i /j;
	}
	private int multiply(int i, int j) {
		// TODO Auto-generated method stub
		return i * j;
	}
	private int subtract(int i, int j) {
		return i - j;
	}
	private int add(int i, int j) {
		return i + j;
	}
	

}






