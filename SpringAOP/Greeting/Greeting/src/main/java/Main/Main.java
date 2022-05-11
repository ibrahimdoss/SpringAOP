package Main;

import org.springframework.aop.framework.ProxyFactory;

import com.SpringAop.Greeting.advice.AfterAdvice;
import com.SpringAop.Greeting.advice.AroundAdvice;
import com.SpringAop.Greeting.advice.BeforeAdvice;
import com.SpringAop.Greeting.contract.Greeter;
import com.SpringAop.Greeting.impl.Hello;
import com.SpringAop.Greeting.impl.Selam;

public class Main {
	
	public static void main(String[] args) {
		
		Greeter target = new Selam();
		//Greeter target = new Hello();

		
		//runTarget(target);
		//runBeforeAdvice(target);
		//runAfterAdvice(target);
		//runAroundAdvice(target);
	}
	
	public static void runTarget ( Greeter target) {
		target.greter();
	}
	
	public static void runBeforeAdvice(Greeter target) {
		ProxyFactory factory = new ProxyFactory();
		factory.addAdvice(new BeforeAdvice()); //Weaving 
		factory.setTarget(target);
		Greeter proxy = (Greeter) factory.getProxy();
		proxy.greter();
	}
	
	public static void runAfterAdvice(Greeter target) {
		ProxyFactory factory = new ProxyFactory();
		factory.addAdvice(new AfterAdvice());
		factory.setTarget(target);
		Greeter proxy = (Greeter) factory.getProxy();
		proxy.greter();
	}
	
	public static void runAroundAdvice(Greeter target) {
		ProxyFactory factory = new ProxyFactory();
		factory.addAdvice(new AroundAdvice());
		factory.setTarget(target);
		Greeter proxy = (Greeter) factory.getProxy();
		proxy.greter();
	}
}
