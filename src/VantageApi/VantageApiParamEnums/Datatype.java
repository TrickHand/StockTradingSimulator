package VantageApi.VantageApiParamEnums;

public enum Datatype {

    JSON("json"),
    CSV("csv");

    private final String urlParameter;

    Datatype(String urlParameter) {
        this.urlParameter = urlParameter;
    }
    public String getValue() {
        return "&datatype=" + urlParameter;
    }
}
