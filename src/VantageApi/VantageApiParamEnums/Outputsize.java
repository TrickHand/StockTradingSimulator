package VantageApi.VantageApiParamEnums;

public enum Outputsize {
    COMPACT("compact"),
    FULL("60min");


    private final String urlParameter;

    Outputsize(String urlParameter) {
        this.urlParameter = urlParameter;
    }

    public String getValue() {
        return "&outputsize=" + urlParameter;
    }
}
