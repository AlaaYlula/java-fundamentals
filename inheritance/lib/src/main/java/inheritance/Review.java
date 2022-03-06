package inheritance;

public class Review {
    String body;
    String author;
    int stars;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        CheckStars(stars);
    }
    public void CheckStars(int stars){
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

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                '}';
    }
}
