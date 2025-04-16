package org.example;

public class Wall {

    private double height;
    private double width;

    public Wall(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = Math.max(height, 0);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
        // this.width = Math.max(width, 0);
    }

    public double getArea() {
        return width * height;
    }
}
