// method overloading is a feature in java that allows a class to have more than one method with the same name, but different parameters. It is a way to achieve polymorphism in java. The main advantage of method overloading is that it increases the readability of the code and makes it easier to use.    

class calc{
    public int sum (int n1, int n2){
        return n1+n2;
    }
    public int sum (int n1, int n2, int n3){
        return n1+n2+n3;
    }
}
class methodoverloading {
public static void main(String[] args) {
    calc c= new calc();
    System.out.println(c.sum(5, 10));
    System.out.println(c.sum(5, 10, 15));
}}