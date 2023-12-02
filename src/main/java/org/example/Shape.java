package org.example;

abstract class Shape {
    abstract double calculateArea();
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5.0;
        System.out.println("Circle Area: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle();
        rectangle.length = 4.0;
        rectangle.width = 3.0;
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

    }
}
class Rectangle extends Shape {
    double length;
    double width;

    @Override
    double calculateArea() {
        return length * width;
    }
}
class Circle extends Shape {
    double radius;
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}



