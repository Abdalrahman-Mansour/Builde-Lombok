import Builder.Employee;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Employee employee = new  Employee.EmployeeBuilder().setSalary(2600)
                .setName("ALi").
                setDepartment("DEVOOPS")
                .setAge(25).build();
        System.out.println(employee.toString());
    }
}
