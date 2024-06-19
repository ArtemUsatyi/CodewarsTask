package patterns.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilderImpl()
                .setName("Артем")
                .setAge(30)
                .setLastName("Усатый")
                .builder();

        System.out.println(person);

        Person newPerson = new PersonBuilderImpl()
                .setName("Валерий")
                .builder();

        System.out.println(newPerson);
    }
}
