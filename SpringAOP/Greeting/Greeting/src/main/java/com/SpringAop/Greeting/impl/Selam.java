package com.SpringAop.Greeting.impl;

import com.SpringAop.Greeting.contract.Greeter;

public class Selam implements Greeter{

	@Override
	public void greter() {
		System.out.println("Selam");
	}
	
	//greet methodu joinpointtir.

}
