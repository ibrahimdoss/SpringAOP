package com.SpringAop.Greeting.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{


//
//	@Override
//	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
//		System.out.println("İbrahimAfter");
//		
//		//Bunun before'dan farkı return value alabilir ama değiştiremezsin.
//		//yani metot çalışmış bitmiş.
//		
//		//Çalışma sırası ise 
//		//returnValue döndürülüyor.
//		//hangi metot çalışma
//		//hangi argümanlarla
//		//hangi targetla gibi bilgileri alarak çalışıyor.
//	}
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		
		System.err.println("\n- in AfterAdvice -");
		System.err.println("Method: " + method.getName());
		System.err.println("Target: " + target.getClass().getName());
		int length = args.length;
		System.err.println("There are " + length + " arguments.");
		System.err.println("Returned Value: " + returnValue);
		System.err.println("- in AfterAdvice -");
		
		//yukarıda bizim beforeadvice la gelenleri yani method adını,
		//arguman sayısını, target bilgileriyle birlikte almış oluyoruz.
	}

}
