
public class UsedCar extends Car {

	private double carMileage;

	public UsedCar() {

	}

	public UsedCar(String carMake, String carModel, int carYear, double carPrice, double carMileage) {
		super(carMake, carModel, carYear, carPrice);
		this.carMileage = carMileage;
	}

	public double getCarMileage() {
		return carMileage;
	}

	public void setCarMileage(int carMileage) {
		this.carMileage = carMileage;
	}

	public String toString() {
		return String.format("%1$-10s %2$-10s %3$-6d $%4$-10.2f %5$-10.2fmiles" + "\t(Used)", super.getCarMake(),
				super.getCarModel(), super.getCarYear(), super.getCarPrice(), carMileage);
	}

}
