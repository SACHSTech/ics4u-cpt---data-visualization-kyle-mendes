package Data;

public class Movies {
    private String name; 
    private String date; 
    private String genre;
    private String rating; 
    private int totalgross; 
    private int adjustedgross;

    public Movies(String name, String date, String genre, String rating, int totalgross, int adjustedgross){
        this.name = name;
        this.date = date;
        this.genre = genre;
        this.rating = rating;
        this.totalgross = totalgross;
        this.adjustedgross = adjustedgross;
    
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating ) {
        this.rating = rating;
    }

    public int getTotalgross() {
        return totalgross;
    }

    public void setTotalgross(int totalgross ) {
        this.totalgross = totalgross;
    }

    public int getAdjustedgross() {
        return adjustedgross;
    }

    public void setAdjustedgross(int adjustedgross) {
        this.adjustedgross = adjustedgross;
    }

    public String toString() {
        return (name + ", " + date + ", " + genre + ", " + rating + ", " + totalgross + ", " + adjustedgross);
    }

}