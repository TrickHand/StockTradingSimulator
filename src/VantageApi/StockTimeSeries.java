package VantageApi;

import ApiKey.ApiKey;
import Objects.JsonToObjectParser;
import Objects.Result;
import VantageApi.VantageApiParamEnums.*;

import javax.json.JsonObject;

public class StockTimeSeries {
    public static Result getTime_Series_Intraday(Symbol symbol, Interval interval) {
        return getTime_Series_Intraday(symbol, interval, Outputsize.COMPACT, Datatype.JSON);
    }

    public static Result getTime_Series_Intraday(Symbol symbol, Interval interval, Outputsize outputsize) {
        return getTime_Series_Intraday(symbol, interval, outputsize, Datatype.JSON);
    }

    public static Result getTime_Series_Intraday(Symbol symbol, Interval interval, Datatype datatype) {
        return getTime_Series_Intraday(symbol, interval, Outputsize.COMPACT, datatype);
    }

    public static Result getTime_Series_Intraday(Symbol symbol, Interval interval, Outputsize outputsize, Datatype datatype) {
        String requestString = RequestStringBuilder(Function.TIME_SERIES_INTRADAY, symbol, interval, outputsize, datatype);
        JsonObject obj = VantageApiRequests.RequestData(requestString);
        return JsonToObjectParser.parseJsonToObject(obj, "Time Series (Intraday)");
    }


    public static Result getTime_Series_Daily(Symbol symbol) {
        return getTime_Series_Daily(symbol, Outputsize.COMPACT, Datatype.JSON);
    }

    public static Result getTime_Series_Daily(Symbol symbol, Outputsize outputsize) {
        return getTime_Series_Daily(symbol, outputsize, Datatype.JSON);
    }

    public static Result getTime_Series_Daily(Symbol symbol, Datatype datatype) {
        return getTime_Series_Daily(symbol, Outputsize.COMPACT, datatype);
    }

    public static Result getTime_Series_Daily(Symbol symbol, Outputsize outputsize, Datatype datatype) {
        String requestString = RequestStringBuilder(Function.TIME_SERIES_DAILY, symbol, outputsize, datatype);
        JsonObject obj = VantageApiRequests.RequestData(requestString);
        return JsonToObjectParser.parseJsonToObject(obj, "Time Series (Daily)");
    }


    public static Result getTime_Series_Weekly(Symbol symbol) {
        return getTime_Series_Weekly(symbol, Datatype.JSON);
    }

    public static Result getTime_Series_Weekly(Symbol symbol, Datatype datatype) {
        String requestString = RequestStringBuilder(Function.TIME_SERIES_WEEKLY, symbol, datatype);
        JsonObject obj = VantageApiRequests.RequestData(requestString);
        return JsonToObjectParser.parseJsonToObject(obj, "Time Series (Weekly)");
    }


    public static Result getTime_Series_Monthly(Symbol symbol) {
        return getTime_Series_Monthly(symbol, Datatype.JSON);
    }

    public static Result getTime_Series_Monthly(Symbol symbol, Datatype datatype) {
        String requestString = RequestStringBuilder(Function.TIME_SERIES_MONTHLY, symbol, datatype);
        JsonObject obj = VantageApiRequests.RequestData(requestString);
        return JsonToObjectParser.parseJsonToObject(obj, "Time Series (Monthly)");
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
