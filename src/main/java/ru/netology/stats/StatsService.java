package ru.netology.stats;

import java.util.stream.IntStream;

import static java.lang.Long.sum;

public class StatsService {

    public long allSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long averageSales(long[] sales) {
        if (sales.length == 0) {
            return 0;
        } else {
            return allSales(sales) / sales.length;
        }
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int month = 0; month < sales.length; month++) {
            if (sales[month] >= sales[maxMonth]) {
                maxMonth = month;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int month = 0; month < sales.length; month++) {
            if (sales[month] <= sales[minMonth]) {
                minMonth = month;
            }
        }
        return minMonth + 1;
    }

    public int belowAverageSales(long[] sales) {
        int monthsUnderAverage = 0;

        for (int month = 0; month < sales.length; month++) {
            if (sales[month] < averageSales(sales)) {
                monthsUnderAverage++;
            }
        }
        return monthsUnderAverage;
    }

    public int aboveAverageSales(long[] sales) {
        int monthsAboveAverage = 0;

        for (int month = 0; month < sales.length; month++) {
            if (sales[month] > averageSales(sales)) {
                monthsAboveAverage++;
            }
        }
        return monthsAboveAverage;
    }
}
