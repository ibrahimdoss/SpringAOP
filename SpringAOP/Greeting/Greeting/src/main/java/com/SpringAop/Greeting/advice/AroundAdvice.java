package com.SpringAop.Greeting.advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor{


//	@Override
//	public Object invoke(MethodInvocation invocation) throws Throwable {
//		System.out.println("İbrahimAround ");
//		Object returnedValue = invocation.proceed();
//		System.out.println(", naber?");
//		return returnedValue;
//		
//		//Önce 10.satırdaki kodu çalıştırıyoruz. 
//		//11.satırda invocatione gidip çalıştırıyoruz varsa return değerini alıyoruz
//		//olması zorunlu değil.
//		//son kısımda da 12.satır çalışır.
//		// yani invocation methotta öncesinde ve sonrasında alınan değerler
//		//around edilmiş oluyor.
//	}
	

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.err.println("- Before -");
		Method method = invocation.getMethod();
		System.err.println("Method: " + method.getName());
		System.err.println("Target: " + invocation.getClass().getName());
		Object[] args = invocation.getArguments();
		int length = args.length;
		System.err.println("There are " + length + " arguments.");
		System.err.println("Proceeeding to the method");
		Object returnValue = invocation.proceed();
		System.err.println("\nJust returned from the method");
		System.err.println("Returned value: " + returnValue);
		System.err.println("- After -");
		return returnValue;
		
		
		//invocation method çağrısının abstract hali.
		//invocationa ilerledik proceed methodu ile.
		
	}


}
