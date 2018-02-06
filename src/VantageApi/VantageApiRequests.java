package VantageApi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class VantageApiRequests {
    public String getData(VantageApiRequestsParams params){
        try {
            URL url = new URL("https://www.alphavantage.co/query?" + params.function + "&" + params.symbol + "&" +  params.apikey);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

            StringBuilder erg = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null){
                erg.append(line);
            }
            reader.close();
            return erg.toString();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";
    }
}
