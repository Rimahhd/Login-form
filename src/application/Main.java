package application;
	
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	//This code defines the start method of a JavaFX application, 
	//which sets up the user interface of the application. 
	//The start method is called by the main method when the application is launched.
	
	public void start(Stage primaryStage) {
		try {
			//The start method creates a new BorderPane object and sets it as the root node of a Scene.
			//The Scene is then displayed on the stage (window) of the application. 
			//The try-catch block is used to catch any exceptions 
			//that might be thrown during the execution of the start method.
			//BorderPane root = new BorderPane();
			//Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			String sceneFile = "/application/mainform.fxml";
		    Parent root = null;
		    URL    url  = null;
		    try
		    {
		        url  = getClass().getResource(sceneFile);
		        root = FXMLLoader.load( url );
		        System.out.println( "  fxmlResource = " + sceneFile );
		    }
		    catch ( Exception ex )
		    {
		        System.out.println( "Exception on FXMLLoader.load()" );
		        System.out.println( "  * url: " + url );
		        System.out.println( "  * " + ex );
		        System.out.println( "    ----------------------------------------\n" );
		        throw ex;
		    }
		//Parent root = FXMLLoader.load(getClass().getResource("mainform.fxml"));
			
			
			Scene scene = new Scene(root,200,200);
			
			primaryStage.setTitle("First Demo Scene");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
