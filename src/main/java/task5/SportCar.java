package task5;

public class SportCar extends Car {

    public SportCar(String name){
        super(name);
        System.out.println("Tworzę obiekt typu SportCar " +name);
    }

    @Override
    public void repair() {
        System.out.println("Wymień świece w silniku.");
    }

}
