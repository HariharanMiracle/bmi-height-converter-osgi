//Function implementation
package bmi_height_converter;

public class HeightServiceImpl implements HeightService {

	@Override
	public double standardizedHeight(double height, String unit) {
		// TODO Auto-generated method stub
		double convertedValue = 0;
		
		if(unit.equalsIgnoreCase("m")) {
			convertedValue = height;
		}
		else if(unit.equalsIgnoreCase("cm")) {
			convertedValue = height / 100;
		}
		else if(unit.equalsIgnoreCase("inches")) {
			convertedValue = height * 2.54;
		}
		else if(unit.equalsIgnoreCase("km")) {
			convertedValue = height * 1000;
		}
		else {
			//invalid unit
			return -1;
		}
		
		if(convertedValue <= 0) {
			//invalid input
			return -1;
		}
		
		return convertedValue;
	}

}
