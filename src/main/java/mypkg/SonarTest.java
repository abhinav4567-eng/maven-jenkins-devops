package mypkg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SonarTest {
	
	private static final Logger logger = LoggerFactory.getLogger(SonarTest.class);
	
	public int sum(int a, int b) {
		
	
		
		return a+b;
		
		
	}

	public static void main(String[] args) {
		
		SonarTest st = new SonarTest();
		logger.info("Sum is: "+st.sum(10, 15));

	}

}
