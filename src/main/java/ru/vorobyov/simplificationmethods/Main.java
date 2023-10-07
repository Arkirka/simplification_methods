package ru.vorobyov.simplificationmethods;

import ru.vorobyov.simplificationmethods.algorithms.GeometricSimplification;

public class Main {
    public static void main(String[] args) {
        /*if (args.length < 3)
            throw new IllegalArgumentException("Введено менее 3-х аргументов");*/

        GeometricSimplification geometricSimplification = new GeometricSimplification(36);
        geometricSimplification.process();

        System.out.println("Готово! Хорошшшш! Мужчина!");
    }
}
