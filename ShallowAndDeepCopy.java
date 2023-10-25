
public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        Student s = new Student(1, "Adarsh" , new Address("Kota" , "Rajasthan"));
        // System.out.println(s.getId()+" "+s.getName()+" "+s.getAddress().getCity()+" "+s.getAddress().getState());
        Student s1 = (Student)s.clone();
        s.setName("pinki");
        s.getAddress().setCity("jaipur");

        System.out.println(s.getId()+" "+s.getName()+" "+s.getAddress().getCity()+" "+s.getAddress().getState());
        System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getAddress().getCity()+" "+s1.getAddress().getState());
    }
}
class Student implements Cloneable {
    private int id;
    private String name;

    private Address address;

    public Student (int id , String name , Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Object clone(){
        // return new Student(this.getId() , this.getName() , this.getAddress());
        return new Student(this.getId() , this.getName() , new Address(this.getAddress().getCity(), this.getAddress().getState()));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
}
class Address{
    private String city;
    private String state;

    public Address(String city , String state){
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
// id and name will be changed but address will not be because it is re
