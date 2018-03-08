package DesignPatterns.Singleton;

public class ClassicSingleton {
    private String name;

    private static ClassicSingleton instance;


    private ClassicSingleton() {
        this.name = "Bob";
        // Exists only to defeat instantiation.
    }

    public static ClassicSingleton getInstance() {
        if(ClassicSingleton.instance == null) {
            ClassicSingleton instance = new ClassicSingleton();
        }
        return ClassicSingleton.instance;
    }
}