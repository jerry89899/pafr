package presentation;

import domain.Motor;
import domain.Pullable;
import domain.Vehicle;

public interface Output {

	/**
	 *
	 * @param vehicle
	 */
	void showVehicle(Vehicle vehicle);

	/**
	 *
	 * @param vehicle
	 */
	void showNumseats(Vehicle vehicle);

	/**
	 * 
	 * @param motor
	 * @param vehicle
	 */
	void removeVehicleFromMotor(Motor motor, Pullable vehicle);

	void removeVehicle(Vehicle vehicle);

	void showErrorMessage(String message);

	void addVehicleToMotor(Motor motor, Pullable vehicle);
}