package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Rectangle2D screensize = Screen.getPrimary().getBounds();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("NotePaDD");
        primaryStage.setScene(new Scene(root, screensize.getWidth() /2, screensize.getHeight() /2 ));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
