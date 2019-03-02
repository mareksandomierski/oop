package task4;

public class PersonApp {

    public static void main(String[] args) {

        Person person = new Student();


        System.out.println(person instanceof Person);
        System.out.println(person instanceof Student);
        System.out.println(person instanceof Teacher);
        System.out.println(person instanceof Mammal);
       // System.out.println(person instanceof Integer);




    }
}
