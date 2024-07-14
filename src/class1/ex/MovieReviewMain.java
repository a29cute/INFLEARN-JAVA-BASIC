package class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {

        MovieReview movie1 = new MovieReview();
        movie1.title = "영화1";
        movie1.review = "좋음";

        MovieReview movie2 = new MovieReview();
        movie2.title = "영화2";
        movie2.review = "나쁨";

        MovieReview[] movieReview = {movie1, movie2};

        for (int i = 0; i < movieReview.length; i++) {

            MovieReview m = movieReview[i];
            System.out.println("영화 제목 : " + m.title
                    + ", 리뷰: " + m.review);
        }
    }
}
