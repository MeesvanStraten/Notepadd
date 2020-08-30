package sample;

import javafx.scene.control.TextArea;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {
    public TextArea maintextarea = new TextArea();

    JFileChooser filechooser = new JFileChooser();
    FileWriter fw;

    String dir = "";

    public void save() throws IOException {
       try{

            JFrame frame = new JFrame();
            frame.setAlwaysOnTop(true);
            filechooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int returnVal = filechooser.showOpenDialog(frame);

            if (returnVal== JFileChooser.APPROVE_OPTION){
                dir = filechooser.getSelectedFile().getAbsolutePath() + ".txt";
                System.out.println(dir);
            }
           fw = new FileWriter(new File(dir));
           fw.write(maintextarea.getText());
        }
        catch (IOException e){
            e.printStackTrace();
        }
       finally {
           fw.close();
       }
    }
}
