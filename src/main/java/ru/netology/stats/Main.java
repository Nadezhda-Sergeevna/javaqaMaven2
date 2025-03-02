package ru.netology.stats;

public class Main {
    public static void main(String[] args) {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        long total = service.sum(sales);
        System.out.println("Сумма всех продаж: " + total);

        long averageSale = service.average(sales);
        System.out.println("Средняя сумма продаж в месяц: " + averageSale);

        int maxSaleMonth = service.monthMaximumSale(sales);
        System.out.println("Месяц с максимальной суммой продаж: " + maxSaleMonth);

        int minSaleMonth = service.monthMinimumSale(sales);
        System.out.println("Месяц с минимальной суммой продаж: " + minSaleMonth);

        int countBelowAverage = service.monthsBelowAverage(sales);
        System.out.println("Количество месяцев с продажами ниже среднего: " + countBelowAverage);

        int countHigherAverage = service.monthsHigherAverage(sales);
        System.out.println("Количество месяцев с продажами выше среднего: " + countHigherAverage);
    }
}
