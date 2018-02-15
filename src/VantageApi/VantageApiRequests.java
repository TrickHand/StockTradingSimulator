package VantageApi;

import Objects.JsonToObjectParser;
import Objects.Result;
import com.sun.jndi.toolkit.url.Uri;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class VantageApiRequests {
    private final static String BASE_URL = "https://www.alphavantage.co/query?";
    public static JsonObject RequestData(String requestMethodString){
        try {
            URL url = new URL(BASE_URL + requestMethodString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            InputStream is = connection.getInputStream();
            JsonReader jsonReader = Json.createReader(is);
            JsonObject obj = jsonReader.readObject();
            jsonReader.close();
            return obj;

        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
