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

    public void repair(){
        //wywołaj repair na wszystkich pojazdach
        //dla wszystkich pojazdów
        //napraw je
        //for(pojazd in pojazdy)
        //napraw pojazd => pojazd.napraw();

        for (Vehicle vehicle: vehicles) {
            vehicle.repair();
        }
    }


}
