package day11.generics;

class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

public class GenericClassesDemo {
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        b.set("Hello");
        b.set("50");
        System.out.println(b.get());

        Box<Integer> b2 = new Box<>();
    }
}
