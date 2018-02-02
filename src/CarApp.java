import java.util.LinkedList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int carNum;
		String userBuy;

		//Intro the program
		System.out.println("Welcome to the Grand Circus Sales Office");
		System.out.println();
		System.out.println("Car Inventory:");

		//Create LinkedList to store the inventory
		LinkedList<Object> carList = new LinkedList<Object>();
		carList.add(new Car("Nikolai", "Model S", 2017, 54999.90));
		carList.add(new Car("Fourd", "Escapade", 2017, 31999.90));
		carList.add(new Car("Chewie", "Vetter", 2017, 44989.95));
		carList.add(new UsedCar("Hyonda", "Prior", 2015, 14795.50, 35987.6));
		carList.add(new UsedCar("GC", "Chirpus", 2013, 8500.00, 12345.00));
		carList.add(new UsedCar("GC", "Witherell", 2016, 14450.00, 3500.3));
		carList.add("Quit");

		//Set up do-while loop to cycle through program unless user picks the "Quit" option
		do {
			
			//Set up for loop to list out inventory
			for (int i = 0; i < carList.size(); i++) {
				System.out.println(i + ".  " + carList.get(i));
			}
			System.out.println();
			System.out.println("Which car would you like?");
			carNum = scan.nextInt();
			scan.nextLine();

			//if-else statement to determine if user wants to buy the car 
			if ((carNum >= 0) && (carNum < carList.size() - 1)) {
				System.out.println(carList.get(carNum));
				System.out.println();
				System.out.println("Would you like to buy this car? (y/n)");
			} else {
				System.out.println("Have a great day!");
				break;
			}
			
			userBuy = scan.nextLine();

			//Second if-else to respond to First if-else statement
			if (userBuy.equalsIgnoreCase("y")) {
				System.out.println("Excellent!  Our finance department will be in touch shortly.");
				carList.remove(carNum);
				System.out.println();
			} else {
				System.out.println("Have a great day!");
				break;
			}

		} while (carNum != carList.size() + 1);
		

		scan.close();
	}

}
