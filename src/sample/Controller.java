package sample;

import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {
    public TextArea maintextarea = new TextArea();
    FileChooser fc = new FileChooser();
    FileWriter fw;
    String dir = "";

    public void Save() throws IOException {
        try{
            fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("All Files","*.*"));
            dir = fc.showSaveDialog(Main.getPrimaryStage()).getAbsoluteFile().getAbsolutePath() + ".txt";
            System.out.println(dir);

            fw = new FileWriter(new File(dir));
            fw.write(maintextarea.getText());
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        finally {
            fw.close();
        }
    }
}
