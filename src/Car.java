

public class Car {

	//instance variables for the class
	private String carMake;
	private String carModel;
	private int carYear;
	private double carPrice;
	

	public Car () {
		this.carMake = "Make";
		this.carModel = "Model";
		this.carYear = 0;
		this.carPrice = 0.00;
			
	}
	

	public String getCarMake() {		
		return carMake;
	}
	
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	
	public String getCarModel() {		
		return carModel;
	}
	
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	public int getCarYear() {
		return carYear;
	}
	
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	
	
public double getCarPrice() {
		return carPrice;
	}
	

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	
	public String toString() {

		return String.format("%1$-10s %2$-10s %3$-6d $%4$-10.2f", carMake, carModel, carYear, carPrice);
	}
	
	public Car (String carMake, String carModel, int carYear, double carPrice) {
		this.carMake = carMake;
		this.carModel = carModel;
		this.carYear = carYear;
		this.carPrice = carPrice;
	}

	
}