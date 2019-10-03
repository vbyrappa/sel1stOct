package demo.SeleniumPractice;

public class Calculator {

		// Defining Add Method
		public void add(int a, int b){
			System.out.println(a+b);
		}
		public void subtract(int a, int b) {
			System.out.println(a-b);
		}
		public void multiply(int a, int b) {
			System.out.println(a*b);
		}
		public void divide(int a, int b){
			System.out.println(a/b);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Calculator basicCal = new Calculator();
			
			basicCal.add(10, 20);
			basicCal.subtract(20, 10);
			basicCal.multiply(10, 10);
			basicCal.divide(100, 10);
	}
}
