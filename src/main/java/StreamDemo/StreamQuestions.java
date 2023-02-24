package StreamDemo;


import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamQuestions {
    static List<Employee> employeelist = new ArrayList<>();
    public Integer functionalExample(List<Integer> integers, Function<List<Integer>, Integer> pro) {
        return pro.apply(integers);
    }
    public Integer sum(List<Integer> integers) {
       return integers.stream().reduce(Integer::sum).orElse(0);
    }

    public Integer max(List<Integer> integers) {
        return integers.stream().reduce(Integer::sum).orElse(0);
    }

    public static void main(String[] args) {
        employeelist.add(new Employee(111, "Jiya Berin", 32, "female", "HR", 2011, 25500.00));
        employeelist.add(new Employee(122, "Paul Nekin", 25, "male", "Sales and Marketing", 2015, 35500.00));
        employeelist.add(new Employee(133, "Cjiya Berin", 29, "female", "Security and transport", 2011, 45500.00));
        employeelist.add(new Employee(144, "Biya Kumar", 28, "female", "HR", 2013, 55500.00));
        employeelist.add(new Employee(155, "Jiya Berin1", 21, "male", "Account and finance", 2011, 35530.00));
        employeelist.add(new Employee(166, "Jiya Berin2", 20, "female", "Sales and Marketing", 2011, 35300.00));
        employeelist.add(new Employee(177, "Jiya Berin3", 99, "male", "Infrastructure", 2011, 45500.00));
        employeelist.add(new Employee(188, "Jiya Berin4", 33, "male", "Product development", 2000, 25500.00));
        employeelist.add(new Employee(199, "Jiya Berin5", 45, "female", "Sales and Marketing", 2022, 29500.00));
        employeelist.add(new Employee(200, "Jiya Berin6", 33, "male", "HR", 2017, 22100.00));
        employeelist.add(new Employee(211, "Niya Berin7", 64, "female", "HR", 2006, 88500.00));
        employeelist.add(new Employee(222, "Jiya Berin8", 12, "male", "Security and transport", 2011, 77500.00));
        employeelist.add(new Employee(233, "Kiya Berin9", 10, "male", "Product development", 2015, 66500.00));
        employeelist.add(new Employee(244, "Jiya Berin10", 89, "female", "Account and finance", 2023, 55500.00));
        employeelist.add(new Employee(255, "Jiya Berlin11", 65, "male", "Security and transport", 2032, 43500.00));
        employeelist.add(new Employee(266, "Ali Baig", 43, "male", "Product development", 2022, 234500.00));

        System.out.println("before:"+employeelist.size());

        for (Employee employee : employeelist) {
            if(employee.getName() == "Biya Kumar"){
                employeelist.remove(employee);
            }
        }

        for (Iterator<Employee> itr = employeelist.iterator(); itr.hasNext();) {
            Employee employee = itr.next();
            if (employee.getName() == "Biya Kumar") {
//                employeelist.remove(employee);
                itr.remove();
            }
        }

        int size = employeelist.size();
        for(int i = 0; i< size; i++){
//            switch (employeelist.get(i).getName()) {
//                case "Biya Kumar":
//                    System.out.println("in switch");
//                    break;
//                default:
//
//            }
            if(employeelist.get(i).getName() == "Biya Kumar"){
                System.out.println("remove");
                employeelist.remove(i);
            }
        }
        System.out.println("after:"+employeelist.size());
        System.out.println(employeelist);

        //1. how many males and females are there in employee
        method1();
        Map<String, Long> collect = employeelist.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println();

        //2. Print the name of all departments in the organization
        method2();
        Set<String> collect1 = employeelist.stream().map(Employee::getDepartment).collect(Collectors.toSet());
        System.out.println(collect1);

        //3. What is the average age of male and female employees
        method3();
        Map<String, Double> ageCollector = employeelist.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(ageCollector);

        //4. Get the details of highest paid employee in the organization
        method4();
        employeelist.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println();

        //5. Get the names of all employees who have joined after 2015
        method5();
        employeelist.stream().filter(employee -> employee.getYear() > 2015).map(Employee::getName).collect(Collectors.toList());
        System.out.println();

        //6.Count the number of employees in each department
        method6();
        employeelist.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println();

        //7. What is the avg salary of each department
        method7();
        employeelist.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println();

        //8. Get the details of youngest male employee in the product and development dept
        method8();
        employeelist.stream().filter(employee -> employee.getDepartment().equals("product and development")).min(Comparator.comparingInt(Employee::getAge));
        System.out.println();

        //9. Who has the most working experience in the organization
        method9();
        employeelist.stream().min(Comparator.comparingInt(Employee::getYear));
        System.out.println();

        //10. How many male and female employees are there in sales and marketing team?
        method10();
        employeelist.stream().filter(employee -> employee.getDepartment().equals("sales and marketing "))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println();

        //11. What is the avg salary of male and female employees
        method11();
        employeelist.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println();

        //12. List down the names of all employees in each department
        method12();

        Map<String, List<String>> stringListMap = employeelist.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println(stringListMap);


        //13. What is the avg salary and total salary of the whole organization
        method13();
        DoubleSummaryStatistics collect2 = employeelist.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println();

        //14. Separate the employees who are younger or equal to 25 years from those who are older than 25 years.
        method14();
        Map<Boolean, List<Employee>> collect3 = employeelist.stream().collect(Collectors.partitioningBy(employee -> employee.getAge() > 25, Collectors.toList()));
        System.out.println();

        //15. Who is the oldest employee in the organization. What is his age and which departments he belngs to:
        method15();
        Optional<Employee> max = employeelist.stream().max(Comparator.comparingInt(Employee::getAge));
        System.out.println();

        Stream<Employee> employeeStream = employeelist.stream().takeWhile(employee -> employee.getAge() > 12)
                .peek(employee -> {
        });
    }

    public static void method1(){
        System.out.println("1. how many males and females are there in employee: ");
        Map<String, Long> noOfMaleAndFemaleEmp = employeelist.stream()
                .collect(Collectors.groupingBy(
                Employee::getGender,
                Collectors.counting()
        ));
        System.out.println(noOfMaleAndFemaleEmp);
    }

    public static void method2(){
        System.out.println("2. Print the name of all departments in the organization: ");
        employeelist.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);
    }

    public static void method3(){
        System.out.println("3. What is the average age of male and female employees:");
        Map<String, Double> averageAgeOfMaleAndFemale = employeelist.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.averagingInt(Employee::getAge)
                ));
        System.out.println(averageAgeOfMaleAndFemale);
    }

    public static void method4(){
        System.out.println("4. Get the details of highest paid employee in the organisation:");
        Optional<Employee> highestPaidEmployer =  employeelist.stream()
                .max(Comparator.comparingDouble(
                        Employee::getSalary
                ));
        System.out.println(highestPaidEmployer.get().getName());
    }

    public static void method5(){
        System.out.println("5. Get the names of all employees who have joined after 2015:");
        employeelist.stream().map(Employee::getYear).filter(e -> e > 2015).forEach(System.out::println);
        //or
        //it will give you the name, thats why we have used map after the filter
        employeelist.stream()
                .filter(e -> e.getYear() > 2015)
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    public static void method6(){
        System.out.println("6. Count the number of employees in each department:");
        Map<String, Long> countnumberOfEmpInEachDept = employeelist.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));
        System.out.println(countnumberOfEmpInEachDept);
    }

    public static void method7(){
        System.out.println("7. What is the avg salary of each department:");
        Map<String, Double> avgSalaryOfEachDept = employeelist.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        System.out.println(avgSalaryOfEachDept);
    }

    public static void method8(){
        System.out.println("8. Get the details of youngest male employee in the product and development dept:");

        Optional<Employee> youngestEmpInProductDeveDept =
                employeelist.stream()
                        .filter(e ->
                                Objects.equals(e.getGender(), "male") &&
                                Objects.equals(e.getDepartment(), "Product development"))
                        .min(Comparator.comparingInt(Employee::getAge));

        System.out.println(youngestEmpInProductDeveDept.get().getName());
    }

    public static void method9(){
        System.out.println("9. Who has the most working experience in the organization:");

        Optional<Employee> mostWorkingExp = employeelist.stream()
                .min(Comparator.comparingInt(Employee::getYear));

        System.out.println(mostWorkingExp.get().getName());

        //or
        Optional<Employee> mostWorkingExp1 = employeelist.stream().
                sorted(Comparator.comparingInt(Employee::getYear)).
                findFirst();
        System.out.println(mostWorkingExp1.get().getName());


    }

    public static void method10(){
        System.out.println("10. How many male and female employees are there in sales and marketing team:");

        Map<String, Long> maleFemaleCountInSalesMarkDept = employeelist.stream()
                .filter(e -> Objects.equals(e.getDepartment(), "Sales and Marketing"))
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.counting()
                ));

        System.out.println(maleFemaleCountInSalesMarkDept);
    }

    public static void method11(){
        System.out.println("11. What is the avg salary of male and female employees: ");

        Map<String, Double> avgSalOfMaleAndFemale = employeelist.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        System.out.println(avgSalOfMaleAndFemale);
    }

    public static void method12(){
        System.out.println("12. List down the names of all employees in each department:");

        Map<String, List<Employee>> empListByDept = employeelist.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment
                ));
        for(Map.Entry<String, List<Employee>> map : empListByDept.entrySet()){
            System.out.println(map.getKey()+": ");
            map.getValue().forEach((n) -> System.out.println(n.getName()));
        }

    }

    public static void method13(){
        System.out.println("13. What is the avg salary and total salary of the whole organization: ");
        Double avgSalary = employeelist.stream().collect(
                Collectors.averagingDouble(Employee::getSalary)
        );
        System.out.println(avgSalary);
        //or


        DoubleSummaryStatistics collect = employeelist.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        Double avgSal = collect.getAverage();
        Double totalSal = collect.getSum();


        System.out.println("avgSal:"+avgSal);
        System.out.println("totalSal:"+totalSal);
    }

    public static void method14(){
        System.out.println("14. Separate the employees who are younger or equal to 25 years from those who are older than 25 years: ");

        Map<Boolean, List<Employee>> partitioningEmpByAge = employeelist.stream()
                .collect(
                        Collectors.partitioningBy(e -> e.getAge() > 25)
                );

        System.out.println(partitioningEmpByAge);
    }

    public static void method15(){
        System.out.println("15. Who is the oldest employee in the organization. What is his age and which departments he belngs to:");
//        Optional<Employee> oldestEmpDetails = employeelist.stream().
//                sorted(Comparator.comparing(Employee::getYear)).
//                findFirst();

        Optional<Employee> oldestEmpDetails = employeelist.stream()
                .max(Comparator.comparing(Employee::getAge));
        System.out.println("Age: "+oldestEmpDetails.get().getAge());
        System.out.println("Dept: "+oldestEmpDetails.get().getDepartment());
    }



}
