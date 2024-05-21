package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    public void shouldCalculateAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.allSales(sales);

        assertEquals(actual, expected);
        System.out.println("Сумма всех продаж: " + actual + ".");
    }

    @Test
    public void shouldCalculateAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
        System.out.println("Средняя сумма продаж в месяц: " + actual + ".");
    }

    @Test
    public void shouldCalculateMaxSumMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
        System.out.println("Пик продаж (номер месяца): " + actual + ".");

    }

    @Test
    public void shouldCalculateMinSumMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
        System.out.println("Минимум продаж (номер месяца): " + actual + ".");

    }

    @Test
    public void shouldCalculateMonthsUnderAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.belowAverageSales(sales);

        Assertions.assertEquals(expected, actual);
        System.out.println("Продажи ниже среднего (кол-во месяцев): " + actual + ".");

    }

    @Test
    public void shouldCalculateMonthsAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.aboveAverageSales(sales);

        Assertions.assertEquals(expected, actual);
        System.out.println("Продажи выше среднего (кол-во месяцев): " + actual + ".");

    }
}
