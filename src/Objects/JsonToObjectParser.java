package Objects;

import javax.json.JsonObject;
import javax.json.JsonReader;
import java.util.ArrayList;
import java.util.List;

public class JsonToObjectParser {
    private static JsonReader jsonReader;

    public static Result parseJsonToObject(JsonObject obj, String TimeSeriesKeyword) {
        Result res = new Result();
        res.setMetaData(getMetaData(obj));
        res.setTimeSeries(getTimeSeries(obj, TimeSeriesKeyword));
        return res;
    }

    /**
     * extracts the metadata from the JsonObject and returns it
     * as a MetaData Object
     *
     * @param jso JsonObject from which data should be extracted
     * @return MetaData as Object for Result Object
     */
    private static MetaData getMetaData(JsonObject jso) {
        MetaData tmp = new MetaData();
        JsonObject jsoMetadata = jso.getJsonObject("Meta Data");
        tmp.setInformation(jsoMetadata.getString("1. Information"));
        tmp.setSymbol(jsoMetadata.getString("2. Symbol"));
        tmp.setLastRefreshed(jsoMetadata.getString("3. Last Refreshed"));
        tmp.setOutputSize(jsoMetadata.getString("4. Output Size"));
        tmp.setTimeZone(jsoMetadata.getString("5. Time Zone"));
        return tmp;
    }

    /**
     * takes timeseries by key out of jsonobject and transforms them in TimeSeries objects
     * and adds them to the arraylist of the Result object
     *
     * @param jso
     * @return fully transformed TimeSeries object
     */
    private static List<TimeSeries> getTimeSeries(JsonObject jso, String TimeSeriesKeyword) {
        List<TimeSeries> list = new ArrayList<TimeSeries>();
        JsonObject tmp = jso.getJsonObject(TimeSeriesKeyword);

        for (Object key : tmp.keySet()) {
            String keyStr = (String) key;
            JsonObject jsoTmp = tmp.getJsonObject(keyStr);

            list.add(new TimeSeries(keyStr, jsoTmp.getString("1. open"),
                    jsoTmp.getString("2. high"), jsoTmp.getString("3. low"), jsoTmp.getString("4. close"),
                    jsoTmp.getString("5. volume")));
        }
        return list;
    }
}
