package Cloning;

public class Employee implements Cloneable{
    private int empId;
    private String empName;
    private String company;

    private Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        // return super.clone(); // Shallow copy
        return 
        new Employee(this.empId , this.empName , this.company , 
        new Address(this.getAddress().getCity() , this.getAddress().getState() , this.getAddress().getPincode()));
    }

    public Employee() {
    }

    public Employee(int empId, String empName, String company, Address address) {
        this.empId = empId;
        this.empName = empName;
        this.company = company;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", company=" + company + ", address=" + address
                + "]";
    }

    
}