package Collections;
import java.util.*;
import java.lang.*;
class Student
{
    Double age;
    String name;
    Double score;
    public Student(Double age, String name,
                    Double score)
    {
        this.age = age;
        this.name = name;
        this.score = score;
    }
    //for displaying
    public String toString()
    {
        return this.age + " " + this.name +
                " " + this.score;
    }
}
class SortScore implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
//        return (int) (a.score - b.score);
        double res = a.score - b.score;
        if(res == 0){
            return a.name.compareTo(b.name);
        }
        return (int) res;
    }

}
class questionFive
{
    public static void main (String[] args)
    {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(12d, "Harshit", 99d));
        list.add(new Student(13d, "Aanam", 99d));
        list.add(new Student(11d, "Chintu", 70d));
        Collections.sort(list, new SortScore());
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
    }
}
