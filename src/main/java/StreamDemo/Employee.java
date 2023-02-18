package StreamDemo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private int year;
    private double salary;
}
