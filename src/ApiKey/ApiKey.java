package ApiKey;

public class ApiKey {

    private static String preKey = "&apikey=EPRJ8OGC2KMK2D72";
    private static String key = "";             //// enter own key here, do not upload it!

    public static String getKey() {
        return preKey + key;
    }
}

