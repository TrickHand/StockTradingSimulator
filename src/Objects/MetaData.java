package Objects;

public class MetaData {
    private String information;
    private String symbol;
    private String lastRefreshed;
    private String outputSize;
    private String timeZone;


    public MetaData(String information, String symbol, String lastRefreshed,
                    String outputSize, String timeZone) {
        this.information = information;
        this.symbol = symbol;
        this.lastRefreshed = lastRefreshed;
        this.outputSize = outputSize;
        this.timeZone = timeZone;
    }

    public MetaData() {
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getLastRefreshed() {
        return lastRefreshed;
    }

    public void setLastRefreshed(String lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    public String getOutputSize() {
        return outputSize;
    }

    public void setOutputSize(String outputSize) {
        this.outputSize = outputSize;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
