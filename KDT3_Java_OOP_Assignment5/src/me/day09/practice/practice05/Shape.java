package me.day09.practice.practice05;

import java.util.Objects;

public abstract class Shape {
    final double PI = 3.14;
    protected Point centerPoint;

    public Shape() {
    }

    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public abstract void draw();
    public abstract void calculateArea(); //넓이를 구하는 메서드를 하위 클래스에서 재정의 하게끔 만들어놓음

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(centerPoint, shape.centerPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(centerPoint);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "centerPoint=" + centerPoint +
                '}';
    }
}