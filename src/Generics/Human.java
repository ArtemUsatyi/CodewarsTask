package Generics;

public interface Human {
    default void method() {
        System.out.println("Привет");
    }

    public void method2();

}
