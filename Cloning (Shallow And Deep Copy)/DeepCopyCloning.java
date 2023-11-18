package Cloning;

public class DeepCopyCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Gwalior" , "Madhya pradesh" , 474003);

        Employee emp1 = new Employee(1 , "Harsh sikarwar" , "ANR" , address);
        // System.out.println(emp1);
        Employee emp2 = (Employee)emp1.clone();

        System.out.println(emp1); // 1 , Harsh sikarwar , ANR , Gwalior , M.p , 474003
        System.out.println(emp2); // 1 , Harsh sikarwar , ANR , Gwalior , M.p , 474003

        emp1.setEmpId(2);
        emp1.setEmpName("Tejasvi");
        emp1.setCompany("Coedfy");

        System.out.println(emp1); // 2 , Tejasvi , Coedfy , Gwalior , M.p , 474003
        System.out.println(emp2); // 1 , Harsh sikarwar , ANR , Gwalior , M.p , 474003

        emp2.setEmpName("Rani");
        emp2.setEmpId(10);
        emp2.setCompany("Wipro");
        emp2.getAddress().setCity("Banglore");
        emp2.getAddress().setState("Karnataka");
        emp2.getAddress().setPincode(512545);

        System.out.println(emp1);
        System.out.println(emp2);

    }
}
