package com.example.builder.level2;

public class Person {

    private final String name;
    private final int age;

    public Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public static NameSetter builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public interface NameSetter {

        OptionalFieldsSetter name(String name);

    }

    public interface OptionalFieldsSetter {

        OptionalFieldsSetter age(int age);

        Person build();

    }

    public static class Builder implements NameSetter, OptionalFieldsSetter {

        private String name;
        private int age;

        public Builder() {
        }

        public Builder name(String name) {
            this.name = name;

            return this;
        }

        public Builder age(int age) {
            this.age = age;

            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
