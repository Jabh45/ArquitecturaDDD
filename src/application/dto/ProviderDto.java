package application.dto;

public class ProviderDto {
	private String Code;
	private String Name;
	private String Description;
	private ItemDto Item;

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
	public ItemDto getItem() {
		return Item;
	}
	public void setItem(ItemDto item) {
		Item = item;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
}
