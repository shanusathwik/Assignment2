package qwerty;

import java.util.ArrayList;
import java.util.Scanner;




class Employee {
    String firstname;
    String lastname;
    int age;
    int salary;

    public Employee(String firstname, String lastname, int age, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;

    }


}

public class CollectionsJava {
    public static   void main(String[] args) {
        Employee em1 = new Employee("Hemanth", "Rachabattuni", 23, 39000);
        Employee em2 = new Employee("praveen", "kalvakuntala", 24, 37000);
        Employee em3 = new Employee("preetham", "sai", 22, 36000);
        Employee em4 = new Employee("naresh", "Annam", 25, 37500);
        Employee em5 = new Employee("sravani", "madiraju", 35, 40000);

        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(em1);
        emp.add(em2);
        emp.add(em3);
        emp.add(em4);
        emp.add(em5);


        CollectionsJava m = new CollectionsJava();
        m.employeeDetails(emp);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lastname ");
        String lastname = sc.next();
        m.empLastName(emp, lastname);
        int maxAge = 0;
        int minAge = 0;
        m.maxAge(emp, maxAge, minAge);
        int sal = 0;
        m.maxSalary(emp, sal);




    }

    public void employeeDetails(ArrayList<Employee> emp) {
        for (Employee a : emp) {
            System.out.println(a.firstname + " " + " " + a.lastname + " " + " " + a.age + " " + " " + a.salary);
        }


    }

    public void empLastName(ArrayList<Employee> emp, String lastname) {

        for (Employee b : emp) {
            if ((b.lastname).equals(lastname)) {
                System.out.println("The employee details of lastname " + b.firstname + " " + b.lastname + " " + b.salary + " " + b.age);
            }
        }
    }

    public void maxAge(ArrayList<Employee> emp, int maxAge, int minAge) {
        maxAge = 0;
        float agee = 0;
        float count = 0;

        for (Employee c : emp) {
            if (c.age > maxAge) {
                maxAge = c.age;
            }
            minAge = maxAge;
            for (Employee d : emp) {
                if (d.age < minAge) {
                    minAge = d.age;
                }
            }
            for (Employee f : emp) {
                agee = agee + f.age;
                count++;
            }

        }
        System.out.println("the average age will be " + (agee) / (count));
        System.out.println("Employee Details of max age " + maxAge);
        System.out.println("Employee Details of min age " + minAge);


    }

    public void maxSalary(ArrayList<Employee> emp, int sal) {

        for (Employee g : emp) {
            if (g.salary > sal) {
                sal = g.salary;
                g.salary = sal;
                System.out.println("the details of employee with max salary is " + g.firstname + " " + g.lastname + " " + g.age + " " + g.salary);
            }

        }
    }

}
