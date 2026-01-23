public class AccessDemo {

    public int publicVar = 10;        // accessible everywhere
    protected int protectedVar = 20;  // same package + child class
    int defaultVar = 30;              // same package only
    private int privateVar = 40;      // only inside this class

    public void showInsideClass() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar); // private works here
    }
}
