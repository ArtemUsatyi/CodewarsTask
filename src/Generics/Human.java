package Generics;

public interface Human {
    default void method() {
        System.out.println("������");
    }

    public void method2();

}
