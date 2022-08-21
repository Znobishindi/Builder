public class PersonBuilder {
    protected String name;
    protected String surname;
    protected Integer age;
    protected String address;



    public PersonBuilder(Person person) {
        name = person.name;
    }

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 110) {
            throw new IllegalArgumentException("Возраст " + age + " должен быть в пределах от 0 до 110");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if ((name == null) && (surname == null)) throw new IllegalStateException("Вы не указали имя и фамилию");
        if (name == null) throw new IllegalStateException("Вы не указали имя");
        if (surname == null) throw new IllegalStateException("Вы не указали фамилию");

        return new Person(this);
    }
}
