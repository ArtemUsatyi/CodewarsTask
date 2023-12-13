package CodeWars;

public class ParentsClass {
    private static String name = "Artem static";
    private String nameNo = "Artem no static";

    static {
        System.out.println(name);
        name = "NEW artem static";
        System.out.println(name);
    }

    {
        System.out.println(nameNo);
        nameNo = "NEW artem NO static";
        System.out.println(nameNo);
    }

    public ParentsClass() {
        System.out.println("Констуктор Родителя");
    }
}
