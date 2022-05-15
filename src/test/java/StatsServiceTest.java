import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    public void shouldSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMean() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float actualmean = service.mean(sales);
        float expectedmean = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        assertEquals(expectedmean, actualmean);
    }

    @Test
    public void shouldmaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualmaxSales = service.maxSales(sales);
        int expectedmaxSales = 8;
        assertEquals(expectedmaxSales, actualmaxSales);
    }

    @Test
    public void shouldminSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualminSales = service.minSales(sales);
        int expectedminSales = 9;
        assertEquals(expectedminSales, actualminSales);
    }

    @Test
    public void shouldcountmean() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualcountmean = service.countmean(sales);
        int expectedcountmean = 5;
        assertEquals(expectedcountmean, actualcountmean);
    }

    @Test
    public void shouldcountmoremean() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualcountmoremean = service.countmoremean(sales);
        int expectedcountmoremean = 5;
        assertEquals(expectedcountmoremean, actualcountmoremean);
    }

}
