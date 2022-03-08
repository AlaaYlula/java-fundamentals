package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop extends  Facility {

    private String description;

    public Shop(String name, String description, int numberOfDollar) {
        super(name,numberOfDollar);
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + this.getName() + '\'' +
                ", description='" + description  + '\'' +
                ", stars=" + this.getStars() +
                //", numberOfDollar=" + this.getPrice() +
                ", ListOFReview=" + this.getListOFReview() +
                '}';
    }

//    @Override
//    public void addReview(Review review) {
//            ListOFReview.add(review);
//        }
    }

