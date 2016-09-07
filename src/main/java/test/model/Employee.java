package test.model;

import java.math.BigDecimal;

/**
 * Created by yuryandreev on 06/09/16.
 */
public class Employee {
    private String name;
    private Integer year;
    private BigDecimal salary;

    public Employee(String name, Integer year, BigDecimal salary) {
        this.name = name;
        this.year = year;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
