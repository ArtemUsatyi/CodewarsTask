package patterns.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilderImpl()
                .setName("�����")
                .setAge(30)
                .setLastName("������")
                .builder();

        System.out.println(person);

        Person newPerson = new PersonBuilderImpl()
                .setName("�������")
                .builder();

        System.out.println(newPerson);
    }
}
