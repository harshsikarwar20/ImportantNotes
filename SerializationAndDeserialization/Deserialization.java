import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserial {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("file.txt"); 
            // This will read the file 

            ObjectInputStream ois = new ObjectInputStream(fis);

            // The return type of readObject() is object that is by we are storing
            // that in the object and also doing type casting.
            Student student = (Student)ois.readObject();
            student.displayName();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
