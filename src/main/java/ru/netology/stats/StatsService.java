package ru.netology.stats;

public class StatsService {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        System.out.println(sum);
        return sum;
    }

    public float mean(long[] sales) {
        float mean = sales[0];
        for (long sale : sales) {
            mean = sum(sales) / 12;
        }
        System.out.println(mean);
        return mean;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        System.out.println(maxMonth);
        return maxMonth + 1;

    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        System.out.println(minMonth);
        return minMonth + 1;
    }

    public int countmean(long[] sales) {
        int countmean = 0;
        for (long sale : sales) {
            if (sale < mean(sales)) {
                countmean++;
            }
        }
        System.out.println(countmean);
        return countmean;
    }


    public int countmoremean(long[] sales) {
        int countmoremean = 0;
        for (long sale : sales) {
            if (sale > mean(sales)) {
                countmoremean++;
            }
        }
        System.out.println(countmoremean);
        return countmoremean;

    }
}
