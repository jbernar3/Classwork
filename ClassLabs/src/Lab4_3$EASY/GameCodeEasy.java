package Lab4_3$EASY;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


import java.io.File;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.io.FileInputStream;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

public class GameCodeEasy extends Application{
	int score = 0;
	boolean gameOn = false;

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Bron Clicker");
		
		FileInputStream input = new FileInputStream("lebron3.png");
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		Button button = new Button("CLICK",imageView);
		button.setMinSize(200, 225);
		button.setMaxSize(300, 325);
		
		Label label = new Label(""+score);
		Button startButton = new Button("START",label);
		startButton.setAlignment(Pos.TOP_LEFT);
		
		HBox hbox = new HBox(button,label);
		hbox.setAlignment(Pos.CENTER);
		hbox.setPrefSize(20, 20);
		
		//ANIMATION TIMER
		new AnimationTimer()
		{
			public void handle(long now)
			{
				//if ()
			}
		};
		
		//START BUTTON ACTION
		startButton.setOnAction(value-> {
			gameOn = !gameOn;
			if (gameOn)
			{
				startButton.setText("STOP");
			}
			else
			{
				startButton.setText("START");
			}
			
		});
		
		//PICTURE BUTTON ACTION
		button.setOnAction(value -> {
			
			if (gameOn)
			{
				hbox.setTranslateX(Math.random()*600-300);
				hbox.setTranslateY(Math.random()*600-300);
				score++;
			}
			label.setText(""+score);
		});
		
		StackPane root = new StackPane();
		root.getChildren().add(hbox);
		root.getChildren().add(startButton);
		startButton.setTranslateX(-40);
		startButton.setTranslateY(40);
		primaryStage.setScene(new Scene(root, 800, 800));
		primaryStage.show();
	}
	
	public static void main(String[] args)
	{
		Application.launch(args);
	}

}
