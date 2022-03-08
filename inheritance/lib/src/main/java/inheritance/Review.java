package inheritance;

public class Review  {
   private String body;
    private String author;
    private double stars;

    private String movieName;

    public Review( String author ,String body,double stars) { // Review For the Shop // Review For the Theatre // Resturant
        this.body = body;
        this.author = author;
        CheckStars(stars);
    }

    public Review( String author ,String body,double stars,String movieName) { // Review For the Theater
        this.body = body;
        this.author = author;
        this.movieName = movieName;
        CheckStars(stars);
    }
    public void CheckStars(double stars){
        if(stars <= 5 && stars > 0 ){
            this.stars = stars;
        }else {
            throw new IllegalArgumentException();
            //System.out.println(" The Stars must be between the 0 and 5 ");
        }
    }
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getMovieName() {
        return movieName;
    }

    @Override
    public String toString() {
        if(this.movieName == null) {
            return "Review{" +
                    " author='" + author + '\'' +
                    ", body='" + body + '\'' +
                    ", stars=" + stars +
                    '}';

        }
        return "Review{" +
                "Movie Name='" + movieName + '\'' +
                ", author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", stars=" + stars +
                '}';
    }
}
