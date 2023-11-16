public class UpcastingInParameter {

    public static class Movie{
        int duration;
        String name;
        char rating;
        String genre;

        public Movie(int duration){
            // this.duration = duration;
            System.out.println("Integer Constructor");
        }
        public Movie(char rating){
            // this.rating = rating;
            System.out.println("Character Constructor");
        }
        public Movie(long rating){
            // this.rating = rating;
            System.out.println("Long Constructor");
        }
    }
    public static void main(String[] args) {
        // NOEXACT MATCH FOUND : MOVIE(CHAR)
        // CHAR TYPE PROMOTED TO INTEGER (UPCASTING - IMPLICIT)
        Movie Boss = new Movie('A');
        System.out.println(Boss.rating);


        // COMPILATION ERROR : LONG DONATED TO INTEGER 
        // (DOWNCASTING -IMPLICITLY NOT POSSIBLE)
        // Movie Boss1 = new Movie(180l);         here L is "Long"............
        // System.out.println(Boss.duration);

        // NO EXACT MATCH FOUND : MOVIE (LONG)
        // LONG TYPE DEMOTED TO INTEGER (DOWNCASTING - EXPLICIT)


        // Movie Boss2 = new Movie( (int)180l);
        // System.out.println(Boss.duration);
    }
}
// Richanaya bhadoriya
