package Lab4_3$EASY;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
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
		
		//GRAPHICS
		FileInputStream input = new FileInputStream("lebron3.png");
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		
		FileInputStream input2 = new FileInputStream("lebron5.png");
		Image image2 = new Image(input2);
		
		//IMAGE BUTTON
		Button button = new Button("",imageView);
		button.setMinSize(200, 225);
		button.setMaxSize(200, 225);
		button.setStyle("-fx-background-color: #ffffff; -fx-border-width: 5px; -fx-border-color: #cc0000");
		
		//SCORE LABEL
		Label labelScore = new Label(""+score);
		labelScore.setTranslateX(-380);
		labelScore.setTranslateY(-370);
		labelScore.setStyle("-fx-font-size: 2em; -fx-font-weight: bold;");
		
		//START BUTTON
		Button startButton = new Button("START");
		startButton.setTranslateY(-367);
		startButton.setTranslateX(338);
		startButton.setStyle("-fx-border-color: #0000cc; -fx-border-width: 5px; -fx-background-color: #ffffff; -fx-font-size: 2em; -fx-font-weight: bold;");
		
		//MESSAGE LABEL
		Label labelMessage = new Label("CLICK START TO PLAY\nyou have five seconds");
		labelMessage.setTranslateY(-360);
		labelMessage.setStyle("-fx-font-size: 2em; -fx-font-weight: bold;");
		
		//RESULT LABEL
		Label labelFinal = new Label("-----------");
		labelFinal.setTranslateY(370);
		labelFinal.setStyle("-fx-font-size: 2em; -fx-font-weight: bold;");
		
		//HBOX
		HBox hbox = new HBox(button);
		hbox.setAlignment(Pos.CENTER);
		hbox.setPrefSize(20, 20);
		
		//START BUTTON ACTION
		startButton.setOnAction(value-> {
			gameOn = !gameOn;
			if (gameOn)
			{
				score = 0;
				timeStep = System.nanoTime()+5000000000L;
				AnimationTimer time = new AnimationTimer()
				{
					public void handle(long now)
					{
						if (now>timeStep)
						{
							gameOn=false;
							labelMessage.setText("TIMER DONE");
							labelFinal.setText("YOU SCORED "+score);
							startButton.setText("START");
							button.setStyle("-fx-background-color: #ffffff; -fx-border-width: 5px; -fx-border-color: #cc0000");
							button.setGraphic(new ImageView(image));
						}
						else 
						{
							labelMessage.setText("CLICK CLICK CLICK");
							gameOn=true;
							button.setStyle("-fx-background-color: #ffffff; -fx-border-width: 5px; -fx-border-color: #00b300");
							button.setGraphic(new ImageView(image2));
						}
					}
				};

				time.start();
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
				hbox.setTranslateX(Math.random()*550-300);
				hbox.setTranslateY(Math.random()*500-200);
				score++;
			}
			labelScore.setText(""+score);
		});
		
		
		StackPane root = new StackPane();
		root.getChildren().add(hbox);
		root.getChildren().add(startButton);
		root.getChildren().add(labelMessage);
		root.getChildren().add(labelScore);
		root.getChildren().add(labelFinal);
		
		primaryStage.setScene(new Scene(root, 800, 800));
		primaryStage.show();

		
	}
	
	public static void main(String[] args)
	{
		Application.launch(args);
	}

}
