package top.fyukina.iplmirror;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Entrance extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fml = new FXMLLoader(Entrance.class.getResource("entrance.fxml"));
        Scene scene = new Scene(fml.load(), 800, 600);
        stage.setTitle("IPL Mirror");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
