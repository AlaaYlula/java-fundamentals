package inheritance;

import org.apache.commons.math3.stat.descriptive.SummaryStatistics;

import java.util.ArrayList;
import java.util.List;

public class Resturant extends Facility {


    public Resturant(String name, int price) {
        super(name,price);
    }


    @Override
    public String toString() {
        return "Resturant{" +
                "name='" +this.getName() + '\'' +
                ", stars=" + this.getStars() +
               // ", price=" + this.getPrice() +
                ", ListReview=" + ListOFReview +
                '}';
    }
}
