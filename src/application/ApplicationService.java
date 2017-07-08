package application;

import application.dto.ItemDto;
import domain.model.Item;
import domain.repository.ItemRepository;
import domain.services.OrderItemsDomainService;

public class ApplicationService {
	
	private ItemRepository itemRepository;
	private OrderItemsDomainService orderItemsDomainService;

	public void performTransfer(ItemDto itemDto, int cant) throws Exception {
		Item item = this.itemRepository.findByCode(itemDto.getCode());
		this.orderItemsDomainService.performOrderItem(item, cant);
		this.itemRepository.save(item);
	}
}
