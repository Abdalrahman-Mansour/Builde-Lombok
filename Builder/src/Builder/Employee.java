package Builder;

import lombok.ToString;

@ToString
public class Employee {
    private String name ;
    private double salary;
    private int age ;
    private String department ;
    private Employee(EmployeeBuilder employeeBuilder){
        name = employeeBuilder.name;
        salary = employeeBuilder.salary;
        age = employeeBuilder.age;
        department = employeeBuilder.department;
    }
    public static class EmployeeBuilder{
        private String name ;
        private double salary;
        private int age ;
        private String department ;
        public  EmployeeBuilder(){

        }
        public EmployeeBuilder setName(String name)
        {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setSalary(double salary)
        {
            this.salary = salary;
            return this;
        }

        public EmployeeBuilder setAge(int age)
        {
            this.age = age;
            return this;
        }

        public EmployeeBuilder setDepartment(String department)
        {
            this.department = department;
            return this ;
        }


        public Employee build(){

            return new Employee(this);
        }

    }
}