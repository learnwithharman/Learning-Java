public class TestAccess {

    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();

        System.out.println(obj.publicVar);      // ✅ allowed
        System.out.println(obj.protectedVar);   // ✅ same package
        System.out.println(obj.defaultVar);     // ✅ same package

        // System.out.println(obj.privateVar);  // ❌ ERROR: private not accessible

        obj.showInsideClass(); // private accessible through method
    }
}
