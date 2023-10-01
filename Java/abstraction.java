abstract class Animal{//animal class ko deikhane ki zaroorat he nhi aur waise bhi animal class ka koi object toh banega nhi
    abstract void walk();//function made abstract
    Animal(){
        System.out.println("You are creating a new Animal");
    }
    public void eats() {
        System.out.println("Animal Eats");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk() {
        System.out.println("Walks on four legs");
    }
}
class Chicken extends Animal{
    public void walk() {
        System.out.println("Walks on two legs");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.walk();
        // Animal animal=new Animal() ;//run time error
        // animal.walk();
        h1.eats();
    }
}
