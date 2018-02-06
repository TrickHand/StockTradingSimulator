package VantageApi;

import ApiKey.ApiKey;
import VantageApi.VantageApiParamEnums.Function;

public class VantageApiRequestsParams {
    public String function;
    public String symbol;
    public String outputsize;
    public String datatype;
    public String apikey;

public VantageApiRequestsParams(){
    //todo Enums für die Parameter erstellen
    //todo key in externe File Auslagern
    this.function = "function=" + Function.TIME_SERIES_INTRADAY.getValue();
    this.symbol = "symbol=MSFT";
    this.apikey = ApiKey.getKey();
}
}
