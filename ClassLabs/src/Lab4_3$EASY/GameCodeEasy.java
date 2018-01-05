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
	long timeStep;

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
		
		Label label2 = new Label("PLAY! GOOD LUCK!");
		
		HBox hbox = new HBox(button,label);
		hbox.setAlignment(Pos.CENTER);
		hbox.setPrefSize(20, 20);
		
		
		
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
		
		
		//ANIMATION TIMER
		timeStep = System.nanoTime()+5000000000L;
		AnimationTimer time = new AnimationTimer()
		{
			public void handle(long now)
			{
				if (now>timeStep && gameOn)
				{
					gameOn=false;
					label2.setText("TIMER DONE");
					startButton.setText("START");
				}
				else 
				{
					gameOn=true;
				}
			}
		};
		
		//START BUTTON ACTION
		startButton.setOnAction(value-> {
			gameOn = !gameOn;
			if (gameOn)
			{
				time.start();
				startButton.setText("STOP");
			}
			else
			{
				startButton.setText("START");
			}
			
		});
		
		StackPane root = new StackPane();
		root.getChildren().add(hbox);
		root.getChildren().add(startButton);
		root.getChildren().add(label2);
		
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
