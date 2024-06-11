package mindtek.HW;

import java.util.ArrayList;
import java.util.List;

public class EmployeeProcessor {

    public static List<String> processEmployees(List<Employee> employees, Condition<Employee> condition, AttributeFunction<Employee, String> function){
        List<String> results = new ArrayList<>();
 //       double avgSalary = 0;
        int count = 0;
        for(Employee e: employees){
            if(condition.apply(e)){
                count++;
                function.execute(e);
                results.add(String.valueOf(e));
                results.add(String.valueOf(e.getSalary()/count));
            }
        }
        return results;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 60000.0, "HR"));
        employees.add(new Employee("Bob", 45, 80000.0, "IT"));
        employees.add(new Employee("Charlie", 25, 50000.0, "IT"));
        employees.add(new Employee("David", 35, 70000.0, "Finance"));
        employees.add(new Employee("Eve", 40, 90000.0, "HR"));

        Condition<Employee> itDepartmentCondition = e -> e.getDepartment().equals("IT");
        AttributeFunction<Employee, String> nameToUpperCase = x -> x.getName().toUpperCase();

        List<String> result = EmployeeProcessor.processEmployees(employees, itDepartmentCondition, nameToUpperCase);

        for(String r: result){
            System.out.println(result);
        }
    }

}
