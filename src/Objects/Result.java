package Objects;

public class Result {
    private MetaData metaData;
    private TimeSeries timeSeries;

    public Result(MetaData metaData, TimeSeries timeSeries) {
        this.metaData = metaData;
        this.timeSeries = timeSeries;
    }

    public Result() {
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public TimeSeries getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(TimeSeries timeSeries) {
        this.timeSeries = timeSeries;
    }
}
