package impl;

import contract.SqrtCalculator;
import exception.NegativeParameterException;

public class MathSqrtCalculator implements SqrtCalculator{

	@Override
	public double calculate(double number) throws NegativeParameterException {
		if (number < 0 ) 
			throw new NegativeParameterException(number);
		
		return Math.sqrt(number);
	}

}
