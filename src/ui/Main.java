package ui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


import ui.FileMenu;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();
        //root.getChildren().add(btn);
        FileMenu f = new FileMenu();
       // menuBar.getMenus().addAll(f.getMenuBar());

        //root.getChildren().add(f.getMenuBar());


        Scene scene = new Scene(root, 300, 250);
        root.setTop(f.getMenuBar());
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setMaximized(true);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
