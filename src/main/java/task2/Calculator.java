package task2;

public class Calculator {

    //oop
    Integer add(Integer a, Integer b){
        Integer result = a + b;
        return result;
    }

    public static void main(String[] args) {
        Calculator.addStatic(2, 5);
        System.out.println(addStatic(2,5));
    }

    //static
    static Integer addStatic(Integer c, Integer d) {
        Integer result = c + d;
        return result;
    }

    //======================================================//

    int result;

    public void add(int i) {
        result += i;
    }

    public int getresult() {
        return result;
    }
}
