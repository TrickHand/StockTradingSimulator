package VantageApi;

import Objects.JsonToObjectParser;
import Objects.Result;
import com.sun.jndi.toolkit.url.Uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class VantageApiRequests {
    private final static String BASE_URL = "https://www.alphavantage.co/query?";
    public static Result RequestData(String requestMethodString){
        try {
            URL url = new URL(BASE_URL + requestMethodString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            Result res = JsonToObjectParser.parseJsonToObject(connection.getInputStream());
            return res;

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
