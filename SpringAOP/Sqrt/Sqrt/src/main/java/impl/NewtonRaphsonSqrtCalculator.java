package impl;

import org.springframework.data.repository.query.Param;

import contract.SqrtCalculator;
import exception.NegativeParameterException;

public class NewtonRaphsonSqrtCalculator implements SqrtCalculator{
	
	* @param tFactorial(){}

	@Override
	public double calculate(double number) throws NegativeParameterException {
		if (tFactorial < 0 ) {
			return Double.NaN;
			
			double x1 = 0 ;
			double x0 = tFactorial / 2;
			double a = tFactorial;
			boolean finished = false;
			
			while (finished == false) {
				x1 = (x0 + (a / x0)) / 2;
				if (x1 > x0) {
					if ((x1 - x0) < 0.0005) {
						finished = true;
					}
					
				}else if (x0 > x1 ) {
					if ((x0 - x1) < 0.0005) {
						finished = true;
					}
				}
				x0 = x1;
			}
			return x1;

		}
		
	}

}
