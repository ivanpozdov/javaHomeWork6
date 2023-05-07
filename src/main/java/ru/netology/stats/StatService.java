package ru.netology.stats;

public class StatService {
    public long salesAmount(long[] sales) {                       //сумма всех продаж
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public long AverRageSale(long[] sales) {                    //средняя сумма продаж в месяц
        return salesAmount(sales) / sales.length;
    }


    public int MaxSalesAmountMoth(long[] sales) {            //номер месяца, в котором был пик продаж
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;

            }

        }
        return month + 1;
    }

    public int MinSalesAmountMoth(long[] sales) {             //номер месяца, в котором был минимум продаж
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;

            }

        }
        return month + 1;

    }

    public int MonthMinOverAverage(long[] sales) {                        //количество месяцев, в которых продажи были ниже среднего
        int counter = 0;
        long AverRageSale = AverRageSale(sales);
        for (long sale : sales) {
            if (AverRageSale > sale) {
                counter++;
            }

        }
        return counter;
    }

    public int monthOverAverage(long[] sales) {                        //количество месяцев, в которых продажи были выше среднего
        int counter = 0;
        long AverRageSale = AverRageSale(sales);
        for (long sale : sales) {
            if (sale > AverRageSale) {
                counter++;
            }

        }
        return counter;
    }

}

