package Data;

// import the items I need
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.PieChart;


public class Graphs {

    // Initialize variables
    public static BarChart chart;
    public static CategoryAxis xAxis;
    public static NumberAxis yAxis;

    // create barchart
    public static Parent barchart(double action2, double adventure2, double bcom2, double comedy2, double drama2, double horror2, double musical2, double romcom2, double thriller2, double western2) {
        
        // create x and y axis
        String[] genres = {"Action", "Adventure", "Black Comedy", "Comedy", "Drama", "Horror", "Musical", "Rom Com", "Thriller/Suspense", "Western"};
        xAxis = new CategoryAxis();
        xAxis.setCategories(FXCollections.<String>observableArrayList(genres));
        yAxis = new NumberAxis("Total Gross", 0.0, 140000000, 10000000.0);

        // add in the data
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

        // create and print the chart
        chart = new BarChart(xAxis, yAxis, barChartData, 200.0);
        chart.setTitle("Genre vs Average Total Gross");
        return chart;
     
    }

    // initialize the variables
    public static final String[] ratings = {"G", "Not Rated", "PG", "PG-13", "R"};
    public static LineChart<String, Number> chart2;
    public static CategoryAxis xAxis2;
    public static NumberAxis yAxis2;

    // line chart
    public static Parent linechart(double g2, double notrated, double pg2, double pg132, double r2) {

        // create the x and y axis
        xAxis2 = new CategoryAxis();
        yAxis2 = new NumberAxis("Average Total Gross", 0.0, 100000000.0, 10000000.0);
        chart2 = new LineChart<>(xAxis2, yAxis2);
        chart2.setTitle("Line chart for MPA Rating vs Average total gross");
        xAxis2.setLabel("MPA Rating");
        yAxis2.setLabel("Average Total Gross");

        // add in the data
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Ratings");
        series.getData().add(new XYChart.Data<String, Number>(ratings[0], g2));
        series.getData().add(new XYChart.Data<String, Number>(ratings[1], notrated));
        series.getData().add(new XYChart.Data<String, Number>(ratings[2], pg2));
        series.getData().add(new XYChart.Data<String, Number>(ratings[3], pg132));
        series.getData().add(new XYChart.Data<String, Number>(ratings[4], r2));
        chart2.getData().add(series);

        return chart2;
        
    }

    
}
