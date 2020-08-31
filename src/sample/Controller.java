package sample;

import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {
    public TextArea maintextarea = new TextArea();
    FileChooser fc = new FileChooser();
    FileWriter fw;
    String dir = "";

    public void Save() throws NullPointerException, IOException {
        try{
            fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("All Files","*.*"));
            dir = fc.showSaveDialog(Main.getPrimaryStage()).getAbsoluteFile().getAbsolutePath() + ".txt";
            System.out.println(dir);

            fw = new FileWriter(new File(dir));
            fw.write(maintextarea.getText());
        }
        catch (NullPointerException | IOException e){
            e.printStackTrace();
        }
        finally {
            fw.close();
        }
    }
}
