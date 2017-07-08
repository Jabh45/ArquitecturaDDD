package domain.model;

import java.util.Set;

import domain.exception.InvalidCantException;

public class Item {
	private String Name;
	private String Description;
	private int Stock;
	private Set<Provider> Provider;
	
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
	public Set<Provider> getProvider() {
		return Provider;
	}
	public void setProvider(Set<Provider> provider) {
		Provider = provider;
	}
	public void increaseStock(int cant) {
		this.validateStock(cant);
        this.Stock = this.Stock + cant;
	}

	private void validateStock(int cant) throws InvalidCantException {
		if (cant <= 0) {
            throw new InvalidCantException();
        }
		
	}
}
