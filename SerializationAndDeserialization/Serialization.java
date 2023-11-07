import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {
        // create object of student class

        try{
            Student student = new Student("Ankit","ankit@123",23,"Gwalior");

        //write data to file
            FileOutputStream fos = new FileOutputStream("file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // how to serialize
            oos.writeObject(student);
            oos.close();
            fos.close();
            System.out.println("Object state is transfered to file ob");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
