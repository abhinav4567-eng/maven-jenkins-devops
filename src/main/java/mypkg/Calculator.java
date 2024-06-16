package mypkg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Calculator {
	
	private static final Logger logger = LoggerFactory.getLogger(Calculator.class);
	
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
	
	public int mod(int a, int b) {
		return a%b;
	}
	
	public void display() {
		System.out.println("Welcome DevOps! jenkins");
	}
	
	public void display1() {
		System.out.println("Welcome DevOps! GitHub Actions");
	}
	
	
	public static void main(String[] args) {
		
		Calculator ob = new Calculator();
		logger.info("Sum is "+ob.sum(20, 10));
		logger.info("Sub is "+ob.sub(20, 10));
		logger.info("Mul is "+ob.mul(20, 10));
		logger.info("Div is "+ob.div(20, 10));
		logger.info("Modulus is added "+ob.mod(20, 10));
		logger.info("I am eating mangoes!");
        
	}

}
