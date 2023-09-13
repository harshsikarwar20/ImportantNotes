public class Constructor {
    public static class Movie {
        int duration;
        String name;
        double rating;
        String genre;

        // Default implicit constructor
        // Movie(){

        // }
        // Setting values directly in the default constructor...
        // Default explicit constructor
        Movie(){
            duration = 150;
            name = "Brother";
            rating = 4.0;
            genre = "Comedy";
        }
        
        // Parameterised constructor...........
        Movie(int duration , String name , double rating , String genre){
            this.duration = duration;
            this.name = name;
            this.rating = rating;
            this.genre = genre;
        }
    }
    public static void main(String[] args) {
        Movie Brother = new Movie();
        System.out.println(Brother.name + " " + Brother.duration + " " + Brother.rating + " " + Brother.genre);


        Movie Boss = new Movie(250, "Boss", 10, "Action + Comedy");
        System.out.println(Boss.name + " " + Boss.duration + " " + Boss.rating + " " + Boss.genre);
    }
}
