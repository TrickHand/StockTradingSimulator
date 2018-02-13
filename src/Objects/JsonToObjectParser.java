package Objects;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.InputStream;

public class JsonToObjectParser {
    private static JsonReader jsonReader;

    public static Result parseJsonToObject(InputStream is){
        jsonReader = Json.createReader(is);
        JsonObject obj = jsonReader.readObject();
        jsonReader.close();
        Result res = new Result();
        res.setMetaData(getMetaData(obj));
        res.setTimeSeries(getTimeSeries(obj));

        return res;
    }

    /**
     * extracts the metadata from the JsonObject and returns it
     * as a MetaData Object
     * @param jso JsonObject from which data should be extracted
     * @return MetaData as Object for Result Object
     */
    private static MetaData getMetaData(JsonObject jso){
        MetaData tmp = new MetaData();
        JsonObject jsoMetadata = jso.getJsonObject("Meta Data");
        tmp.setInformation(jsoMetadata.getString("1. Information"));
        tmp.setSymbol(jsoMetadata.getString("2. Symbol"));
        tmp.setLastRefreshed(jsoMetadata.getString("3. Last Refreshed"));
        tmp.setOutputSize(jsoMetadata.getString("4. Output Size"));
        tmp.setTimeZone(jsoMetadata.getString("5. Time Zone"));
        return  tmp;
    }

    /**
     * takes daylier by key out of timeseries jsonobject and transforms them in Daily objects
     * and adds them to the arraylist of the TimeSeries object
     * @param jso
     * @return fully transformed TimeSeries object
     */
    private static TimeSeries getTimeSeries(JsonObject jso){
        TimeSeries ts = new TimeSeries();
        JsonObject tmp = jso.getJsonObject("Time Series (Daily)");

        for (Object key : tmp.keySet()) {
            String keyStr = (String)key;
            JsonObject jsoTmp = tmp.getJsonObject(keyStr);

            ts.addDailies(new Daily(keyStr, jsoTmp.getString("1. open"),
                    jsoTmp.getString("2. high"), jsoTmp.getString("3. low"), jsoTmp.getString("4. close"),
                    jsoTmp.getString("5. volume")));
        }
        return ts;
    }
}
