package VantageApi;

import ApiKey.ApiKey;
import VantageApi.VantageApiParamEnums.*;

public class StockTimeSeries {
    public static String getTime_Series_Intraday(Symbol symbol, Interval interval) {
        return getTime_Series_Intraday(symbol, interval, Outputsize.COMPACT, Datatype.JSON);
    }

    public static String getTime_Series_Intraday(Symbol symbol, Interval interval, Outputsize outputsize) {
        return getTime_Series_Intraday(symbol, interval, outputsize, Datatype.JSON);
    }

    public static String getTime_Series_Intraday(Symbol symbol, Interval interval, Datatype datatype) {
        return getTime_Series_Intraday(symbol, interval, Outputsize.COMPACT, datatype);
    }

    public static String getTime_Series_Intraday(Symbol symbol, Interval interval, Outputsize outputsize, Datatype datatype) {
        String requestString = RequestStringBuilder(Function.TIME_SERIES_INTRADAY, symbol, interval, outputsize, datatype);
        return VantageApiRequests.RequestData(requestString);
    }

    public static String RequestStringBuilder(Function function, ApiParameter... parameters) {
        StringBuilder requestParams = new StringBuilder();
        requestParams.append(function.getValue());
        for (ApiParameter param : parameters) {
            requestParams.append(param.getValue());
        }
        requestParams.append(ApiKey.getKey());
        return requestParams.toString();
    }
}
