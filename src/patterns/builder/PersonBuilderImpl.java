package patterns.builder;

public class PersonBuilderImpl implements PersonBuilder {
    Person person = new Person();

    @Override
    public PersonBuilder setName(String name) {
        person.setName(name);
        return this;
    }

    @Override
    public PersonBuilder setAge(Integer age) {
        person.setAge(age);
        return this;
    }

    @Override
    public PersonBuilder setLastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

    @Override
    public Person builder() {
        return person;
    }
}
