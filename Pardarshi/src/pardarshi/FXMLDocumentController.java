/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pardarshi;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Satyam
 */
public class FXMLDocumentController implements Initializable {
    
    
    
    private Label label;
    @FXML
    private Button btn;
    @FXML
    private TextArea Areaa;
    @FXML
    private WebView webview;
    @FXML
    private MenuBar menubar;
    @FXML
    private MenuItem exitcode;
    @FXML
    private ProgressBar progress_bar;
    @FXML
    private MenuItem cleartab;
    @FXML
    private ComboBox<String> Comboboxmain;
    String i = "";
    
    ObservableList<String> list = FXCollections.observableArrayList("HTML","CSS","Javascript","PHP");
    @FXML
    private MenuItem themeaction;
    String username = System.getProperty("user.name");
    
    
    @FXML
    private void handleButtonAction(ActionEvent event)  {
        
        // creating a directory
        
        i = Comboboxmain.getValue();
        
        
        if(Comboboxmain.getValue() == null){
                JFrame nullframe = new JFrame("ERROR");
                nullframe.setSize(500, 200);            //w,h
                
                JLabel label = new JLabel();
                label.setText("\nSelect a Language from top-left of the frame");
                
                nullframe.setLocationRelativeTo(null);
                JPanel nullpanel = new JPanel();  
                nullpanel.setLayout(null);
                nullframe.add(nullpanel);
                JButton btn = new JButton("OK");
                btn.setBounds(180, 70, 75, 30);             //x y w h
                label.setBounds(100, 20, 500, 30);
                nullpanel.add(label);
                nullpanel.add(btn);
                btn.addActionListener(new ActionListener(){                         
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent ae) {
                         nullframe.dispose();
                    }
                });
                nullframe.setDefaultCloseOperation(nullframe.DISPOSE_ON_CLOSE);
                nullframe.setVisible(true);
        }
       if(i.equals("HTML")){                //HTML combo
        try {
        String path1 = "C:\\Users\\"+ username +"\\Documents\\Pardarshi\\index.html";
        File file = new File(path1);
        if(!file.exists()){
                
                file.createNewFile();
        }
         if(file.exists()){
                String s = Areaa.getText();
                PrintWriter pe = new PrintWriter(file);
                pe.write(s);
                pe.close();
            }
        }
        catch (IOException e) {
            //TODO : anything for this exception
                e.printStackTrace();
            }
        
        //progress_bar.setProgress(0.6);
        
         final WebEngine web = webview.getEngine();
            String load = "file:///C:\\Users\\"+ username +"\\Documents\\Pardarshi\\index.html";
            web.load(load);
        }
       if(i.equals("CSS")){                         //CSS Combo
              try {
        String path1 = "C:\\Users\\"+ username +"\\Documents\\Pardarshi\\index.html";;
        File file = new File(path1);
        if(!file.exists()){
                
                file.createNewFile();
        }
         if(file.exists()){
                String s = Areaa.getText();
                PrintWriter pe = new PrintWriter(file);
                pe.write(s);
                pe.close();
            }
        }
        catch (IOException e) {
                  //TODO : anything for this exception

            }
        //progress_bar.setProgress(0.6);
         final WebEngine web = webview.getEngine();
            String load = "file:///C:\\Users\\"+ username +"\\Documents\\Pardarshi\\index.html";;
            web.load(load);
       }
       if(i.equals("PHP")){                                         //PHP combo
           try {
        String path1 = "C:\\Users\\"+ username +"\\Documents\\Pardarshi\\index.html";
        File file = new File(path1);
        if(!file.exists()){
                
                file.createNewFile();
        }
         if(file.exists()){
                String s = Areaa.getText();
                PrintWriter pe = new PrintWriter(file);
                pe.write(s);
                pe.close();
            }
        }
        catch (IOException e) {
            //TODO : anything for this exception
                e.printStackTrace();
            }
        
        //progress_bar.setProgress(0.6);
        
         final WebEngine web = webview.getEngine();
            String load = "file:///C:\\Users\\"+ username +"\\Documents\\Pardarshi\\index.html";
            web.load(load);
       }
       if(i.equals("Javascript")){                                  //JS combo
           try {
               String path1 = "C:\\Users\\"+ username +"\\Documents\\Pardarshi\\index.html";
        File file = new File(path1);
        if(!file.exists()){
                
                file.createNewFile();
        }
         if(file.exists()){
                String s = Areaa.getText();
                PrintWriter pe = new PrintWriter(file);
                pe.write(s);
                pe.close();
            }
        }
        catch (IOException e) {
            //TODO : anything for this exception
                e.printStackTrace();
            }
        
        //progress_bar.setProgress(0.6);
        
         final WebEngine web = webview.getEngine();
            String load = "file:///C:\\Users\\"+ username +"\\Documents\\Pardarshi\\index.html";
            web.load(load);
       }
            
            
            
            
            //progress_bar.setProgress(1);
        }
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Comboboxmain.setItems(list);
        
        final WebEngine web = webview.getEngine();
            String load = "file:///D://Logo.png";
            web.load(load);
            
        // TODO
    }  

    @FXML
    private void exitbuttonaction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void cleartabaction(ActionEvent event) {
        Areaa.setText("");
    }

    @FXML
    private void themeactionbtn(ActionEvent event) {
        Themeframe fr = new Themeframe();
        fr.setVisible(true);
    }

    @FXML
    public void menunewbtn(ActionEvent event) throws IOException {
        Pardarshi p = new Pardarshi();
       

    }
}

 

