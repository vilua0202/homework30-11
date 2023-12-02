package org.example;

public class NewRectangle {
    private double length;
    private double width;
    public NewRectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }
    public NewRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public static void main(String[] args) {
        NewRectangle rectangle1 = new NewRectangle();
        NewRectangle rectangle2 = new NewRectangle(4.0, 3.0);
        NewRectangle rectangle= new NewRectangle();
        rectangle.setWidth(3.0);
        rectangle.setLength(4.0);
        System.out.println("Get lenght: "+ rectangle.getLength());
        System.out.println("Get width: "+ rectangle.getWidth());

    }
}
