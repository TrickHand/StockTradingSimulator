package VantageApi;

import VantageApi.VantageApiParamEnums.Interval;
import VantageApi.VantageApiParamEnums.Symbol;

import static VantageApi.VantageApiParamEnums.Interval.MINUTES_60;

public class ApiTest {
    public static void main(String[] args) {
        String tollerString = StockTimeSeries.getTime_Series_Intraday(Symbol.Facebook, Interval.MINUTES_60);
        System.out.println(tollerString);
    }
}
