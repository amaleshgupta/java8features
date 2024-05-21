package streamapi;

import java.util.List;

public class Flatmap {
	
	private String name;
	private List<String> items;
	
	public Flatmap(String name, List<String> items) {
		super();
		this.name = name;
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public List<String> getItems() {
		return items;
	}

}
