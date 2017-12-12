package mainapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Application Started");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane panel = new GridPane();
        panel.setPadding(new Insets(20));
        panel.setVgap(10);
        panel.setHgap(10);

        Button productsBtn = new Button("Products");
        productsBtn.setOnAction(this::onClickProductsBtn);

        Button customersBtn = new Button("Customers");
        customersBtn.setOnAction(this::onClickCustomersBtn);

        Button reportsBtn = new Button("Reports");
        reportsBtn.setOnAction(this::onClickReportsBtn);

        Button exitBtn = new Button("Exit");
        exitBtn.setOnAction(this::onClickExitBtn);

        panel.add(productsBtn, 0, 2);
        panel.add(customersBtn, 0, 4);
        panel.add(reportsBtn, 0, 6);
        panel.add(exitBtn, 0, 8);

        Scene scene = new Scene(panel, 500, 500);
        primaryStage.setTitle("Main Menu - SY-Accessories");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void onClickProductsBtn(ActionEvent actionEvent) {
        //TODO Functionality for Products Menu
        System.out.println(actionEvent);
    }

    private void onClickCustomersBtn(ActionEvent actionEvent) {
        //TODO Functionality for Customers Menu
    }

    private void onClickReportsBtn(ActionEvent actionEvent) {
        //TODO Functionality for Reports Menu
    }

    private void onClickExitBtn(ActionEvent actionEvent) {
        System.out.println("Application Terminates");
        System.exit(0);
    }
}
