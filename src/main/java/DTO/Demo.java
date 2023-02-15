package DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name="demo")
public class Demo {
	@Id
private int empid;
	@Column(nullable=false)
private String name;
private double salary;
@Column(nullable=false)
private String jobrole;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public void setName(String name) {
	this.name = name;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getJobrole() {
	return jobrole;
}
public void setJobrole(String jobrole) {
	this.jobrole = jobrole;
}
@Override
public String toString() {
	return "Demo [empid=" + empid + ", name=" + name + ", salary=" + salary + ", jobrole=" + jobrole + "]";
}

}
