package oop;

public abstract class Shape {
    private String borderColor;
    private String fillColor;

    public Shape() {}

    public Shape(String borderColor, String fillColor) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public abstract double getPerimeter();
    public abstract double getArea();
    public abstract void showMe();
}
