package presentation;

import domain.Motor;
import domain.Pullable;
import domain.Vehicle;
import domain.VehicleFactory;

import java.util.Collection;

public class VehicleController {

	/**
	 * User interfaces
	 */
	private Collection<Output> outputs;
    public VehicleController(Collection<Output> outputs){
        this.outputs = outputs;
    }
	/**
	 *
     * @param seats
     */
	public void getNumSeats(String id) {
	    Vehicle vehicle = getVehicleById(id);
	    if(vehicle != null){
			for (Output output: outputs) { // send number of seats to outputs.
				output.showNumseats(vehicle);
			}
		}

    }

	/**
	 * 
	 * @param motorId
	 * @param vehicleId
	 */
	public void addVehicleToMotor(String motorId, String vehicleId) {
	    try {
            Motor motor = (Motor) getVehicleById(motorId);
            Pullable vehicle = (Pullable) getVehicleById(vehicleId);
            if(vehicle.getPulledBy() != null)
                vehicle.getPulledBy().removeVehicle(vehicle); // verwijder zichzelf eerst van de oude  motor
			motor.addVehicle(vehicle); // voeg het voertuig nu toe aan de motor
			vehicle.setPulledBy(motor); // voeg het nieuwe voertuig toe.
			for (Output output :
					outputs) {
				output.addVehicleToMotor(motor, vehicle);
			}


        } catch (NullPointerException e){
	        showErrorMessage("Eén van de twee voertuigen bestaat niet");
        } catch (ClassCastException e){
	    	showErrorMessage("Je kunt deze twee niet aan elkaar koppelen");
		}
	}

	/**
	 *
	 * @param vehicleType
	 * @return
	 */
	public void createVehicle(String vehicleType, Integer wheels, String id) {
	    Vehicle vehicle = vehicleExistsById(id);
		if(vehicle == null){
			vehicle = VehicleFactory.getVehicle(vehicleType,wheels,id);
			for (Output output:
					outputs) {
				output.showVehicle(vehicle);

			}
		} else {
		    showErrorMessage(vehicleType + " bestaat al");
        }


	}

	/**
	 *
	 * @param id
	 */
	public void removeVehicle(String id) {
		Vehicle vehicle = getVehicleById(id);
		VehicleFactory.getVehicles().remove(vehicle);
		if(vehicle instanceof Pullable)
			((Pullable) vehicle).getPulledBy().removeVehicle((Pullable) vehicle);
        for (Output output:
             outputs) {
            output.removeVehicle(vehicle);
        }
	}

	/**
	 *
	 * @param motorId
	 * @param vehicleId
	 */
	public void removeVehicleFromMotor(String motorId, String vehicleId) {
	    try {
            Motor motor = (Motor) getVehicleById(motorId);
            Pullable vehicle = (Pullable) getVehicleById(vehicleId);
            motor.removeVehicle(vehicle);
            vehicle.setPulledBy(motor);
            for (Output output : outputs){
                output.removeVehicleFromMotor(motor, vehicle);
            }
        }
		catch (NullPointerException e){
	        showErrorMessage("Eén van de twee voertuigen bestaat niet.");
        }
	}

	/**
	 *
	 * @param id
	 * @return
	 */
	private Vehicle vehicleExistsById(String id){
        Collection<Vehicle> vehicles = VehicleFactory.getVehicles();
        Vehicle found = null;
        for (Vehicle vehicle: vehicles) {
            if(vehicle.getId().equals(id)){
                found = vehicle;
            }
        }
        return found;
    }
	private Vehicle getVehicleById(String id){
		Vehicle found = null;
		try {
            found = this.vehicleExistsById(id);
            if(found == null)
                throw new NullPointerException();
        }
        catch (NullPointerException e){
		    showErrorMessage("voertuig bestaat niet met meegegeven ID");

        }

		return found;
	}

    private void showErrorMessage(String message){
        for (Output output:
             outputs) {
            output.showErrorMessage(message);
        }
    }
}