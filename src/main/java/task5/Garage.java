package task5;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    List<Vehicle> vehicles;

    Garage() {
        vehicles = new ArrayList<Vehicle>();
    }

    public void park(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public int size(){
        return vehicles.size();

    }

}
