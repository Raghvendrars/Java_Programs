import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
class prog35
{
	public static void main(String args[])
	{
		List<String> liststring = Arrays.asList("orange","mango","apple");
		System.out.println("before sorting :- "+liststring);
		Collections.sort(liststring);
		System.out.println("after sorting :- "+liststring);
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("rahul",22));
		emp.add(new Employee("raina",20));
		emp.add(new Employee("kohli",22));
		emp.add(new Employee("virat",19));
		Iterator itr = emp.iterator();
		System.out.println("BEFORE SORTING:");
		while(itr.hasNext())
		{
			Employee e = (Employee)itr.next();
			System.out.println(e.name +" "+e.age);
		}
		Collections.sort(emp,new empAgeCompare());

		itr = emp.iterator();
		System.out.println("AFTER SORTING:");
		while(itr.hasNext())
		{
			Employee e = (Employee)itr.next();
			System.out.println(e.name +" "+e.age);
		}
	}
}
class Employee
{
	String name;
	int age;
	Employee(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	void set_name(String name)
	{
		this.name=name;
	}
	void set_age(int age)
	{
		this.age=age;
	}
	String get_name()
	{
		return name;
	}
	int get_age()
	{
		return age;
	}
}
class empAgeCompare implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return e1.get_age() - e2.get_age();
	}
}
