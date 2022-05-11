package xml.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	//@Override
	//public void before(Method method, Object[] args, Object target) throws Throwable {
		
	//	System.out.println( "- in BeforeAdvice -");
	//}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("-  in BeforeAdvice -s");
		System.out.println("Method: " + method.getName());
		System.out.println("Target: " + target.getClass().getName());
		Double number = (Double) args[0];
		System.out.println("Argument : " + number);
		System.out.println(" - in BeforeAdvice -");
	}
	
	//yukarıda bizim beforeadvice la gelenleri yani method adını,
	//arguman sayısını, target bilgileriyle birlikte almış oluyoruz.
	
}
