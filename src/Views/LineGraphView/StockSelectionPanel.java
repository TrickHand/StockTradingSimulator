package Views.LineGraphView;

import VantageApi.VantageApiParamEnums.Symbol;

import javax.swing.*;
import java.awt.*;

public class StockSelectionPanel extends JPanel {

    public StockSelectionPanel(){
        this.setLayout(new GridLayout(0,1));
        for (Symbol symbol : Symbol.values()){
            this.add(new Checkbox(symbol.name()));
        }
    }
}
