package Objects;

import java.util.List;

public class Result {
    private MetaData metaData;
    private List<TimeSeries> timeSeries;

    public Result(MetaData metaData, List<TimeSeries> timeSeries) {
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

    public List<TimeSeries> getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(List<TimeSeries> timeSeries) {
        this.timeSeries = timeSeries;
    }
}
