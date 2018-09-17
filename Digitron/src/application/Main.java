package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	  @Override
	    public void start(Stage primaryStage) throws Exception {
	        Parent root = FXMLLoader.load(getClass().getResource("calc.fxml"));

	        primaryStage.setScene(new Scene(root));
	        primaryStage.initStyle(StageStyle.TRANSPARENT);
	        primaryStage.toFront();
	        primaryStage.show();
	    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
