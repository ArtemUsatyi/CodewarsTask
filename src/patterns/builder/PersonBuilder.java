package patterns.builder;

public interface PersonBuilder {
    PersonBuilder setName(String name);

    PersonBuilder setAge(Integer age);

    PersonBuilder setLastName(String lastName);

    Person builder();
}
