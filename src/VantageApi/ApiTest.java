package VantageApi;

import VantageApi.VantageApiParamEnums.Interval;

public class ApiTest {
    public static void main(String[] args) {
        String tollerString = StockTimeSeries.getTime_Series_Intraday("MSFT", Interval.MINUTES_60);
        System.out.println(tollerString);
    }
}
