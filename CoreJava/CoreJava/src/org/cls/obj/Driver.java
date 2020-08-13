package org.cls.obj;

public class Driver {
	
	String licenseNo, fullName, address;
	int age;
	
	public Driver() 
	{
		System.out.println("New Object is create !!");
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public String getFullName() {
		return fullName;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	private void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	private void setFullName(String fullName) {
		this.fullName = fullName;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	private void setAge(int age) {
		this.age = age;
	}
	
	public void setAllValues(String licenseNo, String fullName, String address, int age)
	{
		this.setLicenseNo(licenseNo);
		this.setFullName(fullName);
		this.setAddress(address);
		this.setAge(age);
	}
}
