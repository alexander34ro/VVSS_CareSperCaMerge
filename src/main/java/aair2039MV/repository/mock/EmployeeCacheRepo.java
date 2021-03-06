package aair2039MV.repository.mock;

import java.util.ArrayList;
import java.util.List;

import aair2039MV.enumeration.DidacticFunction;
import aair2039MV.model.Employee;
import aair2039MV.repository.interfaces.EmployeeRepositoryInterface;
import aair2039MV.validator.EmployeeValidator;

public class EmployeeCacheRepo implements EmployeeRepositoryInterface {

	private List<Employee> employeeList;
	private EmployeeValidator employeeValidator;
	
	public EmployeeCacheRepo() {
		
		employeeValidator = new EmployeeValidator();
		employeeList = new ArrayList<Employee>();
		
		Employee Ionel   = new Employee("Pacura-ru", "1234567890876", DidacticFunction.ASSISTANT, 2500);
		Employee Mihai   = new Employee("Dumitrescu", "1234567890876", DidacticFunction.LECTURER, 20500);
		Employee Ionela  = new Employee("Ionescu", "2234567890876", DidacticFunction.LECTURER, 2500);
		Employee Mihaela = new Employee("Pacuraru", "8234567890876", DidacticFunction.ASSISTANT, 2500);
		Employee Vasile  = new Employee("Georgescu", "3234567890876", DidacticFunction.TEACHER,  25500);
		Employee Marin   = new Employee("Puscas", "1234567890876", DidacticFunction.TEACHER,  2500);
		
		employeeList.add( Ionel );
		employeeList.add( Mihai );
		employeeList.add( Ionela );
		employeeList.add( Mihaela );
		employeeList.add( Vasile );
		employeeList.add( Marin );
	}
	
	@Override
	public boolean addEmployee(Employee employee) {
		if ( employeeValidator.isValid(employee)) {
			employeeList.add(employee);
			return true;
		}
		return false;
	}
	
	@Override
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
	}

	@Override
	public void modifyEmployee(Employee oldEmployee, Employee newEmployee) {
		// TODO Auto-generated method stub
		oldEmployee.setDidacticFunction(newEmployee.getDidacticFunction());
	}

	@Override
	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	@Override
	public List<Employee> getEmployeeByCriteria(String criteria) {
		// TODO Auto-generated method stub
		return null;
	}

}
