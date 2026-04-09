class animal{
    void sound(){
        System.out.println("Animal Makes Different Sounds"); 
    }
}
class dog extends animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("Cat meows");
    }
}
public class animalSound {
    public static void main (String[]args){
        dog d = new dog();
        d.sound();
        d.bark();
        cat c =new cat();
        c.sound();
        c.meow();
    }
}
