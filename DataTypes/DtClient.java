package DataTypes;

public class DtClient {
	
	private String name, dateCreated;
	
	//Constructor
	public DtClient(String name, String dateCreated) {
		this.name = name;
		this.dateCreated = dateCreated;
	}
	
	//Getters
	public String getName() {
		return this.name;
	}
	public String getDateCreated() {
		return this.dateCreated;
	}
}
