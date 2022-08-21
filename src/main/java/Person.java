import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age;
    protected String address;

    private boolean hasAge;
    private boolean hasAddress;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Person(PersonBuilder personBuilder) {
        name = personBuilder.name;
        surname = personBuilder.surname;
        age = personBuilder.age;
        address = personBuilder.address;

    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public boolean hasAge() {
        if (age != null) {
            hasAge = true;
        }
        return hasAge;
    }

    public boolean hasAddress() {
        if (address != null) {
            hasAddress = true;
        }
        return hasAddress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public PersonBuilder newChildBuilder() {

        return new PersonBuilder();
    }

    @Override
    public String toString() {
        String info = name;
        if (surname != null) info = info + " " + surname;
        if (age != null) info = info + " возраст " + age;
        if (address != null) info = info + ", проживающий(ей) в городе " + address;
            return info;
    }
}
