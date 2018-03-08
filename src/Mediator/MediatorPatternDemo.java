package Mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User mads = new User("Mads");
        User mikkel = new User("Mikkel");

        mads.sendMessage("Hi! Mikkel");
        mikkel.sendMessage("Hi! Mads");
    }
}
