package VantageApi.VantageApiParamEnums;

public enum Symbol {
    Microsoft_Corporation("MSFT"),
    Samsung("SSNLF"),
    Nintendo("NTDOY"),
    Facebook("FB");


    private final String urlParameter;

    Symbol(String urlParameter) {
        this.urlParameter = urlParameter;
    }

    public String getValue() {
        return "&symbol=" + urlParameter;
    }
}
