package core.crud.pojo;

import java.io.Serializable;

/**
 * <code>Employee</code> pojo class to store user input
 *
 * @author darshan.dalwadi
 */
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;

	private String name;

	private String city;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the address to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + city + "]";
	}

}
