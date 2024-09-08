package hw08Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("John Doe");
        employee.setAge(30);
        employee.setSex('M');
        employee.setCitizen("USA");
        
        
        
        System.out.println("Employee Information:"  +  "\nName: " +employee.getName() +
        "\nAge: " + employee.getAge() +"\nSex: " + employee.getSex() + "\nCitizen: " + employee.getCitizen());
		

	}

}
