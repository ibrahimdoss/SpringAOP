package contract;

import exception.NegativeParameterException;

public interface SqrtCalculator {

	public double calculate(double number) throws NegativeParameterException;
}
