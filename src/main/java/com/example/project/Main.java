package com.example.project;

import com.example.project.shapes.Rectangle;
import com.example.project.utils.MathUtils;

/**
 * Главный класс для запуска приложения.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        
        // Вывод площади
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
        
        // Вывод периметра
        System.out.println("Периметр прямоугольника: " + MathUtils.calculatePerimeter(rectangle));
    }
}
