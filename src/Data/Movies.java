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
    /**
    * Constructor - creates a new data instance
    * @param thename - the name  
    * @param thedate - the date 
    * @param thegenre - the genre 
    * @param therating - the mpa rating
    * @param thetotalgross - the total gross 
    * @param theadjustedgross - the adjusted gross
    */
    public Movies(String thename, String thedate, String thegenre, String therating, int thetotalgross, long theadjustedgross){
        this.name = thename;
        this.date = thedate;
        this.genre = thegenre;
        this.rating = therating;
        this.totalgross = thetotalgross;
        this.adjustedgross = theadjustedgross;
    
    }
    
    /**
    * Getter method for name
    * @return the name
    */
    public String getName() {
        return name;
    }

    /**
    * Getter method for date
    * @return the date
    */
    public String getDate() {
        return date;
    }

    /**
    * Getter method for genre
    * @return the genre
    */
    public String getGenre() {
        return genre;
    }

    /**
    * Getter method for rating
    * @return the rating
    */
    public String getRating() {
        return rating;
    }

    /**
    * Getter method for total gross
    * @return the total gross
    */
    public int getTotalgross() {
        return totalgross;
    }

    /**
    * Getter method for adjusted gross
    * @return the adjusted gross
    */
    public long getAdjustedgross() {
        return adjustedgross;
    }

    /**
    * String of all thedata
    * @return the data of one object
    */
    public String toString() {
        return (name + ", " + date + ", " + genre + ", " + rating + ", " + totalgross + ", " + adjustedgross);
    }

}
