package GlobantBank;

import java.util.ArrayList;
import java.util.List;

import javax.imageio.spi.ServiceRegistry;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class AppMain {
	

//	static User userObj;

	static Session sessionObj;

	static SessionFactory sessionFactoryObj;

	private static SessionFactory buildSessionFactory() {

		// Creating Configuration Instance & Passing Hibernate Configuration File

		Configuration configObj = new Configuration();

		 configObj.configure("persistence.xml");

		// Since Hibernate Version 4.x, ServiceRegistry Is Being Used

		StandardServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
				.applySettings(configObj.getProperties()).build();

		// Creating Hibernate SessionFactory Instance

		sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);

		return sessionFactoryObj;

	}

	public static void main(String[] args) {
		
	/*	List<SalariedEmployee> listSE = new ArrayList<SalariedEmployee>();
		List<ContractorEmployee> listCE = new ArrayList<ContractorEmployee>();
		List<BranchOffice> listBO = new ArrayList<BranchOffice>();
		
		SalariedEmployee se1= new SalariedEmployee(3030, "juan", "Lopez",12);
		SalariedEmployee se2= new SalariedEmployee(3031, "jose", "Perez", 10);
		
		Bank globantBank = new Bank(listBO,listSE,listCE);
		System.out.println(se1);
		System.out.println(se2);
		
		globantBank.updateBaseSalary(20000);
		globantBank.updateBonusSalaried(5);
		
		for(SalariedEmployee se: listSE) {
			System.out.println(se.getSalary());
		}
		
		globantBank.paySalarySalaried();*/
		
		

	System.out.println(".......Hibernate Maven Example.......\n");

		try {

			sessionObj = buildSessionFactory().openSession();

			sessionObj.beginTransaction();

			BranchOffice c = (BranchOffice) sessionObj.load(BranchOffice.class,1);

			System.out.println(c);
			
			Employee emp=  (Employee) sessionObj.get(Employee.class, 11111111);
			System.out.println(emp);
			
		} finally {

			if (sessionObj != null) {

				sessionObj.close();

			}

		}
		
		System.out.println(".......Hibernate Maven Example DONE.......\n");
	
		
	}

}
