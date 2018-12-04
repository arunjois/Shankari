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
        Tab Info = new Tab("Details");
        StackPane myPane = new StackPane();
        myPane.getChildren().add(getnode());
        Charts.setContent(myPane);
        Details.getTabs().addAll(Info);
        Charts.setContent(Details);

        Horo.getTabs().addAll(Charts);




        return Horo;
    }
    public Node getnode() {
        StackPane node = new StackPane();

        return node;
    }
}
