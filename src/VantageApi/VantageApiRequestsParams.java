package VantageApi;

public class VantageApiRequestsParams {
    public String function;
    public String symbol;
    public String outputsize;
    public String datatype;
    public String apikey;

public VantageApiRequestsParams(){
    //todo Enums für die Parameter erstellen
    //todo key in externe File Auslagern
    this.function = "function=TIME_SERIES_DAILY";
    this.symbol = "symbol=MSFT";
    this.apikey = "";
}
}
