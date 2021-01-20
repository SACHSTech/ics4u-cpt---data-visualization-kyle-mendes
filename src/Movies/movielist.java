package Movies;

public class movielist {
    private String name; 
    private String date; 
    private String genre;
    private int rating; 
    private int totalgross; 
    private int adjustedgross;

    public movielist(String name, String date, String genre, int rating, int totalgross, int adjustedgross){
        this.name = name;
        this.date = date;
        this.genre = genre;
        this.rating = rating;
        this.totalgross = totalgross;
        this.adjustedgross = adjustedgross;
    
    }
    public String getname() {
        return name;
    }

    public String getdate() {
        return date;
    }

    public String getgenre() {
        return genre;
    }
    public int getrating() {
        return rating;
    }
    public int gettotalgross() {
        return totalgross;
    }
    public int getadjustedgross() {
        return adjustedgross;
    }

    public String toString() {
        return (name + ", " + date + ", " + genre + ", " + rating + ", " + totalgross + ", " + adjustedgross);
    }

}