package com.company.value_and_reference;

public class Main {

    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        switcherObjectImmutable(a, b);          // gdybym przypisal wartosc tą do b to by zwrocił 10 - w innym wypadku 20 bo Integer jest immutable
        System.out.println(a);
        System.out.println(b);
        System.out.println("............");
        System.out.println(switcherObjectImmutable(a, b));

        Car car = new Car(20, "Mercedes");
        Car car1 = car;
        System.out.println(car.getName());
        switcherObjectMutable(car);
        System.out.println(car.getName());
        System.out.println(car1.getName());     // car1 rowniez sie zmieni mimo ze modyfikuje tylko car

        wrapp();
    }

    private static Integer switcherObjectImmutable(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
        return b;
    }

    private static void switcherObjectMutable(Car car) {
        car.setName("Polonez");
    }

    private static void wrapp() {

        System.out.println("\n\n-.-.-.-.-.-.-.-.-.-");

        String thisString = "103";
        System.out.println("\nthisString: " + thisString);

        int i = 5;
        System.out.println("\nint i: " + i);

        Integer integer = Integer.valueOf(i);
        System.out.println("\ninteger value: " + integer);

        Integer strinteger = Integer.valueOf(thisString);
        System.out.println("\nstrinteger value: " + strinteger);

        Integer integer2 = integer;
        System.out.println("\ninteger 2 value: "+integer2);

        integer = 89;
        System.out.println("\ninteger actual value: "+integer);
        System.out.println("integer 2 actual value: "+integer2);
    }
}
