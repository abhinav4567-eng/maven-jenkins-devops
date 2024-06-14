package mypkg;

public class Calculator {
	
	public int sum(int a, int b) {
		return a+b;
		}
	
	public int sub(int a, int b) {
	       return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator ob = new Calculator();
		System.out.println("Sum is "+ob.sum(20, 10));
		System.out.println("Sub is "+ob.sub(20, 10));
		System.out.println("Mul is "+ob.mul(20, 10));
		System.out.println("Div is "+ob.div(20, 10));
        
	}

}
