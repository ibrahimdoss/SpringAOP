package com.SpringAop.Greeting.impl;

import com.SpringAop.Greeting.contract.Greeter;

public class Hello implements Greeter{

	@Override
	public void greter() {
		System.out.println("Hello");
	}

}
