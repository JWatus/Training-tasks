package com.company.value_and_reference;

import java.util.Objects;

public class Car {

    private int age;
    private String name;

    public Car() {
    }

    public Car(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getAge() == car.getAge() &&
                Objects.equals(getName(), car.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getAge(), getName());
    }
}
