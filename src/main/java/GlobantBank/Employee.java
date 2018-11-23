package GlobantBank;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(name="DIS", discriminatorType=DiscriminatorType.INTEGER)
public abstract class Employee  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dni")
	private int DNI;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "date_of_birth")
	private int dateOfBirth;
	@Column(name = "salary")
	protected double salary;
	

	public Employee(int dni, String firstName, String lastName, int dateOfBirth) {
		this.DNI = dni;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		
	}

	public Employee() {

	}

	public abstract double getSalary();

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}


	@Override
	public String toString() {
		return "Employee: DNI= " + DNI + ", firstName= " + firstName + ", lastName= " + lastName + ", dateOfBirth= "
				+ dateOfBirth ;
	}

}
