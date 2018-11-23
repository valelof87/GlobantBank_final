package GlobantBank;

import javax.persistence.Column;
//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "employee_dni")
@Table(name = "contractor_employee")
//@DiscriminatorValue(value="SE")
public class ContractorEmployee extends Employee {
	@Column(name = "bonus_contractor")
	protected int bonusContracted;
	@Column(name = "rate_per_hour")
	protected double ratePerHour;
	@Column(name = "work_hour")
	private int workHours;
	@Column(name = "extrapayment")
	private double extraPayment;

	public ContractorEmployee(){
		
	}

	public ContractorEmployee(int dni, String firstName, String lastName, int dateOfBirth) {
		super(dni, firstName, lastName, dateOfBirth);
	}

	public int getBonusContracted() {
		return bonusContracted;
	}

	public void setBonusContracted(int bonusContracted) {
		this.bonusContracted = bonusContracted;
	}

	public double getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	
	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public double getExtraPayment() {
		if (workHours > 40) {
			 extraPayment = (workHours - 40) * ratePerHour * bonusContracted/ 100;
			 return extraPayment;
		}
		return 0;
	}

	public void setExtraPayment(double extraPayment) {
		this.extraPayment = extraPayment;
	}

	@Override
	public double getSalary() {
		salary = workHours * ratePerHour + getExtraPayment() ;
		return salary;
	}

}
