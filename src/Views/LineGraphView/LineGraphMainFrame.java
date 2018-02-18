package Views.LineGraphView;

import javax.swing.*;
import java.awt.*;

public class LineGraphMainFrame extends JFrame{
    public LineGraphMainFrame(){
        getContentPane();
        this.setLayout(new BorderLayout());
        this.add(new StockSelectionPanel() , BorderLayout.WEST);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
