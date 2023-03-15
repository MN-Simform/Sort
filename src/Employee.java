public class Employee implements Comparable<Employee> {
    public int id;
    public String name;
    public int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee e) {
        if(id == e.id)
            return 0;
        else if(id > e.id)
            return 1;
        else
            return -1;
    }

//    @Override
//    public int compareTo(Employee e) {
//        return this.name.compareTo(e.name);
//    }

//    @Override
//    public int compareTo(Employee e) {
//        if(salary == e.salary)
//            return 0;
//        else if(salary > e.salary)
//            return 1;
//        else
//            return -1;
//    }
}
