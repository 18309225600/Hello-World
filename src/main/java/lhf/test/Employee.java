package lhf.test;

public class Employee {
    private Long id;
    private String name;
    private String gender;
    private double salary;


    public Employee() {
    }

    public Employee(Long id, String name, String gender,double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
