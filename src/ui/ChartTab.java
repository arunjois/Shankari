package ui;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.layout.StackPane;
import javafx.scene.Node;
public class ChartTab {
    public TabPane getTab () {
        TabPane Horo = new TabPane();
        TabPane Details = new TabPane();
        Tab Charts =  new Tab("Charts");
        Details.getTabs().addAll(new Tab("Details"));
        Charts.setContent(Details);

        Horo.getTabs().addAll(Charts);




        return Horo;
    }
}
