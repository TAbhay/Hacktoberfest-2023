interface Animal{
    int eyes=2;//this will be fixed for every animal,we cannot change it. It will remain Static,final and public
    void walk();
}
interface Herbivore{

}
class Horse implements Animal,Herbivore{//mutiple inheritance
    public void walk(){//implementing walk here
       System.out.println("Walks on four legs");
    }
}
public class interfaces {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
    }
}
