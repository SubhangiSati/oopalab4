class Employee
{
	String name; int empid; int salary;
	Employee()
	{
		name="NULL"; empid=0; salary=0;
	}
	Employee(String name, int empid, int salary)
	{
		this.name=name; this.empid=empid; this.salary=salary;
	}
	String name1()
	{
		return name;
	}
	int salary1()
	{
		return salary;
	}
	int raisesalary()
	{
		int d= 30%salary; return salary+d;
	}
}
class Manager extends Employee
{
	String department;
	Manager(String name, int empid, int salary, String department)
	{
		super(name,empid,salary); this.department=department;
	}
	String department1()
	{
		return department;
	}
}
class Main
{
	public static void main(String args[])
	{
		Manager m1=new Manager("Subhangi",500095938,8900000,"AIML");
		String s1= m1.name;
		System.out.println("NAME= "+s1); int i1=m1.salary1();
		System.out.println("SALARY= "+i1); int i2=m1.raisesalary();
		System.out.println("INCREASED SALARY= "+i2); 
		String s2=m1.department1();
		System.out.println("DEPARTMENT= "+s2);
	}
}
 