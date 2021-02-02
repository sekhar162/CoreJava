package com.demo.comparatorandcomparable;

import java.util.Comparator;
import java.util.TreeSet;

class EmployeeDemo implements Comparable<Object>
{
int eid;
String name;
public EmployeeDemo(String name,int eid) 
{
this.name=name;
this.eid=eid;
}
	@Override
	public int compareTo(Object obj)
	{
		int eid1=this.eid;
		EmployeeDemo em=(EmployeeDemo)obj;
		int eid2=em.eid;
		if(eid1<eid2)
		{
			return -1;
		}
		else if(eid1>eid2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
	@Override
	public String toString() {
		return "EmployeeDemo [eid=" + eid + ", name=" + name + "]";
	}
	


}
public class Employee
{
	public static void main(String[] args)
	{
	EmployeeDemo e1=new EmployeeDemo("vishal",10);
	EmployeeDemo e2=new EmployeeDemo("manas",24);	
	EmployeeDemo e3=new EmployeeDemo("vikash",5);	
	EmployeeDemo e4=new EmployeeDemo("aman",2);	
	EmployeeDemo e5=new EmployeeDemo("amit",43);	
	EmployeeDemo e6=new EmployeeDemo("navneet",10);	
	EmployeeDemo e7=new EmployeeDemo("xz",23);
	System.out.println("sorting by id using Comparable");

	TreeSet<EmployeeDemo> t1=new TreeSet<>();
	t1.add(e1);
	t1.add(e2);
	t1.add(e3);
	t1.add(e4);
	t1.add(e5);
	t1.add(e6);
	t1.add(e7);
System.out.println(t1);
System.out.println("--------------------------");

System.out.println("sorting by Name using Comparator");
TreeSet<EmployeeDemo> t2=new TreeSet<>(new ComparatorDemo());
t2.add(e1);
t2.add(e2);
t2.add(e3);
t2.add(e4);
t2.add(e5);
t2.add(e6);
t2.add(e7);
System.out.println(t2);
	}
}
class ComparatorDemo implements Comparator<Object>
{

	@Override
	public int compare(Object ob1, Object ob2)
	{
		EmployeeDemo e1=(EmployeeDemo) ob1;
		EmployeeDemo e2=(EmployeeDemo) ob2;
		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2);
	}
	
}
