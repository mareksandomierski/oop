package task5;

public class Bike extends Vehicle {

    public Bike(String name){
        super(name);
        System.out.println("Tworzę obiekt typu Bike " +name);
    }

    @Override
    public void repair() {
        System.out.println("Napraw koła w rowerze.");
    }
}
