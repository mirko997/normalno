
package Stablol;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class NewFXMain extends Application {
    
    Tree tree = new Tree();
    
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        root.getChildren().add(tree);
        Scene scene = new Scene(root, 300, 250); 
        primaryStage.setTitle("Drvo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
