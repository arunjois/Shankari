package ui;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
public class NewInfo {
    public static void takeInfo(){
        Stage info = new Stage();
        info.initModality(Modality.APPLICATION_MODAL);          //Refer Documentation
        info.setTitle("Info");
        info.setMinWidth(300);
        info.setMinHeight(300);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(0, 10, 0, 10));


        Label date = new Label("Date:");
        grid.add(date,0,0);

        TextField dd = new TextField();
        dd.setStyle("-fx-pref-width:3em;-fx-pref-height:2em;");
        grid.add(dd,1,0,1,1);

        TextField mm = new TextField();
        mm.setStyle("-fx-pref-width:3em;-fx-pref-height:2em;");
        grid.add(mm,2,0,1,1);

        TextField yyyy = new TextField();
        yyyy.setStyle("-fx-pref-width:4em;-fx-pref-height:2em;");
        grid.add(yyyy,3,0,1,1);


        Scene scene = new Scene(grid);
        info.setScene(scene);
        info.showAndWait();
    }
}
