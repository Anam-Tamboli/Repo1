package Example2;

public class Employee implements SalaryInt, LeavesInt {


@Override
public int sickLeave() {
	// TODO Auto-generated method stub
	return 2;
}
@Override
public int govHoli() {
	// TODO Auto-generated method stub
	return 12;
}
@Override
public int annualSalary() {
	// TODO Auto-generated method stub
	return 25000;
}
public static void main (String args[]) {
	Employee emp=new Employee();
	System.out.println(emp.sickLeave());
	System.out.println(emp.annualSalary());
}
}
