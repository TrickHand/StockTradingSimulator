package VantageApi.VantageApiParamEnums;

public enum Interval implements ApiParameter{
    MINUTES_1("1min"),
    MINUTES_5("5min"),
    MINUTES_15("15min"),
    MINUTES_30("30min"),
    MINUTES_60("60min");


    private final String urlParameter;

    Interval(String urlParameter) {
        this.urlParameter = urlParameter;
    }

    public String getValue() {
        return "&interval=" + urlParameter;
    }
    }
