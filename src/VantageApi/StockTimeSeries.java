package VantageApi;

import ApiKey.ApiKey;
import VantageApi.VantageApiParamEnums.Datatype;
import VantageApi.VantageApiParamEnums.Function;
import VantageApi.VantageApiParamEnums.Interval;
import VantageApi.VantageApiParamEnums.Outputsize;

public class StockTimeSeries {
    public static String getTime_Series_Intraday(String symbol, Interval interval) {
        return getTime_Series_Intraday(symbol, interval, Outputsize.COMPACT, Datatype.JSON);
    }

    public static String getTime_Series_Intraday(String symbol, Interval interval, Outputsize outputsize) {
        return getTime_Series_Intraday(symbol, interval, outputsize, Datatype.JSON);
    }

    public static String getTime_Series_Intraday(String symbol, Interval interval, Datatype datatype) {
        return getTime_Series_Intraday(symbol, interval, Outputsize.COMPACT, datatype);
    }

    public static String getTime_Series_Intraday(String symbol, Interval interval, Outputsize outputsize, Datatype datatype) {
        StringBuilder requestParams = new StringBuilder();
        requestParams.append(Function.TIME_SERIES_INTRADAY.getValue());
        requestParams.append("&symbol=" + symbol);
        requestParams.append(interval.getValue());
        requestParams.append(outputsize.getValue());
        requestParams.append(datatype.getValue());
        requestParams.append(ApiKey.getKey());
        return VantageApiRequests.RequestData(requestParams.toString());
    }
}
