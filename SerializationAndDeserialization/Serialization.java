import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {
        // create object of student class

        try{
            Student student = new Student("Ankit","ankit@123",23,"Gwalior");

        
            FileOutputStream fos = new FileOutputStream("file.txt");  //write data to file
            // A file output stream is an output stream for writing data to a File or to a FileDescriptor .
            
            ObjectOutputStream oos = new ObjectOutputStream(fos); 
            // An ObjectOutputStream writes primitive data types and graphs of Java objects to an OutputStream. 
            // The objects can be read (reconstituted) using an ObjectInputStream. 
            // Persistent storage of objects can be accomplished by using a file for the stream.

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
