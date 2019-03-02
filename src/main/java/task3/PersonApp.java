package task3;

public class PersonApp {

    public static void main(String[] args) {

//      Person p0 = null;
//      Person p1 = new Person();
//      p1 = new Person();

//        new Person();
//        Person p1 = new Person();
//        Person p2 = p1;


        Person jan = new Person("Jan", "Kowalski");
        //Person michal = new Person("Michał", "Kowalski");

        System.out.println(jan.getName());

        changeToRomek(jan);

        System.out.println(jan.getName());



    }

    private static void changeToRomek(Person person) {
        person.setName("Romek");
    }

}
