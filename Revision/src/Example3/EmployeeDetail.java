package Example3;

public class EmployeeDetail {
int id;
String name;
EmployeeDetail(){
	System.out.println("Employee Infrormation");
}
EmployeeDetail(int id, String name){
	System.out.println(id+" "+name);
	
}

public static void empname(String name) {
	System.out.println("First Name:"+name);
}
public static void main(String args[]) {
	EmployeeDetail.empname("Anam");
	
	EmployeeDetail emp1=new EmployeeDetail();
	EmployeeDetail emp2=new EmployeeDetail(101, "Anam");
}
	
}


