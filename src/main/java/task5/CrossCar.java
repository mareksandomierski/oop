package task5;

public class CrossCar extends Car {

    public CrossCar(String name){
        super(name);
        System.out.println("Tworzę obiekt typu CrossCar " +name);
    }

    @Override
    public void repair() {
        System.out.println("Wymień olej w silniku.");
    }

}
