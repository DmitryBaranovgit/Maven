package com.example.project.utils;

import com.example.project.shapes.Rectangle;

/**
 * Утилитный класс для математических операций.
 */
public class MathUtils {

    /**
     * Вычисляет периметр прямоугольника.
     *
     * @param rectangle прямоугольник, для которого нужно вычислить периметр
     * @return периметр прямоугольника
     */
    public static double calculatePerimeter(Rectangle rectangle) {
        return 2 * (rectangle.getWidth() + rectangle.getHeight());
    }
}
