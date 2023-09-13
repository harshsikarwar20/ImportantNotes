class Movie{
    int duration;
    String name;
    double rating;
    String genre;
}
public class ClassesAndObject{
    
    public static void main(String[] args) {
        Movie avenger = new Movie();
        avenger.duration = 300;
        avenger.name = "Avenger End Game";
        avenger.rating = 5.0;
        avenger.genre = "Action";

        System.out.println(avenger.duration);
        System.out.println(avenger.name);
        System.out.println(avenger.rating);
        System.out.println(avenger.genre);
    }
}
