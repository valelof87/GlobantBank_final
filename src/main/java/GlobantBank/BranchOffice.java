package GlobantBank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "branch_office")
public class BranchOffice {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name= "idlocation")
	private int location;
	@Column(name = "address")
	private String address;
	@Column(name = "phone_number")
	private int phoneNumber;

	public BranchOffice() {
	}
	
	
	public BranchOffice(int location) {
		this.location = location;
	}


	public BranchOffice(int location, String adress, int phoneNumber) {
		this.location = location;
		this.address = adress;
		this.phoneNumber = phoneNumber;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public String getAdress() {
		return address;
	}

	public void setAdress(String adress) {
		this.address = adress;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "BranchOffice: location= " + location + ", adress= " + address + ", phoneNumber= " + phoneNumber;
	}

}
