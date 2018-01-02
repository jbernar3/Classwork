package Lab4_3$EASY;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import java.awt.Label;
import java.io.File;
import java.util.List;
import java.io.FileInputStream;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;

public class GameCodeEasy extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Bron Clicker");
		FileInputStream input = new FileInputStream("lebron3.png");
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		Button button = new Button("CLICK",imageView);
		button.setMinSize(200, 225);
		button.setMaxSize(300, 325);

		//HBox hbox = new HBox(button);
		//hbox.setAlignment(Pos.CENTER);
		//hbox.setPrefSize(20, 20);
		button.setOnAction(value -> {
			button.setLayoutX(Math.random()*600+50);
			button.setLayoutY(Math.random()*600+50);
		});
		StackPane root = new StackPane();
		root.getChildren().add(button);
		primaryStage.setScene(new Scene(root, 800, 800));
		
		primaryStage.show();
		
	}
	
	public static void main(String[] args)
	{
		Application.launch(args);
	}

}
