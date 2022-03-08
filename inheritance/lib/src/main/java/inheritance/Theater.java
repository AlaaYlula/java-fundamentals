package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Facility {

    private List<String> AllMovies = new ArrayList<>();

    public Theater(String name, List<String> allMovies) {
        super(name,0);
        AllMovies = allMovies;
    }

    public List<String> getAllMovies() {
        return AllMovies;
    }

    public void addMovie(String movie){
        Boolean flag = false;
        if(AllMovies == null){
            AllMovies.add(movie);
        }
        else {
            for (String mov :
                    AllMovies) {
                if (mov == movie) {
                    System.out.println("The Movie Already Added");
                    flag = true;
                }
            }
            if (flag == false) {
                AllMovies.add(movie);
            }
        }
    }

    public void RemoveMovie(String movie){
        Boolean flag = false;
        if(AllMovies == null){
            System.out.println("There is no movies to Remove");
        }else{
            for (int i = 0; i < AllMovies.size(); i++) {
                if(AllMovies.get(i) == movie){
                    AllMovies.remove(i);
                    flag = true;
                }
            }
        }
        if(flag == false){
            System.out.println("There is no Movie "+ movie +" to Remove it");
        }
    }

    @Override
    public void addReview(Review review) {
        Boolean flagCheckAuthor = false; // Check it the Author add a Review for the movie
        Boolean flagCheckMovie = false; // Movie not in the List

        if(review.getMovieName() != null) { // the User Enter the Movie Name
            for (String mov :
                    AllMovies) {
                if (review.getMovieName() == mov) {
                    flagCheckMovie = true; // Movie in the List
                    break;
                }
            }
            if (flagCheckMovie == false) { // To check if the Movie you want to Review is in the List or not
                System.out.println("There is no movie called " + review.getMovieName() + " in the Movies List");
            } else {
                for (Review rev :
                        getListOFReview()) {//|| rev.getMovieName() == review.getMovieName()
                    if (rev.getAuthor() == review.getAuthor() ) { // Check if the Author add Review for this movie before this time
                        flagCheckAuthor = true; // Not update the Stars
                        super.douplicateAuthour++; // so not include in calculating the star avg .
                        break;
                        // throw new IllegalArgumentException(); // One user must add one Review //
                    }
                }

                //when the restaurant and the review are already associated, the star rating of the restaurant does not update.
                if (flagCheckAuthor == true) {
                    //    updateMovieStars(review);
                    getListOFReview().add(review);
                } else {
                    getListOFReview().add(review);
                    super.updateStars(review);
                }
            }
        }else{ // the user not Enter the Movie name.
            flagCheckAuthor = false;
            for (Review rev :
                    getListOFReview()) {
                if (rev.getAuthor() == review.getAuthor() && rev.getMovieName() == review.getMovieName()) { // Check if the Author add Review for this movie before this time
                    flagCheckAuthor = true; // Not update the Stars
                    super.douplicateAuthour++; // so not include in calculating the star avg .
                    break;
                    // throw new IllegalArgumentException(); // One user must add one Review //
                }
            }

            //when the restaurant and the review are already associated, the star rating of the restaurant does not update.
            if (flagCheckAuthor == true) {
                //    updateMovieStars(review);
                getListOFReview().add(review);
            } else {
                getListOFReview().add(review);
                super.updateStars(review);
            }
        }

    }
//    private  void updateMovieStars(Review review){
//        int avgStars =0;
//        int sumReviewStars = 0;
//        int numberOfMovie = 0 ;
//        for (String movie: AllMovies) {
//            if(movie.equals(review.getMovieName())) {
//                sumReviewStars = sumReviewStars + review.getStars();
//                numberOfMovie++;
//            }
//        }
//        avgStars = sumReviewStars/ numberOfMovie;
//        for (String movie: AllMovies) {
//            if(movie.equals(review.getMovieName())) {
//                review.setStars(avgStars);
//            }
//        }
//    }
        @Override
    public String toString() {
        return "Theater{" +
                "name='" + this.getName() + '\'' +
                ", stars=" + this.getStars() +
                ", AllMovies=" + AllMovies +
                ", ListOFReview=" + this.getListOFReview() +
                '}';
    }
}
