package Data;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class PieChartApp extends Application {

    private PieChart chart;
    
    public static ObservableList<PieChart.Data> generateData() {

        /*
        String current;
        int action = 0;
        int adventure = 0;
        int blackcomedy = 0;
        int comedy = 0;
        int concert = 0;
        int doc = 0;
        int drama = 0;
        int horror = 0;
        int musical = 0;
        int romcom = 0;
        int thriller = 0;
        int western = 0;
        
        for(int i = 0; i < array.length; i++) {
            current = array[i].getGenre();

            if (current.equals("Action")) {
                action++;
            } else if (current.equals("Adventure")) {
                adventure++;
            } else if (current.equals("Black Comedy")) {
                blackcomedy++;
            } else if (current.equals("Comedy")) {
                comedy++;
            } else if (current.equals("Concert/Performance")) {
                concert++;
            } else if (current.equals("Documentary")) {
                doc++;
            } else if (current.equals("Drama")) {
                drama++;
            } else if (current.equals("Horror")) {
                horror++;
            } else if (current.equals("Musical")) {
                musical++;
            } else if (current.equals("Romantic Comedy")) {
                romcom++;
            } else if (current.equals("Thriller/Suspense")) {
                thriller++;
            } else if (current.equals("Western")) {
                western++;
            }
        
            
        }  
        */
        
        return FXCollections.observableArrayList(
                new PieChart.Data("Action", 36),
                new PieChart.Data("Adventure", 118),
                new PieChart.Data("Black Comedy", 3),
                new PieChart.Data("Comedy", 162),
                new PieChart.Data("Concert/Performance", 2),
                new PieChart.Data("Documentary", 16),
                new PieChart.Data("Drama", 103),
                new PieChart.Data("Horror", 5),
                new PieChart.Data("Musical", 15),
                new PieChart.Data("Romantic Comedy", 22),
                new PieChart.Data("Thriller/Suspense", 23),
                new PieChart.Data("Western", 7));
    }
    
    public Parent createContent() {
        chart = new PieChart(generateData());
        chart.setClockwise(false);
        return chart;
    }
 
    @Override public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }
 
    /**
     * Java main for when running without JavaFX launcher
     */
    public static void main(String[] args) {
        launch(args);
    }


}
