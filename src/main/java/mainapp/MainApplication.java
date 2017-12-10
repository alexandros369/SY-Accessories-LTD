package mainapp;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Application Started");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.show();
    }
}
