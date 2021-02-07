import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
public class Dm extends Application {
    @Override
    public void start(Stage primaryStage) {
        String str="Add the text which you want to save";
        Text sample = new Text(str);
        sample.setFont(new Font(14));
        Button btnSave = new Button("SUBMIT");
        
		btnSave.setOnAction(new EventHandler <ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
			
            FileChooser fileChooser = new FileChooser();
            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
            fileChooser.getExtensionFilters().add(extFilter);
            File file = fileChooser.showSaveDialog(primaryStage);
            System.out.println(file);
            }
			});
        VBox vBox = new VBox(sample, btnSave);
        vBox.setAlignment(Pos.CENTER);
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