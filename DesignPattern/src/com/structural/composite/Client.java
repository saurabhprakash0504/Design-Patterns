package com.structural.composite;

public class Client {

	public static void main(String[] args) {
		DeveloperLeaf d = new DeveloperLeaf("saurabh", 1000);
		DeveloperLeaf d1 = new DeveloperLeaf("saurabh1", 2000);
		CompanyComposite developerComponent = new CompanyComposite();
		developerComponent.add(d);
		developerComponent.add(d1);

		ManagerLeaf m1 = new ManagerLeaf("Thakur", 18);
		ManagerLeaf m2 = new ManagerLeaf("Thakur1", 181);
		CompanyComposite managerComponent = new CompanyComposite();
		managerComponent.add(m1);
		managerComponent.add(m2);

		CompanyComposite totalComponent = new CompanyComposite();
		totalComponent.add(developerComponent);
		totalComponent.add(managerComponent);
		
		//Client is hitting the component
		totalComponent.print();

	}

}
