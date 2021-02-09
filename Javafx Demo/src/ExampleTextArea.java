
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class ExampleTextArea extends Application {
    @Override
    public void start(Stage primaryStage) {
    	
        TextArea sample = new TextArea();
        sample.setFont(new Font(14));
        Button btnSave = new Button("SUBMIT");
    
      
		btnSave.setOnAction(new EventHandler <ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
		
				  
				try	{
					String s = sample.getText();
					File f = new File("E:\\BuvanBro.txt");
					FileWriter fw = new FileWriter(f);
					fw.write(s);
					fw.close();
				}
				catch(IOException ioe) {
					System.out.println("Exception Caught : " +ioe.getMessage());
				}
		
		      }});
        VBox vBox = new VBox(sample,btnSave);
        
        vBox.setAlignment(Pos.BOTTOM_CENTER);
        vBox.setSpacing(20);
        
        Scene scene=new Scene(vBox, 800, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Welcome");
        primaryStage.show();
    }
  
    
   
	


	public static void main(String[] args) {
        launch(args);
    }
}