package Lab4_2;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.BarChartBuilder;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.layout.BorderPane;
import java.io.File;
import java.util.List;

public class FXRunner extends Application{
	public void start(Stage primaryStage)
	{
		try 
		{
			File fileName = new File("DOHMH_New_York_City_Restaurant_Inspection_Results.csv");
			//CSVUtilities fileCSV = new CSVUtilities(fileName);
			
			CategoryAxis xAxis = new CategoryAxis();
			CategoryAxis yAxis = new CategoryAxis();
			xAxis.setLabel("YEAR");
			yAxis.setLabel("WATER CONSUMPTION (GALLONS)");
			BarChart graph = new BarChart(xAxis, yAxis);
			graph.setTitle("Water Consumption in NYC By Year");
			
			//BarChartBox
			
		}
		catch (Exception e)
		{
			
		}
	}
}
