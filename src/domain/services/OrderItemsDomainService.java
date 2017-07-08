package domain.services;

import domain.model.Item;

public class OrderItemsDomainService {
	public void performOrderItem(Item item, int cant)
			throws Exception {
		item.increaseStock(cant);
	}
}
