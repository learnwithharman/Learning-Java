class Calculator {
    public int add(int num1, int num2) {
        int r = num1 + num2;
        return r;
    }
}
public class ObjClass {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(4,5);
        System.out.println("Result: " + result);
    }
    
}