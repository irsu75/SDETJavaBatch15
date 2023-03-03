package HomeWork30;


import java.util.Map;
import java.util.TreeMap;

public class Task3 {
    /*
    3)Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets
    the highest salary. Output should be in the below format
John Smith=$100000
     */
    public static void main(String[] args) {

        Map<String, Double> employee = new TreeMap<>();
        employee.put("Denis", 125.9);
        employee.put("Roman", 45.7);
        employee.put("Lisa", 148.7);
        employee.put("Elena", 88.8);

        var Emp = employee.entrySet();
        double highSalary = 0;
        String highSalaryEmp = "";
        for (var entry : Emp) {
            if (entry.getValue() > highSalary) {
                highSalary = entry.getValue();
                highSalaryEmp = entry.getKey();
            }
        }
        System.out.println(highSalaryEmp+"="+highSalary);
    }
}
