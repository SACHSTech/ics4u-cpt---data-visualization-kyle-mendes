package Data;

public class Movies {

    // initalize the variables
    private String name; 
    private String date; 
    private String genre;
    private String rating; 
    private int totalgross; 
    private long adjustedgross;

    // create the constructor
    public Movies(String thename, String thedate, String thegenre, String therating, int thetotalgross, long theadjustedgross){
        this.name = thename;
        this.date = thedate;
        this.genre = thegenre;
        this.rating = therating;
        this.totalgross = thetotalgross;
        this.adjustedgross = theadjustedgross;
    
    }
    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getGenre() {
        return genre;
    }

    public String getRating() {
        return rating;
    }

    public int getTotalgross() {
        return totalgross;
    }

    public long getAdjustedgross() {
        return adjustedgross;
    }

    public String toString() {
        return (name + ", " + date + ", " + genre + ", " + rating + ", " + totalgross + ", " + adjustedgross);
    }

}