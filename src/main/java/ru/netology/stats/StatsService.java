package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {  // [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        long totalSale = sum(sales);
        long averageSale = totalSale / 12;
        return averageSale;
    }

    public int monthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) {
                monthMaximum = i;
            }
        }
        return monthMaximum + 1;

    }

    public int monthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMinimum]) {
                monthMinimum = i;
            }
        }
        return monthMinimum + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsHigherAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }

}