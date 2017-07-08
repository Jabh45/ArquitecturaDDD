package application.dto;

import java.util.Set;

public class ItemDto {
	private String Code;
	private String Name;
	private String Description;
	private int Stock;
	private Set<ProviderDto> ProviderDto;
	
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
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public Set<ProviderDto> getProviderDto() {
		return ProviderDto;
	}
	public void setProviderDto(Set<ProviderDto> providerDto) {
		ProviderDto = providerDto;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}

	}
