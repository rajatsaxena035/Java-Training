package org.hibernate;
// Generated Oct 1, 2018, 4:25:56 PM by Hibernate Tools 5.3.1.Final

/**
 * EmployeeId generated by hbm2java
 */
public class EmployeeId implements java.io.Serializable {

	private Integer employeeId;
	private String name;

	public EmployeeId() {
	}

	public EmployeeId(Integer employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EmployeeId))
			return false;
		EmployeeId castOther = (EmployeeId) other;

		return ((this.getEmployeeId() == castOther.getEmployeeId()) || (this.getEmployeeId() != null
				&& castOther.getEmployeeId() != null && this.getEmployeeId().equals(castOther.getEmployeeId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEmployeeId() == null ? 0 : this.getEmployeeId().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		return result;
	}

}
