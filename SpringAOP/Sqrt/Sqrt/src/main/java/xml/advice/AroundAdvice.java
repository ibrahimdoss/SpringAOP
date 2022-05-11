package xml.advice;

import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor{


	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println(" \n- in AroundAdvice -");
		Instant start = Instant.now();
		Object returnedValue = invocation.proceed();
		Instant end = Instant.now();
		long ns = Duration.between(start, end).toNanos(); //performans icin kullanulabilir.
		System.out.println("Period: " + ns + " ns.");
		System.out.println(" - in AroundAdvice -\n");
		return returnedValue;
		
}
	

//	@Override
//	public Object invoke(MethodInvocation invocation) throws Throwable {
//		
//		System.err.println("- Before -");
//		Method method = invocation.getMethod();
//		System.err.println("Method: " + method.getName());
//		System.err.println("Target: " + invocation.getClass().getName());
//		Object[] args = invocation.getArguments();
//		Double number = (Double) args[0];
//		System.err.println(" arguments." + number);
//		System.err.println("Proceeeding to the method");
//		Object returnValue = invocation.proceed();
//		System.err.println("\nJust returned from the method");
//		System.err.println("Returned value: " + returnValue);
//		System.err.println("- After -");
//		return returnValue;
//		
//		
//		//invocation method çağrısının abstract hali.
//		//invocationa ilerledik proceed methodu ile.
//		
//	}


}
