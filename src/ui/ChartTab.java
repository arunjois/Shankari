package ui;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.layout.GridPane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.Node;
public class ChartTab {
    /*
    * Maybe this method needs a rewrite
     */
    public TabPane getTab () {
        TabPane Horo = new TabPane();               //Parent TabPane
        TabPane Details = new TabPane();            //Child TabPane
        Tab Charts =  new Tab("Charts");        //Parent Tab
        Tab Info = new Tab("Details");          //Child Tab
        GridPane myPane = new GridPane();
        myPane.setPadding(new Insets(0, 10, 0, 10));
        myPane.add(getnode(),1,0);
        //Charts.setContent(myPane);
        Info.setContent(myPane);
        Details.getTabs().addAll(Info);
        Charts.setContent(Details);
        Horo.getTabs().addAll(Charts);
        return Horo;
    }
    public Node getnode() {
        Canvas canvas = new Canvas();
        canvas.setWidth(800);
        canvas.setHeight(500);

        // Get the graphics context of the canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Pane root = new Pane();

        //Create the line segments for charts
        gc.strokeRect(10,10,780,470);     //Rectangle Box
        gc.strokeLine(10,115,790,115);    //Line Stroke
        gc.strokeLine(10,370,790,370);
        gc.strokeLine(10,235,150,235);    //Horizontal Left lines
        gc.strokeLine(650,235,790,235);   //Horizontal Right lines
        gc.strokeLine(385,10,385,115);    //Vertical Top Line
        gc.strokeLine(385,370,385,480);   //Vertical Bottom Line
        gc.strokeLine(150,10,150,480);
        gc.strokeLine(650,10,650,480);     //Vertical Line Long
        //final Label title = new Label("Some text");
        //title.setAlignment(Pos.CENTER);
        root.getChildren().add(canvas);
        return (Node)root;
    }
}
