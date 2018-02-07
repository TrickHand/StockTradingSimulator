package VantageApi.VantageApiParamEnums;

public enum Outputsize implements ApiParameter{
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
