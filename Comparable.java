public class Emp implements Comparable<Emp>{ //implements Comparable<Emp>
    private Integer id;
    private String name;
    private Integer salary;
    private Integer age;

    @Override
    public int compareTo(Emp o) {
        // TODO Auto-generated method stub
        return this.getId()-o.getId();
    }

    public Emp(Integer id, String name, Integer salary, Integer age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    /**
     * @return Integer return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Integer return the salary
     */
    public Integer getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    /**
     * @return Integer return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
    }
}
