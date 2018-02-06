package VantageApi;

public class ApiTest {
    public static void main(String[] args){
        VantageApiRequestsParams params = new VantageApiRequestsParams();
        VantageApiRequests req = new VantageApiRequests();
        String tollerString = req.getData(params);
        System.out.println(tollerString);
    }
}
