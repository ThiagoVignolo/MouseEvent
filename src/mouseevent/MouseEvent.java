/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package mouseevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Thiago Vignolo
 */
public class MouseEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Text mainText = new Text(50, 50, "Programing is fun");
        
        BorderPane root = new BorderPane();
        root.getChildren().add(mainText);
        
        root.setOnMouseDragged(event -> {
            mainText.setX(event.getX());
            mainText.setY(event.getY());
        });
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Lambda MouseEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
