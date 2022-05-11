package com.SpringAop.Greeting.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	//@Override
	//public void before(Method method, Object[] args, Object target) throws Throwable {
		
	//	System.out.println("İbrahim");
	//}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		System.err.println("-  in BeforeAdvice -s");
		System.err.println("Method: " + method.getName());
		System.err.println("Target: " + target.getClass().getName());
		int length = args.length;
		System.err.println("There are " + length + " arguments.");
		System.err.println("Proceeding to the target");
	}
	
	//yukarıda bizim beforeadvice la gelenleri yani method adını,
	//arguman sayısını, target bilgileriyle birlikte almış oluyoruz.
	
}
