package domain.model;

public class Provider {
	private String Name;
	private String Description;
	private Item Item;

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Item getItem() {
		return Item;
	}
	public void setItem(Item item) {
		Item = item;
	}

}
