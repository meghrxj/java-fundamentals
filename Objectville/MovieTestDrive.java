package Objectville;
public class MovieTestDrive {

    public static void main(String[] args) {

        Movie one = new Movie();
        one.title = "Extinction";
        one.genre = "Sci-fic";
        one.imdbrating = 9;

        Movie two = new Movie();
        two.title = "Hereditary";
        two.genre = "Horror";
        two.imdbrating = 7;

        Movie three = new Movie();
        three.title = "Nightcrawler";
        three.genre = "Comedy, Thriller";
        three.imdbrating = 8;
//play with the algorithms
        if (one.imdbrating == 10) {
            one.playIt();
        } else if (two.imdbrating > 6) {
            two.playIt();
        }
    }
    
}
