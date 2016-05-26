/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
/**
 *
 * @author Nick
 */
public class RPG extends Application{

    /**
     * @param args the command line arguments
     */
    
    Stage window;
    Scene scene;
    Button submitButton;
    Button infoButton;
    ListView<String> listView;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       window = primaryStage;
       window.setTitle("Abilities");
       submitButton = new Button("Submit");
       infoButton = new Button("Info");
       
       listView = new ListView<>();
       listView.getItems().addAll("Strength", "Wisdom", "Dexterity", "Intelligence");
       //listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
       
       listView.setTooltip(
              new Tooltip("wooah"));
       
       //infoButton.setOnAction(e -> buttonClicked());
       
       VBox layout = new VBox(10);
       layout.setPadding(new Insets(20, 20, 20, 20));
       layout.getChildren().addAll(listView, submitButton, infoButton);
       
       scene = new Scene(layout, 300, 250);
       window.setScene(scene);
       window.show();
       
    }

    private void setSelectionMode(SelectionMode selectionMode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void buttonClicked(){
        String information = "";
        ObservableList<String> abilities;
        abilities = listView.getSelectionModel().getSelectedItems();
        
        for(String a: abilities){
            information += a + "\n";
        }
        System.out.print(information);
    }
}
