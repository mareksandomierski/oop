package task5;

public class CarApp {
    public static void main(String[] args) {

        Vehicle ferrari = new SportCar();
        Vehicle jeep = new CrossCar();
        Bike bike = new Bike();


        //zrób garaż
        Garage garage = new Garage();

        //zaparkuj ferrari
        garage.park(ferrari);
        //garage.park(new SportCar());


        //zaparkuj jeep
        garage.park(jeep);

        //zaparkuj rower
        garage.park(bike);

        //zobacz ile mam pojazdow
        System.out.println(garage.size());

    }
}
