/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pardarshi;



import java.io.File;
import java.io.IOException;
import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author Satyam
 */
public class Pardarshi extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        String path = "C:\\Users\\Satyam\\Documents\\Pardarshi";
        
        stage.setTitle("Pardarshi");
        Image icon = new Image("/resources/icon.png");
        stage.getIcons().add(icon);
        
        File dir = new File(path);
        if(!dir.exists()){
            if(dir.mkdir()){
                System.out.print("Created");
            }
            else{
                System.out.print("not created error");
            }
        }
        else{
            System.out.print("Already exists");        
        }
        
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    
    
}
