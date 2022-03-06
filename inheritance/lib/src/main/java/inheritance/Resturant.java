package inheritance;

import org.apache.commons.math3.stat.descriptive.SummaryStatistics;

import java.util.ArrayList;
import java.util.List;

public class Resturant {
    String name;
    int stars;
    int price;
     List<Review> ListOFReview = new ArrayList<>();

    public Resturant(String name, int price) {
        this.name = name;
        this.price = price;
        this.stars = 0 ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void addReview(Review review){
        Boolean flag = false;
        for (Review rev:
             ListOFReview) {
            if(rev.getAuthor() == review.getAuthor()){
                flag = true; // Not update the Stars
               // throw new IllegalArgumentException(); // One user must add one Review //
            }
        }
        //when the restaurant and the review are already associated, the star rating of the restaurant does not update.
        if(flag == true) {
            ListOFReview.add(review);
        }else{
            ListOFReview.add(review);
            updateStars(review.getStars());

        }
    }
    private void  updateStars(int reviewStars){
        int avgStars =0;
        int sumReviewStars = 0;
        for (Review review:ListOFReview) {
            sumReviewStars = sumReviewStars +  review.getStars();
        }
        avgStars = sumReviewStars/ ListOFReview.size();
        this.stars = avgStars;
    }
    @Override
    public String toString() {
        return "Resturant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price=" + price +
                ", ListReview=" + ListOFReview +
                '}';
    }
}
