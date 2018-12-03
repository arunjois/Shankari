package ui;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.layout.StackPane;
import javafx.scene.Node;
public class ChartTab {
    public TabPane getTab () {
        TabPane charTab =  new TabPane();
        Tab tab =  new Tab();
        StackPane pane = new StackPane();
        charTab.getTabs().add(tab);
        return charTab;
    }
}
