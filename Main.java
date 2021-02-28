package Collections;

import java.util.*;
import java.lang.*;



class Employee
{
    Double age;
    String name;
    Double sal;
    public Employee(Double age, String name,
                    Double sal)
    {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }
    public String toString()
    {
        return this.age + " " + this.name +
                " " + this.sal;
    }
}
class Sortsal implements Comparator<Employee>
{
    public int compare(Employee a, Employee b)
    {
        return (int) (a.sal - b.sal);
    }
}
class Main
{
    public static void main (String[] args)
    {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(30d, "Harshit", 50000d));
        list.add(new Employee(22d, "Sanam", 9566d));
        list.add(new Employee(45d, "Chintu", 700000d));



        Collections.sort(list, new Sortsal());

        System.out.println("\nSort");
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));


    }
}