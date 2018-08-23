package com.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyComposite implements EmployeeComponent {
	//this is important ::: forming a list
	List<EmployeeComponent> employeeList = new ArrayList<>();

	void add(EmployeeComponent employeeComponent) {
		employeeList.add(employeeComponent);
	}

	void remove(EmployeeComponent employeeComponent) {
		employeeList.remove(employeeComponent);
	}

	@Override
	public void print() {
		for (EmployeeComponent employeeComponent : employeeList) {
			employeeComponent.print();
		}

	}
}
