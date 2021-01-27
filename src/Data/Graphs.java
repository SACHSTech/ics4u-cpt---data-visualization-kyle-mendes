package Data;

import java.io.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage; 

public class Graphs extends Application {

    public static BarChart chart;
    public static CategoryAxis xAxis;
    public static NumberAxis yAxis;

    public static Parent barchart(double action2, double adventure2, double bcom2, double comedy2, double drama2, double horror2, double musical2, double romcom2, double thriller2, double western2) {
        String[] genres = {"Action", "Adventure", "Black Comedy", "Comedy", "Drama", "Horror", "Musical", "Rom Com", "Thriller/Suspense", "Western"};
        xAxis = new CategoryAxis();
        xAxis.setCategories(FXCollections.<String>observableArrayList(genres));
        yAxis = new NumberAxis("Total Gross", 0.0, 1000000000.0, 500000000.0);

        ObservableList<BarChart.Series> barChartData = 
            FXCollections.observableArrayList (
                new BarChart.Series("Genres",
                                    FXCollections.observableArrayList(
                    new BarChart.Data(genres[0], action2),
                    new BarChart.Data(genres[1], adventure2),
                    new BarChart.Data(genres[2], bcom2),
                    new BarChart.Data(genres[3], comedy2),
                    new BarChart.Data(genres[4], drama2),
                    new BarChart.Data(genres[5], horror2),
                    new BarChart.Data(genres[6], musical2),
                    new BarChart.Data(genres[7], romcom2),
                    new BarChart.Data(genres[8], thriller2),
                    new BarChart.Data(genres[9], western2)))
            );

            chart = new BarChart(xAxis, yAxis, barChartData, 200.0);
            return chart;
     
    }

    @Override public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }




    
}
