package inheritance;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.round;

public class Facility implements ReviewInterface  {

    private String name ;
    private int price;
    private  double stars;
    double avgStars =0.0;
    double sumReviewStars = 0.0;
    protected int douplicateAuthour;

    private String type;

    List<Review> ListOFReview = new ArrayList<>();

    public  Facility(String name, int price) {
        this.name = name;
        this.price = price;
        this.stars = 0.00 ;

        this.type = this.getClass().getSimpleName();
       // System.out.println(type);
    }

    public String getType() {
        return type;
    }

    public double getStars() {
        return stars;
    }

    public List<Review> getListOFReview() {
        return ListOFReview;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    public void addReview(Review review){
      //  if(!this.type.equals("Theater")) { // this not review for specific Movie.
            Boolean flag = false;
            for (Review rev :
                    this.ListOFReview) {
                if (rev.getAuthor() == review.getAuthor()) {
                    flag = true; // Not update the Stars
                    douplicateAuthour++;  // so not include in calculating the star avg .
                    break;
                    // throw new IllegalArgumentException(); // One user must add one Review //
                }
            }
            //when the restaurant and the review are already associated, the star rating of the restaurant does not update.
            if (flag == true) {
                ListOFReview.add(review);
            } else {
                ListOFReview.add(review);
                updateStars(review);
            }
//        }else{
//
//            System.out.println(this.type.getClass());
//        }
    }
    protected void  updateStars(Review review){
//        double avgStars =0;
//        double sumReviewStars = 0;
//        for (Review review:ListOFReview) {
//            sumReviewStars = sumReviewStars +  review.getStars();
//        }
        sumReviewStars = sumReviewStars +  review.getStars();
        avgStars = sumReviewStars/ (ListOFReview.size()-douplicateAuthour);
        this.stars = (double) Math.round(avgStars * 10) / 10;
        //this.stars = Math.round(avgStars);
       // this.stars = Math.floor(avgStars);

    }
    @Override
    public String toString() {
        return "Facility{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
