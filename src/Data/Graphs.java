package Data;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class Graphs {

    private PieChart chart;
    
    private int action = 0;
    private int adventure = 0;
    private int blackcomedy = 0;
    private int comedy = 0;
    private int concert = 0;
    private int doc = 0;
    private int drama = 0;
    private int horror = 0;
    private int musical = 0;
    private int romcom = 0;
    private int thriller = 0;
    private int western = 0;


    public static void CountGenre(Movies[] array) {
        String current;
        
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
    
    }

    public static ObservableList<PieChart.Data> generateData() {
        //int western = 9;
        return FXCollections.observableArrayList(
                new PieChart.Data("Sun", western),
                new PieChart.Data("IBM", 12),
                new PieChart.Data("HP", 25),
                new PieChart.Data("Dell", 22),
                new PieChart.Data("Apple", 30));
    }
 
    public Parent createContent() {
        chart = new PieChart(generateData());
        chart.setClockwise(false);
        return chart;
    }
 
    @Override 
    public void start(Stage primaryStage) throws Exception {
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
