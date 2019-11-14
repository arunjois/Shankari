package ui;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import sql.Country;
public class NewInfo {
  ComboBox<String> placeList = new ComboBox<>();
  public void setPlaceList(ObservableList str) {
    placeList = new ComboBox<String>(str);
  }
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
    dd.setId("dd");
    dd.setPromptText("dd");
    dd.setStyle("-fx-pref-width:3em;-fx-pref-height:2em;");
    grid.add(dd,1,0,1,1);

    TextField mm = new TextField();
    mm.setPromptText("mm");
    mm.setStyle("-fx-pref-width:3em;-fx-pref-height:2em;");
    grid.add(mm,2,0,1,1);

    TextField yyyy = new TextField();
    yyyy.setPromptText("yyyy");
    yyyy.setStyle("-fx-pref-width:3.8em;-fx-pref-height:2em;");
    grid.add(yyyy,3,0,1,1);

    Label time = new Label("Time");
    grid.add(time,0,1,1,1);

    TextField hrs = new TextField();
    hrs.setPromptText("hh");
    hrs.setStyle("-fx-pref-width:3em;-fx-pref-height:2em;");
    grid.add(hrs,1,1,1,1);

    TextField min = new TextField();
    min.setPromptText("mm");
    min.setStyle("-fx-pref-width:3em;-fx-pref-height:2em;");
    grid.add(min,2,1,1,1);

    Label country =  new Label("Country:");
    grid.add(country,0,3,1,1);
    Country con = new Country();
    ObservableList<String> observableList = FXCollections.observableList(Country.getCountryList());

    ObservableList<String> options =
      FXCollections.observableArrayList(
        observableList.sorted()
      );

    String c;
    ComboBox<String> countryList = new ComboBox<String>(options);
    //countryList.setEditable(true);
    grid.add(countryList,1,3,4,1);
    ObservableList<String> ireallydontknow = FXCollections.observableArrayList();
    //String ireallydontknow = new String();
    ComboBox<String> placeList = new ComboBox<>();
    /*
     * Set Action on Combo box
     */
    ComboBox<String> shit=null;
      /*countryList.setOnAction(e->{
          String tmp = countryList.getSelectionModel().selectedItemProperty().getValue();
          shit = new ComboBox<>(Country.getPlace(tmp));
        });*/
    countryList.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent actionEvent) {
        String tmp = countryList.getSelectionModel().selectedItemProperty().getValue();
        NewInfo i = new NewInfo();
        i.setPlaceList(Country.getPlace(tmp));
      }
    });
    countryList.getSelectionModel().selectFirst();
    Label place = new Label("Place:");
    grid.add(place,0,4,1,1);

    String tmp = countryList.getSelectionModel().selectedItemProperty().getValue();
        /*ComboBox<String> placeList = new ComboBox<String>(
                FXCollections.observableArrayList(ireallydontknow)
                //All this will need a rewrite
        );*/
    grid.add(placeList,1,4,4,1);

    Button okay = new Button("OK");
    grid.add(okay,2,5,1,1);
    okay.setOnAction(event->loadnewInfo(dd,mm,yyyy,hrs,min,countryList,shit));

    Scene scene = new Scene(grid);
    info.setScene(scene);
    info.showAndWait();
  }
  public static void loadnewInfo(TextField dd,TextField mm, TextField yyyy,
                                 TextField hrs, TextField min,
                                 ComboBox country,ComboBox place){
    double day = Double.valueOf(dd.getText());
    double mon  = Double.valueOf(mm.getText());
    double year = Double.valueOf(yyyy.getText());
    double hours = Double.valueOf(hrs.getText());
    double mins = Double.valueOf(min.getText());
    String cou = (String)country.getValue();
    String location = (String)place.getValue();





  }
}
class GetPlaces implements Runnable {
  String country;
  GetPlaces(String s){
    this.country=s;
  }
  public void run() {

  }
}
