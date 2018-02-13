package Objects;

import java.util.ArrayList;
import java.util.List;

public class TimeSeries {
    private List<Daily> dailies = new ArrayList<>();

    public TimeSeries() {
    }

    public TimeSeries(List<Daily> dailies) {
        this.dailies = dailies;
    }

    public List<Daily> getDailies() {
        return dailies;
    }

    public void setDailies(List<Daily> dailies) {
        this.dailies = dailies;
    }

    public void addDailies(Daily daily){
        this.dailies.add(daily);
    }
}
