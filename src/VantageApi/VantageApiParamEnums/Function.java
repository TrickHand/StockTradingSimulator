package VantageApi.VantageApiParamEnums;

public enum Function implements ApiParameter{
    TIME_SERIES_INTRADAY("TIME_SERIES_INTRADAY"),
    TIME_SERIES_DAILY("TIME_SERIES_DAILY"),
    TIME_SERIES_DAILY_ADJUSTED("TIME_SERIES_DAILY_ADJUSTED"),
    TIME_SERIES_WEEKLY("TIME_SERIES_WEEKLY"),
    TIME_SERIES_WEEKLY_ADJUSTED("TIME_SERIES_WEEKLY_ADJUSTED"),
    TIME_SERIES_MONTHLY("TIME_SERIES_MONTHLY"),
    TIME_SERIES_MONTHLY_ADJUSTED("TIME_SERIES_MONTHLY_ADJUSTED");

    private final String urlParameter;

    Function(String urlParameter) {
        this.urlParameter = urlParameter;
    }

    public String getValue() {
        return "function=" + urlParameter;
    }
}
