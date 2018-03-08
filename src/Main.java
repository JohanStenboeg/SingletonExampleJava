public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        ClassicSingleton s1 = ClassicSingleton.getInstance();
        ClassicSingleton s2 = ClassicSingleton.getInstance();

        if(s1 == s2) {
            System.out.println("S1 and S2 are equal");
        }
        else{
            System.out.println("S1 and S2 are not equal");
        }
    }
}
