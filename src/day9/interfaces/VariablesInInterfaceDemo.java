package day9.interfaces;

/*
    variables -> public static final
 */

interface Config {
    int MAX_USERS = 100; // public, static and final by default
}

class App implements Config {
    public void showLimit() {
        System.out.println("Max users allowed: " + MAX_USERS);
    }
}

public class VariablesInInterfaceDemo {
    public static void main(String[] args) {
        App a = new App();
        a.showLimit();
        System.out.println(Config.MAX_USERS);
    }
}
