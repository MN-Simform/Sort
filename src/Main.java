import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(101,"Nimit",10000));
        emp.add(new Employee(104,"Nim",20000));
        emp.add(new Employee(102,"Smit",30000));
        emp.add(new Employee(103,"Sim",40000));

        System.out.println("Sort Using Comparable:");
        Collections.sort(emp);
        emp.forEach((e)-> System.out.println(e.id + " " + e.name + " " + e.salary));
        System.out.println();

        System.out.println("Sort Using Comparator:");
        System.out.println("Sort By Id");
        Collections.sort(emp,new CompareId());
        emp.forEach((e)-> System.out.println(e.id + " " + e.name + " " + e.salary));
        System.out.println();

        System.out.println("Sort By Name");
        Collections.sort(emp, new CompareName());
        emp.forEach((e)-> System.out.println(e.id + " " + e.name + " " + e.salary));
        System.out.println();

        System.out.println("Sort By Salary");
        Collections.sort(emp, new CompareSal());
        emp.forEach((e)-> System.out.println(e.id + " " + e.name + " " + e.salary));
        System.out.println();

        System.out.println("Sort Using Lambda Expression: ");
        System.out.println("By Id");
        emp.sort(Comparator.comparingInt((Employee e) -> e.id));
        emp.forEach((e) -> System.out.println(e.id + " " + e.name + " " + e.salary));
        System.out.println();

        System.out.println("By Name");
        emp.sort(Comparator.comparing((Employee e) -> e.name));
        emp.forEach((e) -> System.out.println(e.id + " " + e.name + " " + e.salary));
        System.out.println();

        System.out.println("By Salary");
        emp.sort(Comparator.comparingInt((Employee e) -> e.salary));
        emp.forEach((e) -> System.out.println(e.id + " " + e.name + " " + e.salary));
        System.out.println();
    }
}