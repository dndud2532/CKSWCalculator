
public class Calculator2 {
	

	public static void main(String[] args) {
		Calculator2 calculator = new Calculator2();
		
		int result = calculator.add(1, 2);
		System.out.println(result);
		int result1 = calculator.subtract(3, 2);
		System.out.println(result1);
	
	}
	private int subtract(int i, int j) {
		return i - j;
	}
	private int add(int i, int j) {
		return i + j;
	}
	

}






