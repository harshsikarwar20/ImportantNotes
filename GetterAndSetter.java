
class Movie{
    private int duration;
    private String name;
    private double rating;
    private String genre;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
public class GetterAndSetter {
    public static void main(String[] args) {
        Movie KGF = new Movie();
        KGF.setDuration(150);
        KGF.setName("EL - DORADO");
        KGF.setRating(10.0);
        KGF.setGenre("Action");

        System.out.println(KGF.getDuration()+"    " + KGF.getName()+"    " + KGF.getRating()+"    " + KGF.getGenre());
    }

}

// javac oopsConcept/GetterAndSetter.java
// java oopsConcept/GetterAndSetter