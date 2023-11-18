package Cloning;
public class ShallowCopyCloning{
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Gwalior" , "Madhya pradesh" , 474003);

        Employee emp1 = new Employee(1 , "Harsh sikarwar" , "ANR" , address);
        // System.out.println(emp1);
        Employee emp2 = (Employee)emp1.clone();

        System.out.println(emp1);
        System.out.println(emp2); // Till here both will be having same values...

        System.out.println();


        emp2.getAddress().setCity("Kota");
        System.out.println(emp1); // 1 , Harsh sikarwar , ANR , Kota , M.p ,474003
        System.out.println(emp2); // 1 , Harsh sikarwar , ANR , Kota , M.p ,474003

        System.out.println();

        emp2.setEmpName("Tejasvi");
        System.out.println(emp1); // 1 , Harsh sikarwar , ANR , Kota , M.p ,474003
        System.out.println(emp2); // 1 , Tejasvi , ANR , Kota , M.p ,474003



    }
}