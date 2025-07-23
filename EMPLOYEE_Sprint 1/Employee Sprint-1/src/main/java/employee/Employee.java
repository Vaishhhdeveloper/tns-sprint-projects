package employee;

import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer EmployeeId;
    private String name;
    private String position;
    private double salary;
    

    // Generate getter and setter
    public Integer getId() {
        return EmployeeId;
    }

    public void setEmployeeId(Integer EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
 // Generate constructors
    public Employee() {
        super();
    }
    
    public Employee(String name, String position, double salary, int EmployeeId) {
        super();
        this.EmployeeId = EmployeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Generate toString()
    @Override
    public String toString() {
        return "Employee [ EmployeeId=" + EmployeeId + ", name=" + name + ", position=" + position + ", salary=" + salary + "]";
    }
}

