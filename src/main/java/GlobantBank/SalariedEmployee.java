package GlobantBank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue(value="SE")
@Table(name = "salaried_employee")
@PrimaryKeyJoinColumn(name = "employee_dni")
public class SalariedEmployee extends Employee {
	@Column(name = "base_salary")
	protected double baseSalary;
	@Column(name = "bonus_salaried")
	protected int bonusSalaried;
	@Column(name = "antiquity")
	private int antiquity;
	@Column(name = "challenge")
	private int challenge;
	@Column(name = "extra_bonus")
	private int extraBonus;

	public SalariedEmployee() {

	}

	public SalariedEmployee(int dni, String firstName, String lastName, int dateOfBirth) {
		super(dni, firstName, lastName, dateOfBirth);

	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getBonussalaried() {
		return bonusSalaried ;
	}

	public void setBonusSalaried(int bonusSalaried) {
		this.bonusSalaried = bonusSalaried;
	}

	public int getAntiquity() {
		return antiquity ;
	}

	public void setAntiquity(int antiquity) {

		this.antiquity = antiquity;
	}

	public int getChallenge() {
		return  challenge *150;
	}

	public void setChallenge(int challenge) {
		this.challenge = challenge;
	}

	public int getExtraBonus() {
		return extraBonus;
	}

	public void setExtraBonus(int extraBonus) {
		this.extraBonus = extraBonus;
	}

	@Override
	public double getSalary() {
		salary = baseSalary +( baseSalary * antiquity )* bonusSalaried / 100 + extraBonus * getChallenge();
		return salary;

	}

}
