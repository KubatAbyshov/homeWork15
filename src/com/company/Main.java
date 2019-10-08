package com.company;

public class Main {

    public static void main(String[] args) {

        Box<Double, Integer> box1 = new Box<>(5.0, 5);
        Box<Float, Float> box2 = new Box<>(5f, 5f);
        addition(box1, box2);
        multiplication(box1, box2);
    }

    public static void addition(Box<? extends Number, ? extends Number> b, Box<? extends Float, ? extends Float> b2) {
        System.out.println(b.getNumber1().doubleValue() + b.getNumber2().intValue() +
                b2.getNumber1().floatValue() + b2.getNumber2().floatValue());

    }

    public static void multiplication(Box<? extends Number, ? extends Number> b, Box<? extends Float, ? extends Float> b2) {
        System.out.println((b.getNumber1().doubleValue() * b.getNumber2().intValue()) +
                (b2.getNumber1().floatValue() * b2.getNumber2().floatValue()));

    }

}

class Box<T extends Number, S extends Number> {

    T number1;
    S number2;

    public T getNumber1() {
        return number1;
    }

    public S getNumber2() {
        return number2;
    }

    public Box(T number1, S number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
}
