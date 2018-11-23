package GlobantBank;

import java.util.List;

public class Bank {

	private List<BranchOffice> branchOffices;

	private List<SalariedEmployee> salariedEmployees;

	private List<ContractorEmployee> contractorEmployees;

	public Bank() {

	}

	public Bank(List<BranchOffice> branchOffices, List<SalariedEmployee> salariedEmployees,
			List<ContractorEmployee> contractorEmployees) {
		this.branchOffices = branchOffices;
		this.salariedEmployees = salariedEmployees;
		this.contractorEmployees = contractorEmployees;
	}

	public List<BranchOffice> getBranchOffices() {
		return branchOffices;
	}

	public void setBranchOffices(List<BranchOffice> branchOffices) {
		this.branchOffices = branchOffices;
	}

	public List<SalariedEmployee> getSalariedEmployees() {
		return salariedEmployees;
	}

	public void setSalariedEmployees(List<SalariedEmployee> salariedEmployees) {
		this.salariedEmployees = salariedEmployees;
	}

	public List<ContractorEmployee> getContractorsEmployees() {
		return contractorEmployees;
	}

	public void setContractorsEmployees(List<ContractorEmployee> contractorsEmployees) {
		this.contractorEmployees = contractorsEmployees;
	}

	public void addBranchOffice(BranchOffice office) {// ADD BRANCH OFFICE

		branchOffices.add(office);
	}

	public void addsalariedEmployee(SalariedEmployee salariedEmployee) {// ADD SALARIED EMPLOYEE
		salariedEmployees.add(salariedEmployee);
	}

	public void addContractorEmployee(ContractorEmployee employee) {// ADD CONTRACTOR EMPLOYEE
		contractorEmployees.add(employee);
	}

	public void paySalaryContractor() {// PAY SALARY- Contractor
		for (ContractorEmployee emp : contractorEmployees) {
			emp.getSalary();
		}
	}

	public void paySalarySalaried() {// PAY SALARY- Salaried
		for (SalariedEmployee emp : salariedEmployees) {
			emp.getSalary();
		}
	}

	public int updateBonusSalaried(int bonusSalaried) {// UPDATE BONUS FOR SALARIED EMPLOYEES
		for (SalariedEmployee emp : salariedEmployees) {
			emp.setBonusSalaried(bonusSalaried);
		}
		return bonusSalaried;
	}

	public int updateBonusContractors(int bonusContracted) {// UPDATE BONUS FOR CONTRACTOR EMPLOYEES
		for (ContractorEmployee emp : contractorEmployees) {
			emp.setBonusContracted(bonusContracted);
		}
		return bonusContracted;
	}

	public double updateBaseSalary(double baseSalary) {// UPDATE BASE SALARY
		for (SalariedEmployee emp : salariedEmployees) {
			emp.setBaseSalary(baseSalary);
		}
		return baseSalary;
	}

	public double updateRatePerHour(double ratePerHour) {// UPDATE RATE PER HOUR
		for (ContractorEmployee emp : contractorEmployees) {
			emp.setRatePerHour(ratePerHour);
		}
		return ratePerHour;
	}
}
