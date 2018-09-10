package com.company.value_and_reference;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {

    private String type;
    private BigDecimal price;
    private int age;
    private String name;

    public Car() {
    }

    public Car(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age &&
                Objects.equals(type, car.type) &&
                Objects.equals(price, car.price) &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price, age, name);
    }
}
