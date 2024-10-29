package com.example.project.shapes;

/**
 * Класс, представляющий прямоугольник.
 */
public class Rectangle {
    private double width;
    private double height;

    /**
     * Создает новый прямоугольник с заданными параметрами.
     *
     * @param width ширина прямоугольника
     * @param height высота прямоугольника
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Вычисляет площадь прямоугольника.
     *
     * @return площадь прямоугольника
     */
    public double calculateArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
