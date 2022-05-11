package xml.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{


//
//	@Override
//	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
//		System.out.println("\n- in AfterAdvice -");
//	}
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		
		System.err.println("\n- in AfterAdvice -");
		System.err.println("Method: " + method.getName());
		System.err.println("Target: " + target.getClass().getName());
		Double number = (Double) args[0];
		System.out.println("Argument" + number);
		Double returnedValue = (Double) returnValue;
		System.err.println("Returned Value: " + returnedValue);
		System.err.println("- in AfterAdvice -");
		
		//yukarıda bizim beforeadvice la gelenleri yani method adını,
		//arguman sayısını, target bilgileriyle birlikte almış oluyoruz.
	}

}
