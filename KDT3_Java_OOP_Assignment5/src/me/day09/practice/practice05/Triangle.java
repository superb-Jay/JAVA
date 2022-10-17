package me.day09.practice.practice05;

import java.util.Objects;

public class Triangle extends Shape implements GeometricController {
    private int base;
    private int height;

    public Triangle() {
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(Point centerPoint, int base, int height) {
        super(centerPoint);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(Triangle.class.getName() + " draw()");
    }

    @Override
    public void calculateArea() { //삼각형 넓이 구하는 공식 재정의
        System.out.println("삼각형의 넓이 : " + getBase()*getHeight()*0.5);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return base == triangle.base && height == triangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", centerPoint=" + centerPoint +
                '}';
    }

    @Override
    public void translate(int dx, int dy) { // 중점이동

        centerPoint.setX(centerPoint.getX()+dx);
        centerPoint.setY(centerPoint.getY()+dy);
    }

    @Override
    public void scale(int offset) { // 스케일링

        setBase(getBase()+offset);
        setHeight(getHeight()+offset);
    }
}