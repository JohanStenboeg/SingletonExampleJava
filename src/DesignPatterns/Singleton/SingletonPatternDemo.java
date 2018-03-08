package DesignPatterns.Singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object1 = SingleObject.getInstance();
        object1.showMessage();
    }
}
