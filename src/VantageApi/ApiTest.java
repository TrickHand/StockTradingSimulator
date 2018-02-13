package VantageApi;

import Objects.Result;
import VantageApi.VantageApiParamEnums.Interval;
import VantageApi.VantageApiParamEnums.Symbol;

import static VantageApi.VantageApiParamEnums.Interval.MINUTES_60;

public class ApiTest {
    public static void main(String[] args) {
//        String intraday = StockTimeSeries.getTime_Series_Intraday(Symbol.Facebook, Interval.MINUTES_1);
//        System.out.println(intraday);

//        String daily = StockTimeSeries.getTime_Series_Daily(Symbol.Nintendo);
//        System.out.println(daily);

        Result weekly = StockTimeSeries.getTime_Series_Daily(Symbol.Nintendo);

//        String monthly = StockTimeSeries.getTime_Series_Daily(Symbol.Nintendo);
//        System.out.println(monthly);
    }
}
